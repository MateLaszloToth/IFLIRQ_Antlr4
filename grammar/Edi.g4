//  UNB+IATB:1+U60NGI0+1ASIC0U6+200319:1516+RMS000000001+++O'UNH+1+IFLIRQ:07:1:1A'ORG+1A+:NCEU60RMS++++RU:RUR:EN+A0002RMSU'FDQ+U6+377+150820'STX+GBL:2'UNT+116+1'UNZ+1+RMS000000001'

grammar Edi;

//options{buildAST=true;}

edi
: ediObject EOF
;

ediObject
:  unb unh org fdq stx unt unz
;


// UNB
unb
: 'UNB'  syntax sender recipient preparation controlReference priority //'+' sender '+'+ recipient '+'+ preparation '+'+ controlReference '+'+ priority
;

syntax
: id versionNumber
;

id
: ID
;


sender
: id
;

recipient
: id
;

preparation
: date time
;

controlReference
: id
;

priority
: code
;

versionNumber
: INTEGER
;

date
: INTEGER
;

time
: INTEGER
;

code
: ID
;

fragment DIGIT
: [0-9]
;

fragment LETTER
: [A-Z]
;


WORD
: LETTER+
;

INTEGER
: DIGIT+
;

ID
: (WORD | INTEGER)+
;
// // UNH
unh
: 'UNH'  messageReference messageType
;

messageReference
: INTEGER
;


messageType
: name versionNumber  releaseNumber  controllingAgency
;

name
: WORD
;

releaseNumber
: INTEGER
;

controllingAgency
: id
;


// ORG
org
: 'ORG' deliverySystemParty agent locationDetails accessAuthorization
;

deliverySystemParty
: code
;

agent
: id
;

locationDetails
: countryCode currencyCode languageCode
;

countryCode
: WORD
;

currencyCode
: WORD
;

languageCode
: WORD
;

accessAuthorization
: code
;

// FDQ
fdq
: 'FDQ' airline flight departure
;

airline
: code
;

flight
: INTEGER
;

departure
: INTEGER
;


// STX
stx
: 'STX' grabTheLockFlag
;

grabTheLockFlag
: statusIndicator value
;

statusIndicator
: WORD
;

value
: INTEGER
;


// UNT
unt
: 'UNT'  messageControl messageReference
;

messageControl
: INTEGER
;


// UNZ
unz
: 'UNZ' interchangeControl controlReference
;

interchangeControl
: INTEGER
;


WS
: [\t\r\n]+ -> skip
;

SEPARATOR_SKIP
: ('+' | ':' | '\'')+ -> skip
;