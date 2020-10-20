package antlr.visitors;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.dataClasses.EdiObject;
import antlr.dataClasses.common.Code;
import antlr.dataClasses.flightDetails.Airline;
import antlr.dataClasses.flightDetails.Departure;
import antlr.dataClasses.flightDetails.Flight;
import antlr.dataClasses.flightDetails.FlightDetails;
import antlr.dataClasses.interchangeHeader.InterchangeHeader;
import antlr.dataClasses.interchangeHeader.controlReference.ControlReference;
import antlr.dataClasses.interchangeHeader.controlReference.id.Id;
import antlr.dataClasses.interchangeHeader.preparation.Preparation;
import antlr.dataClasses.interchangeHeader.priority.Priority;
import antlr.dataClasses.interchangeHeader.recipient.Recipient;
import antlr.dataClasses.interchangeHeader.sender.Sender;
import antlr.dataClasses.interchangeHeader.syntax.Syntax;
import antlr.dataClasses.common.VersionNumber;
import antlr.dataClasses.interchangeTrailer.InterchangeControl;
import antlr.dataClasses.interchangeTrailer.InterchangeTrailer;
import antlr.dataClasses.messageHeader.MessageHeader;
import antlr.dataClasses.common.MessageReference;
import antlr.dataClasses.messageHeader.messageType.ControllingAgency;
import antlr.dataClasses.messageHeader.messageType.MessageType;
import antlr.dataClasses.messageHeader.messageType.Name;
import antlr.dataClasses.messageHeader.messageType.ReleaseNumber;
import antlr.dataClasses.messageTrailer.MessageControl;
import antlr.dataClasses.messageTrailer.MessageTrailer;
import antlr.dataClasses.requestOriginator.AccessAuthorization;
import antlr.dataClasses.requestOriginator.Agent;
import antlr.dataClasses.requestOriginator.DeliverySystemParty;
import antlr.dataClasses.requestOriginator.RequestOriginator;
import antlr.dataClasses.requestOriginator.locationDetails.CountryCode;
import antlr.dataClasses.requestOriginator.locationDetails.CurrencyCode;
import antlr.dataClasses.requestOriginator.locationDetails.LanguageCode;
import antlr.dataClasses.requestOriginator.locationDetails.LocationDetails;
import antlr.dataClasses.segmentStatus.SegmentStatus;
import antlr.dataClasses.segmentStatus.grabTheLockValue.GrabTheLockFlag;
import antlr.dataClasses.segmentStatus.grabTheLockValue.StatusIndicator;
import antlr.dataClasses.segmentStatus.grabTheLockValue.Value;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;


public class MyEdiBaseVisitor extends EdiBaseVisitor {

    @Override
    public EdiObject visitEdi(EdiParser.EdiContext ctx) {
        return visitEdiObject(ctx.ediObject());
    }

    @Override
    public EdiObject visitEdiObject(EdiParser.EdiObjectContext ctx) {
        InterchangeHeader interchangeHeader = null;
        MessageHeader messageHeader = null;
        RequestOriginator requestOriginator = null;
        FlightDetails flightDetails = null;
        SegmentStatus segmentStatus = null;
        MessageTrailer messageTrailer = null;
        InterchangeTrailer interchangeTrailer = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.InterchangeHeaderContext) {
                interchangeHeader = visitInterchangeHeader(ctx.interchangeHeader());
            } else if (child instanceof EdiParser.MessageHeaderContext) {
                messageHeader = visitMessageHeader(ctx.messageHeader());
            } else if (child instanceof EdiParser.RequestOriginatorContext) {
                requestOriginator =  visitRequestOriginator(ctx.requestOriginator());
            } else if (child instanceof EdiParser.FlightDetailsContext) {
                flightDetails = visitFlightDetails(ctx.flightDetails());
            } else if (child instanceof EdiParser.SegmentStatusContext) {
                segmentStatus = visitSegmentStatus(ctx.segmentStatus());
            } else if (child instanceof EdiParser.MessageTrailerContext) {
                messageTrailer = visitMessageTrailer(ctx.messageTrailer());
            } else if (child instanceof EdiParser.InterchangeTrailerContext) {
                interchangeTrailer = visitInterchangeTrailer(ctx.interchangeTrailer());
            } else {
                System.out.println("Unexpected children of EdiObject.");
            }

        }
        return new EdiObject(
                interchangeHeader,
                messageHeader,
                requestOriginator,
                flightDetails,
                segmentStatus,
                messageTrailer,
                interchangeTrailer
                );
    }

    @Override
    public InterchangeTrailer visitInterchangeTrailer(EdiParser.InterchangeTrailerContext ctx) {
        InterchangeControl interchangeControl = null;
        ControlReference controlReference = null;

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.InterchangeControlContext) {
                interchangeControl = visitInterchangeControl(ctx.interchangeControl());
            } else if(child instanceof EdiParser.ControlReferenceContext) {
                controlReference = visitControlReference(ctx.controlReference());
            }
        }

        return new InterchangeTrailer(interchangeControl, controlReference);
    }

    @Override
    public InterchangeControl visitInterchangeControl(EdiParser.InterchangeControlContext ctx) {
        return new InterchangeControl(ctx.getText());
    }

    @Override
    public MessageTrailer visitMessageTrailer(EdiParser.MessageTrailerContext ctx) {
        MessageControl messageControl = null;
        MessageReference messageReference = null;

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.MessageControlContext) {
                messageControl = visitMessageControl(ctx.messageControl());
            } else if(child instanceof EdiParser.MessageReferenceContext) {
                messageReference = visitMessageReference(ctx.messageReference());
            } else if (child instanceof TerminalNodeImpl) {
                continue;
            } else {
                System.out.println("Unexpected children of MessageTrailer");
            }
        }

        return new MessageTrailer(messageControl, messageReference);
    }

    @Override
    public MessageControl visitMessageControl(EdiParser.MessageControlContext ctx) {
        return new MessageControl(ctx.getText());
    }

    @Override
    public SegmentStatus visitSegmentStatus(EdiParser.SegmentStatusContext ctx) {
        return new SegmentStatus(visitGrabTheLockFlag(ctx.grabTheLockFlag()));
    }

    @Override
    public GrabTheLockFlag visitGrabTheLockFlag(EdiParser.GrabTheLockFlagContext ctx) {
        StatusIndicator statusIndicator = null;
        Value value = null;

        for(int i = 0; i < ctx.getChildCount(); i++){
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.StatusIndicatorContext){
                statusIndicator = visitStatusIndicator(ctx.statusIndicator());
            } else if(child instanceof EdiParser.ValueContext) {
                value = visitValue(ctx.value());
            } else {
                System.out.println("Unexpected children of GrabTheLockFloag");
            }
        }

        return new GrabTheLockFlag(statusIndicator, value);
    }

    @Override
    public StatusIndicator visitStatusIndicator(EdiParser.StatusIndicatorContext ctx) {
        return new StatusIndicator(ctx.getText());
    }

    @Override
    public Value visitValue(EdiParser.ValueContext ctx) {
        return new Value(ctx.getText());
    }

    @Override
    public FlightDetails visitFlightDetails(EdiParser.FlightDetailsContext ctx) {
        Airline airline = null;
        Flight flight = null;
        Departure departure = null;

        for(int i = 0; i < ctx.getChildCount(); i++){
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.AirlineContext) {
                airline = visitAirline(ctx.airline());
            } else if(child instanceof EdiParser.FlightContext) {
                flight = visitFlight(ctx.flight());
            } else if(child instanceof EdiParser.DepartureContext) {
                departure = visitDeparture(ctx.departure());
            } else if (child instanceof TerminalNodeImpl) {
                continue;
            } else {
                System.out.println("Unexpected children of FlightDetails");
            }
        }
        return new FlightDetails(airline, flight, departure);
    }

    @Override
    public Airline visitAirline(EdiParser.AirlineContext ctx) {
        return new Airline(visitCode(ctx.code()));
    }

    @Override
    public Flight visitFlight(EdiParser.FlightContext ctx) {
        return new Flight(ctx.getText());
    }

    @Override
    public Departure visitDeparture(EdiParser.DepartureContext ctx) {
        return new Departure(ctx.getText());
    }

    @Override
    public RequestOriginator visitRequestOriginator(EdiParser.RequestOriginatorContext ctx) {
        DeliverySystemParty deliverySystemParty = null;
        Agent agent = null;
        LocationDetails locationDetails = null;
        AccessAuthorization accessAuthorization = null;

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.DeliverySystemPartyContext) {
                deliverySystemParty = visitDeliverySystemParty(ctx.deliverySystemParty());
            } else if(child instanceof EdiParser.AgentContext) {
                agent = visitAgent(ctx.agent());
            } else if(child instanceof EdiParser.LocationDetailsContext) {
                locationDetails = visitLocationDetails(ctx.locationDetails());
            } else if(child instanceof EdiParser.AccessAuthorizationContext) {
                accessAuthorization = visitAccessAuthorization(ctx.accessAuthorization());
            } else if (child instanceof TerminalNodeImpl) {
                continue;
            } else {
                System.out.println("Unexpected children of RequestOriginator.");
            }
        }

        return new RequestOriginator(deliverySystemParty, agent, locationDetails, accessAuthorization);
    }

    @Override
    public AccessAuthorization visitAccessAuthorization(EdiParser.AccessAuthorizationContext ctx) {
        return new AccessAuthorization(visitCode(ctx.code()));
    }

    @Override
    public LocationDetails visitLocationDetails(EdiParser.LocationDetailsContext ctx) {
        CountryCode countryCode = null;
        CurrencyCode currencyCode = null;
        LanguageCode languageCode = null;

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.CountryCodeContext) {
                countryCode = visitCountryCode(ctx.countryCode());
            } else if (child instanceof EdiParser.CurrencyCodeContext) {
                currencyCode = visitCurrencyCode(ctx.currencyCode());
            } else if (child instanceof EdiParser.LanguageCodeContext) {
                languageCode = visitLanguageCode(ctx.languageCode());
            } else {
                System.out.println("Unexpected children of LocationDetails.");
            }
        }

        return new LocationDetails(countryCode, currencyCode, languageCode);
    }

    @Override
    public LanguageCode visitLanguageCode(EdiParser.LanguageCodeContext ctx) {
        return new LanguageCode(ctx.getText());
    }

    @Override
    public CurrencyCode visitCurrencyCode(EdiParser.CurrencyCodeContext ctx) {
        return new CurrencyCode(ctx.getText());
    }

    @Override
    public CountryCode visitCountryCode(EdiParser.CountryCodeContext ctx) {
        return new CountryCode(ctx.getText());
    }

    @Override
    public Agent visitAgent(EdiParser.AgentContext ctx) {
        return new Agent(visitId(ctx.id()));
    }

    @Override
    public DeliverySystemParty visitDeliverySystemParty(EdiParser.DeliverySystemPartyContext ctx) {
        return new DeliverySystemParty(visitCode(ctx.code()));
    }

    @Override
    public InterchangeHeader visitInterchangeHeader(EdiParser.InterchangeHeaderContext ctx) {
        Syntax syntax = null;
        Sender sender = null;
        Recipient recipient = null;
        Preparation preparation = null;
        ControlReference controlReference = null;
        Priority priority = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.SyntaxContext) {
                syntax = visitSyntax(ctx.syntax());
            } else if (child instanceof EdiParser.SenderContext) {
                sender = visitSender(ctx.sender());
            } else if (child instanceof EdiParser.RecipientContext) {
                recipient = visitRecipient(ctx.recipient());
            } else if (child instanceof EdiParser.PreparationContext) {
                preparation = visitPreparation(ctx.preparation());
            } else if (child instanceof EdiParser.ControlReferenceContext) {
                controlReference = visitControlReference(ctx.controlReference());
            } else if (child instanceof EdiParser.PriorityContext) {
                priority = visitPriority(ctx.priority());
            } else if (child instanceof TerminalNodeImpl) {
                continue;
            } else {
                System.out.println("Unexpected children of EdiObject.");
            }
        }

        return new InterchangeHeader(syntax, sender, recipient, preparation, controlReference, priority);
    }

    @Override
    public MessageHeader visitMessageHeader(EdiParser.MessageHeaderContext ctx) {
        MessageReference messageReference = null;
        MessageType messageType = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.MessageReferenceContext) {
                messageReference = visitMessageReference(ctx.messageReference());
            } else if (child instanceof EdiParser.MessageTypeContext) {
                messageType = visitMessageType(ctx.messageType());
            } else {
                System.out.println("Unexpected child of MessageHeader");
            }
        }

        return new MessageHeader(messageReference, messageType);
    }

    @Override
    public MessageType visitMessageType(EdiParser.MessageTypeContext ctx) {
        Name name = null;
        VersionNumber versionNumber = null;
        ReleaseNumber releaseNumber = null;
        ControllingAgency controllingAgency = null;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.NameContext) {
                name = visitName(ctx.name());
            } else if(child instanceof EdiParser.VersionNumberContext) {
                versionNumber = visitVersionNumber(ctx.versionNumber());
            } else if(child instanceof EdiParser.ReleaseNumberContext) {
                releaseNumber = visitReleaseNumber(ctx.releaseNumber());
            } else if(child instanceof EdiParser.ControllingAgencyContext) {
                controllingAgency = visitControllingAgency(ctx.controllingAgency());
            } else {
                System.out.println("Unexpected child of MessageType");
            }
        }

        return new MessageType(name, versionNumber, releaseNumber, controllingAgency);
    }

    @Override
    public ControllingAgency visitControllingAgency(EdiParser.ControllingAgencyContext ctx) {
        return new ControllingAgency(visitId(ctx.id()));
    }

    @Override
    public ReleaseNumber visitReleaseNumber(EdiParser.ReleaseNumberContext ctx) {
        return new ReleaseNumber(ctx.getText());
    }

    @Override
    public Name visitName(EdiParser.NameContext ctx) {
        return new Name(ctx.getText());
    }

    @Override
    public MessageReference visitMessageReference(EdiParser.MessageReferenceContext ctx) {
        return new MessageReference(ctx.getText());
    }

    @Override
    public Syntax visitSyntax(EdiParser.SyntaxContext ctx) {
        Id id = null;
        VersionNumber versionNumber = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.IdContext) {
                id = visitId(ctx.id());
            } else if (child instanceof EdiParser.VersionNumberContext) {
                versionNumber = visitVersionNumber(ctx.versionNumber());
            } else {
                System.out.println("Unexpected child of ControlReference");
            }
        }
        assert id != null : "id is null";
        assert versionNumber != null : "common is null";
        return new Syntax(id, versionNumber);
    }

    @Override
    public Sender visitSender(EdiParser.SenderContext ctx) {
        return new Sender(visitId(ctx.id()));
    }

    @Override
    public Recipient visitRecipient(EdiParser.RecipientContext ctx) {
        return new Recipient(visitId(ctx.id()));
    }

    @Override
    public Preparation visitPreparation(EdiParser.PreparationContext ctx) {
        return new Preparation(ctx.date().getText(),ctx.time().getText());
    }

    @Override
    public ControlReference visitControlReference(EdiParser.ControlReferenceContext ctx) {
        Id id = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.IdContext) {

                id = visitId(ctx.id());
            } else {
                System.out.println("Unexpected child of ControlReference");
            }
        }
        assert id != null;
        return new ControlReference(id);
    }

    @Override
    public Priority visitPriority(EdiParser.PriorityContext ctx) {
        return new Priority(visitCode(ctx.code()));
    }

    @Override
    public Code visitCode(EdiParser.CodeContext ctx) {
        return new Code(ctx.getText());
    }

    @Override
    public Id visitId(EdiParser.IdContext ctx) {
        return new Id(ctx.getText());
    }

    @Override
    public VersionNumber visitVersionNumber(EdiParser.VersionNumberContext ctx) {
        return new VersionNumber(ctx.getText());
    }

}
