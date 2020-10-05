package antlr.dataClasses.interchangeHeader;

import antlr.dataClasses.interchangeHeader.controlReference.ControlReference;
import antlr.dataClasses.interchangeHeader.preparation.Preparation;
import antlr.dataClasses.interchangeHeader.priority.Priority;
import antlr.dataClasses.interchangeHeader.recipient.Recipient;
import antlr.dataClasses.interchangeHeader.sender.Sender;
import antlr.dataClasses.interchangeHeader.syntax.Syntax;

public class InterchangeHeader {
    public Syntax syntax;
    public Sender sender;
    public Recipient recipient;
    public Preparation preparation;
    public ControlReference controlReference;
    public Priority priority;

    public InterchangeHeader(
            Syntax syntax,
            Sender sender,
            Recipient recipient,
            Preparation preparation,
            ControlReference controlReference,
            Priority priority
    ){
        this.syntax = syntax;
        this.sender = sender;
        this.recipient = recipient;
        this.preparation = preparation;
        this.controlReference = controlReference;
        this.priority = priority;
    }
}
