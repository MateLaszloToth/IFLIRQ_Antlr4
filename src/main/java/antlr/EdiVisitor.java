// Generated from Edi.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EdiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EdiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EdiParser#edi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdi(EdiParser.EdiContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#ediObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdiObject(EdiParser.EdiObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#interchangeHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterchangeHeader(EdiParser.InterchangeHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(EdiParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(EdiParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#sender}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSender(EdiParser.SenderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#recipient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipient(EdiParser.RecipientContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#preparation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparation(EdiParser.PreparationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#controlReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlReference(EdiParser.ControlReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriority(EdiParser.PriorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#versionNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersionNumber(EdiParser.VersionNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(EdiParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(EdiParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(EdiParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#messageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageHeader(EdiParser.MessageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#messageReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageReference(EdiParser.MessageReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#messageType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageType(EdiParser.MessageTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(EdiParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#releaseNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseNumber(EdiParser.ReleaseNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#controllingAgency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControllingAgency(EdiParser.ControllingAgencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#requestOriginator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequestOriginator(EdiParser.RequestOriginatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#deliverySystemParty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeliverySystemParty(EdiParser.DeliverySystemPartyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#agent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgent(EdiParser.AgentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#locationDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationDetails(EdiParser.LocationDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#countryCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountryCode(EdiParser.CountryCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#currencyCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrencyCode(EdiParser.CurrencyCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#languageCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguageCode(EdiParser.LanguageCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#accessAuthorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessAuthorization(EdiParser.AccessAuthorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#flightDetails}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlightDetails(EdiParser.FlightDetailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#airline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirline(EdiParser.AirlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#flight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlight(EdiParser.FlightContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#departure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeparture(EdiParser.DepartureContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#segmentStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentStatus(EdiParser.SegmentStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#grabTheLockFlag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrabTheLockFlag(EdiParser.GrabTheLockFlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#statusIndicator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatusIndicator(EdiParser.StatusIndicatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(EdiParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#messageTrailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageTrailer(EdiParser.MessageTrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#messageControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageControl(EdiParser.MessageControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#interchangeTrailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterchangeTrailer(EdiParser.InterchangeTrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EdiParser#interchangeControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterchangeControl(EdiParser.InterchangeControlContext ctx);
}