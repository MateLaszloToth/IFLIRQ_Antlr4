package antlr.dataClasses;


import antlr.dataClasses.flightDetails.FlightDetails;
import antlr.dataClasses.interchangeHeader.InterchangeHeader;
import antlr.dataClasses.interchangeTrailer.InterchangeTrailer;
import antlr.dataClasses.messageHeader.MessageHeader;
import antlr.dataClasses.messageTrailer.MessageTrailer;
import antlr.dataClasses.requestOriginator.RequestOriginator;
import antlr.dataClasses.segmentStatus.SegmentStatus;

public class EdiObject {

    public InterchangeHeader interchangeHeader;
    public MessageHeader messageHeader;
    public RequestOriginator requestOriginator;
    public FlightDetails flightDetails;
    public SegmentStatus segmentStatus;
    public MessageTrailer messageTrailer;
    public InterchangeTrailer interchangeTrailer;


    public EdiObject(
            InterchangeHeader interchangeHeader,
            MessageHeader messageHeader,
            RequestOriginator requestOriginator,
            FlightDetails flightDetails,
            SegmentStatus segmentStatus,
            MessageTrailer messageTrailer,
            InterchangeTrailer interchangeTrailer
    ){
        this.interchangeHeader = interchangeHeader;
        this.messageHeader = messageHeader;
        this.requestOriginator = requestOriginator;
        this.flightDetails = flightDetails;
        this.segmentStatus = segmentStatus;
        this.messageTrailer = messageTrailer;
        this.interchangeTrailer = interchangeTrailer;
    }
}
