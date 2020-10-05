// Generated from Edi.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EdiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WORD=8, INTEGER=9, 
		ID=10, WS=11, SEPARATOR_SKIP=12;
	public static final int
		RULE_edi = 0, RULE_ediObject = 1, RULE_interchangeHeader = 2, RULE_syntax = 3, 
		RULE_id = 4, RULE_sender = 5, RULE_recipient = 6, RULE_preparation = 7, 
		RULE_controlReference = 8, RULE_priority = 9, RULE_versionNumber = 10, 
		RULE_date = 11, RULE_time = 12, RULE_code = 13, RULE_messageHeader = 14, 
		RULE_messageReference = 15, RULE_messageType = 16, RULE_name = 17, RULE_releaseNumber = 18, 
		RULE_controllingAgency = 19, RULE_requestOriginator = 20, RULE_deliverySystemParty = 21, 
		RULE_agent = 22, RULE_locationDetails = 23, RULE_countryCode = 24, RULE_currencyCode = 25, 
		RULE_languageCode = 26, RULE_accessAuthorization = 27, RULE_flightDetails = 28, 
		RULE_airline = 29, RULE_flight = 30, RULE_departure = 31, RULE_segmentStatus = 32, 
		RULE_grabTheLockFlag = 33, RULE_statusIndicator = 34, RULE_value = 35, 
		RULE_messageTrailer = 36, RULE_messageControl = 37, RULE_interchangeTrailer = 38, 
		RULE_interchangeControl = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"edi", "ediObject", "interchangeHeader", "syntax", "id", "sender", "recipient", 
			"preparation", "controlReference", "priority", "versionNumber", "date", 
			"time", "code", "messageHeader", "messageReference", "messageType", "name", 
			"releaseNumber", "controllingAgency", "requestOriginator", "deliverySystemParty", 
			"agent", "locationDetails", "countryCode", "currencyCode", "languageCode", 
			"accessAuthorization", "flightDetails", "airline", "flight", "departure", 
			"segmentStatus", "grabTheLockFlag", "statusIndicator", "value", "messageTrailer", 
			"messageControl", "interchangeTrailer", "interchangeControl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'UNB'", "'UNH'", "'ORG'", "'FDQ'", "'STX'", "'UNT'", "'UNZ'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WORD", "INTEGER", "ID", 
			"WS", "SEPARATOR_SKIP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Edi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EdiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EdiContext extends ParserRuleContext {
		public EdiObjectContext ediObject() {
			return getRuleContext(EdiObjectContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EdiParser.EOF, 0); }
		public EdiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitEdi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdiContext edi() throws RecognitionException {
		EdiContext _localctx = new EdiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_edi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			ediObject();
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdiObjectContext extends ParserRuleContext {
		public InterchangeHeaderContext interchangeHeader() {
			return getRuleContext(InterchangeHeaderContext.class,0);
		}
		public MessageHeaderContext messageHeader() {
			return getRuleContext(MessageHeaderContext.class,0);
		}
		public RequestOriginatorContext requestOriginator() {
			return getRuleContext(RequestOriginatorContext.class,0);
		}
		public FlightDetailsContext flightDetails() {
			return getRuleContext(FlightDetailsContext.class,0);
		}
		public SegmentStatusContext segmentStatus() {
			return getRuleContext(SegmentStatusContext.class,0);
		}
		public MessageTrailerContext messageTrailer() {
			return getRuleContext(MessageTrailerContext.class,0);
		}
		public InterchangeTrailerContext interchangeTrailer() {
			return getRuleContext(InterchangeTrailerContext.class,0);
		}
		public EdiObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ediObject; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitEdiObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdiObjectContext ediObject() throws RecognitionException {
		EdiObjectContext _localctx = new EdiObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ediObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			interchangeHeader();
			setState(84);
			messageHeader();
			setState(85);
			requestOriginator();
			setState(86);
			flightDetails();
			setState(87);
			segmentStatus();
			setState(88);
			messageTrailer();
			setState(89);
			interchangeTrailer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterchangeHeaderContext extends ParserRuleContext {
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public SenderContext sender() {
			return getRuleContext(SenderContext.class,0);
		}
		public RecipientContext recipient() {
			return getRuleContext(RecipientContext.class,0);
		}
		public PreparationContext preparation() {
			return getRuleContext(PreparationContext.class,0);
		}
		public ControlReferenceContext controlReference() {
			return getRuleContext(ControlReferenceContext.class,0);
		}
		public PriorityContext priority() {
			return getRuleContext(PriorityContext.class,0);
		}
		public InterchangeHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interchangeHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitInterchangeHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterchangeHeaderContext interchangeHeader() throws RecognitionException {
		InterchangeHeaderContext _localctx = new InterchangeHeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interchangeHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			syntax();
			setState(93);
			sender();
			setState(94);
			recipient();
			setState(95);
			preparation();
			setState(96);
			controlReference();
			setState(97);
			priority();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			id();
			setState(100);
			versionNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EdiParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenderContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sender; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitSender(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenderContext sender() throws RecognitionException {
		SenderContext _localctx = new SenderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sender);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecipientContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RecipientContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recipient; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitRecipient(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecipientContext recipient() throws RecognitionException {
		RecipientContext _localctx = new RecipientContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recipient);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreparationContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PreparationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitPreparation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreparationContext preparation() throws RecognitionException {
		PreparationContext _localctx = new PreparationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_preparation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			date();
			setState(109);
			time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlReferenceContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ControlReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitControlReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlReferenceContext controlReference() throws RecognitionException {
		ControlReferenceContext _localctx = new ControlReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_controlReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PriorityContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public PriorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriorityContext priority() throws RecognitionException {
		PriorityContext _localctx = new PriorityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public VersionNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitVersionNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionNumberContext versionNumber() throws RecognitionException {
		VersionNumberContext _localctx = new VersionNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_versionNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EdiParser.ID, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageHeaderContext extends ParserRuleContext {
		public MessageReferenceContext messageReference() {
			return getRuleContext(MessageReferenceContext.class,0);
		}
		public MessageTypeContext messageType() {
			return getRuleContext(MessageTypeContext.class,0);
		}
		public MessageHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitMessageHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageHeaderContext messageHeader() throws RecognitionException {
		MessageHeaderContext _localctx = new MessageHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_messageHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(124);
			messageReference();
			setState(125);
			messageType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageReferenceContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public MessageReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitMessageReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageReferenceContext messageReference() throws RecognitionException {
		MessageReferenceContext _localctx = new MessageReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageTypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public ReleaseNumberContext releaseNumber() {
			return getRuleContext(ReleaseNumberContext.class,0);
		}
		public ControllingAgencyContext controllingAgency() {
			return getRuleContext(ControllingAgencyContext.class,0);
		}
		public MessageTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitMessageType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageTypeContext messageType() throws RecognitionException {
		MessageTypeContext _localctx = new MessageTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_messageType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			name();
			setState(130);
			versionNumber();
			setState(131);
			releaseNumber();
			setState(132);
			controllingAgency();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EdiParser.WORD, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReleaseNumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public ReleaseNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_releaseNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitReleaseNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReleaseNumberContext releaseNumber() throws RecognitionException {
		ReleaseNumberContext _localctx = new ReleaseNumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_releaseNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControllingAgencyContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ControllingAgencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controllingAgency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitControllingAgency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllingAgencyContext controllingAgency() throws RecognitionException {
		ControllingAgencyContext _localctx = new ControllingAgencyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_controllingAgency);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequestOriginatorContext extends ParserRuleContext {
		public DeliverySystemPartyContext deliverySystemParty() {
			return getRuleContext(DeliverySystemPartyContext.class,0);
		}
		public AgentContext agent() {
			return getRuleContext(AgentContext.class,0);
		}
		public LocationDetailsContext locationDetails() {
			return getRuleContext(LocationDetailsContext.class,0);
		}
		public AccessAuthorizationContext accessAuthorization() {
			return getRuleContext(AccessAuthorizationContext.class,0);
		}
		public RequestOriginatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestOriginator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitRequestOriginator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequestOriginatorContext requestOriginator() throws RecognitionException {
		RequestOriginatorContext _localctx = new RequestOriginatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_requestOriginator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__2);
			setState(141);
			deliverySystemParty();
			setState(142);
			agent();
			setState(143);
			locationDetails();
			setState(144);
			accessAuthorization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeliverySystemPartyContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public DeliverySystemPartyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deliverySystemParty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitDeliverySystemParty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeliverySystemPartyContext deliverySystemParty() throws RecognitionException {
		DeliverySystemPartyContext _localctx = new DeliverySystemPartyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_deliverySystemParty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AgentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitAgent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AgentContext agent() throws RecognitionException {
		AgentContext _localctx = new AgentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_agent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationDetailsContext extends ParserRuleContext {
		public CountryCodeContext countryCode() {
			return getRuleContext(CountryCodeContext.class,0);
		}
		public CurrencyCodeContext currencyCode() {
			return getRuleContext(CurrencyCodeContext.class,0);
		}
		public LanguageCodeContext languageCode() {
			return getRuleContext(LanguageCodeContext.class,0);
		}
		public LocationDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationDetails; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitLocationDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationDetailsContext locationDetails() throws RecognitionException {
		LocationDetailsContext _localctx = new LocationDetailsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_locationDetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			countryCode();
			setState(151);
			currencyCode();
			setState(152);
			languageCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountryCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EdiParser.WORD, 0); }
		public CountryCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countryCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitCountryCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountryCodeContext countryCode() throws RecognitionException {
		CountryCodeContext _localctx = new CountryCodeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_countryCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrencyCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EdiParser.WORD, 0); }
		public CurrencyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currencyCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitCurrencyCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurrencyCodeContext currencyCode() throws RecognitionException {
		CurrencyCodeContext _localctx = new CurrencyCodeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_currencyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageCodeContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EdiParser.WORD, 0); }
		public LanguageCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitLanguageCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageCodeContext languageCode() throws RecognitionException {
		LanguageCodeContext _localctx = new LanguageCodeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_languageCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessAuthorizationContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public AccessAuthorizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessAuthorization; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitAccessAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessAuthorizationContext accessAuthorization() throws RecognitionException {
		AccessAuthorizationContext _localctx = new AccessAuthorizationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_accessAuthorization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlightDetailsContext extends ParserRuleContext {
		public AirlineContext airline() {
			return getRuleContext(AirlineContext.class,0);
		}
		public FlightContext flight() {
			return getRuleContext(FlightContext.class,0);
		}
		public DepartureContext departure() {
			return getRuleContext(DepartureContext.class,0);
		}
		public FlightDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flightDetails; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitFlightDetails(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightDetailsContext flightDetails() throws RecognitionException {
		FlightDetailsContext _localctx = new FlightDetailsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_flightDetails);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__3);
			setState(163);
			airline();
			setState(164);
			flight();
			setState(165);
			departure();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AirlineContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public AirlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_airline; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitAirline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AirlineContext airline() throws RecognitionException {
		AirlineContext _localctx = new AirlineContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_airline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlightContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public FlightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitFlight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlightContext flight() throws RecognitionException {
		FlightContext _localctx = new FlightContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_flight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepartureContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public DepartureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitDeparture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DepartureContext departure() throws RecognitionException {
		DepartureContext _localctx = new DepartureContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_departure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentStatusContext extends ParserRuleContext {
		public GrabTheLockFlagContext grabTheLockFlag() {
			return getRuleContext(GrabTheLockFlagContext.class,0);
		}
		public SegmentStatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segmentStatus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitSegmentStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentStatusContext segmentStatus() throws RecognitionException {
		SegmentStatusContext _localctx = new SegmentStatusContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_segmentStatus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__4);
			setState(174);
			grabTheLockFlag();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrabTheLockFlagContext extends ParserRuleContext {
		public StatusIndicatorContext statusIndicator() {
			return getRuleContext(StatusIndicatorContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public GrabTheLockFlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grabTheLockFlag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitGrabTheLockFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrabTheLockFlagContext grabTheLockFlag() throws RecognitionException {
		GrabTheLockFlagContext _localctx = new GrabTheLockFlagContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_grabTheLockFlag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			statusIndicator();
			setState(177);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatusIndicatorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(EdiParser.WORD, 0); }
		public StatusIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusIndicator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitStatusIndicator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusIndicatorContext statusIndicator() throws RecognitionException {
		StatusIndicatorContext _localctx = new StatusIndicatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statusIndicator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageTrailerContext extends ParserRuleContext {
		public MessageControlContext messageControl() {
			return getRuleContext(MessageControlContext.class,0);
		}
		public MessageReferenceContext messageReference() {
			return getRuleContext(MessageReferenceContext.class,0);
		}
		public MessageTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageTrailer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitMessageTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageTrailerContext messageTrailer() throws RecognitionException {
		MessageTrailerContext _localctx = new MessageTrailerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_messageTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__5);
			setState(184);
			messageControl();
			setState(185);
			messageReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageControlContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public MessageControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitMessageControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageControlContext messageControl() throws RecognitionException {
		MessageControlContext _localctx = new MessageControlContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_messageControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterchangeTrailerContext extends ParserRuleContext {
		public InterchangeControlContext interchangeControl() {
			return getRuleContext(InterchangeControlContext.class,0);
		}
		public ControlReferenceContext controlReference() {
			return getRuleContext(ControlReferenceContext.class,0);
		}
		public InterchangeTrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interchangeTrailer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitInterchangeTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterchangeTrailerContext interchangeTrailer() throws RecognitionException {
		InterchangeTrailerContext _localctx = new InterchangeTrailerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interchangeTrailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__6);
			setState(190);
			interchangeControl();
			setState(191);
			controlReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterchangeControlContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EdiParser.INTEGER, 0); }
		public InterchangeControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interchangeControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EdiVisitor ) return ((EdiVisitor<? extends T>)visitor).visitInterchangeControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterchangeControlContext interchangeControl() throws RecognitionException {
		InterchangeControlContext _localctx = new InterchangeControlContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interchangeControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\u00c6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\2\2*\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NP\2\2\2\u009d\2R\3\2\2\2\4U\3\2\2\2\6]\3\2\2\2\be\3\2\2\2\nh\3\2\2\2"+
		"\fj\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26u\3\2\2"+
		"\2\30w\3\2\2\2\32y\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \u0081\3\2\2\2\"\u0083"+
		"\3\2\2\2$\u0088\3\2\2\2&\u008a\3\2\2\2(\u008c\3\2\2\2*\u008e\3\2\2\2,"+
		"\u0094\3\2\2\2.\u0096\3\2\2\2\60\u0098\3\2\2\2\62\u009c\3\2\2\2\64\u009e"+
		"\3\2\2\2\66\u00a0\3\2\2\28\u00a2\3\2\2\2:\u00a4\3\2\2\2<\u00a9\3\2\2\2"+
		">\u00ab\3\2\2\2@\u00ad\3\2\2\2B\u00af\3\2\2\2D\u00b2\3\2\2\2F\u00b5\3"+
		"\2\2\2H\u00b7\3\2\2\2J\u00b9\3\2\2\2L\u00bd\3\2\2\2N\u00bf\3\2\2\2P\u00c3"+
		"\3\2\2\2RS\5\4\3\2ST\7\2\2\3T\3\3\2\2\2UV\5\6\4\2VW\5\36\20\2WX\5*\26"+
		"\2XY\5:\36\2YZ\5B\"\2Z[\5J&\2[\\\5N(\2\\\5\3\2\2\2]^\7\3\2\2^_\5\b\5\2"+
		"_`\5\f\7\2`a\5\16\b\2ab\5\20\t\2bc\5\22\n\2cd\5\24\13\2d\7\3\2\2\2ef\5"+
		"\n\6\2fg\5\26\f\2g\t\3\2\2\2hi\7\f\2\2i\13\3\2\2\2jk\5\n\6\2k\r\3\2\2"+
		"\2lm\5\n\6\2m\17\3\2\2\2no\5\30\r\2op\5\32\16\2p\21\3\2\2\2qr\5\n\6\2"+
		"r\23\3\2\2\2st\5\34\17\2t\25\3\2\2\2uv\7\13\2\2v\27\3\2\2\2wx\7\13\2\2"+
		"x\31\3\2\2\2yz\7\13\2\2z\33\3\2\2\2{|\7\f\2\2|\35\3\2\2\2}~\7\4\2\2~\177"+
		"\5 \21\2\177\u0080\5\"\22\2\u0080\37\3\2\2\2\u0081\u0082\7\13\2\2\u0082"+
		"!\3\2\2\2\u0083\u0084\5$\23\2\u0084\u0085\5\26\f\2\u0085\u0086\5&\24\2"+
		"\u0086\u0087\5(\25\2\u0087#\3\2\2\2\u0088\u0089\7\n\2\2\u0089%\3\2\2\2"+
		"\u008a\u008b\7\13\2\2\u008b\'\3\2\2\2\u008c\u008d\5\n\6\2\u008d)\3\2\2"+
		"\2\u008e\u008f\7\5\2\2\u008f\u0090\5,\27\2\u0090\u0091\5.\30\2\u0091\u0092"+
		"\5\60\31\2\u0092\u0093\58\35\2\u0093+\3\2\2\2\u0094\u0095\5\34\17\2\u0095"+
		"-\3\2\2\2\u0096\u0097\5\n\6\2\u0097/\3\2\2\2\u0098\u0099\5\62\32\2\u0099"+
		"\u009a\5\64\33\2\u009a\u009b\5\66\34\2\u009b\61\3\2\2\2\u009c\u009d\7"+
		"\n\2\2\u009d\63\3\2\2\2\u009e\u009f\7\n\2\2\u009f\65\3\2\2\2\u00a0\u00a1"+
		"\7\n\2\2\u00a1\67\3\2\2\2\u00a2\u00a3\5\34\17\2\u00a39\3\2\2\2\u00a4\u00a5"+
		"\7\6\2\2\u00a5\u00a6\5<\37\2\u00a6\u00a7\5> \2\u00a7\u00a8\5@!\2\u00a8"+
		";\3\2\2\2\u00a9\u00aa\5\34\17\2\u00aa=\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"?\3\2\2\2\u00ad\u00ae\7\13\2\2\u00aeA\3\2\2\2\u00af\u00b0\7\7\2\2\u00b0"+
		"\u00b1\5D#\2\u00b1C\3\2\2\2\u00b2\u00b3\5F$\2\u00b3\u00b4\5H%\2\u00b4"+
		"E\3\2\2\2\u00b5\u00b6\7\n\2\2\u00b6G\3\2\2\2\u00b7\u00b8\7\13\2\2\u00b8"+
		"I\3\2\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5L\'\2\u00bb\u00bc\5 \21\2\u00bc"+
		"K\3\2\2\2\u00bd\u00be\7\13\2\2\u00beM\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0"+
		"\u00c1\5P)\2\u00c1\u00c2\5\22\n\2\u00c2O\3\2\2\2\u00c3\u00c4\7\13\2\2"+
		"\u00c4Q\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}