package antlr.visitors.interchangeHeader;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.EdiParser.SyntaxContext;
import antlr.dataClasses.interchangeHeader.InterchangeHeader;
import antlr.dataClasses.interchangeHeader.controlReference.ControlReference;
import antlr.dataClasses.interchangeHeader.preparation.Preparation;
import antlr.dataClasses.interchangeHeader.priority.Priority;
import antlr.dataClasses.interchangeHeader.recipient.Recipient;
import antlr.dataClasses.interchangeHeader.sender.Sender;
import antlr.dataClasses.interchangeHeader.syntax.Syntax;
import org.antlr.v4.runtime.tree.ParseTree;

public class InterchangeHeaderVisitor extends EdiBaseVisitor {

    @Override
    public InterchangeHeader visitInterchangeHeader(EdiParser.InterchangeHeaderContext ctx) {
        Syntax syntax = null;
        Sender sender = null;
        Recipient recipient = null;
        Preparation preparation = null;
        ControlReference controlReference = null;
        Priority priority = null;

        for(int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof SyntaxContext) {
                syntax = (Syntax) visitSyntax(ctx.syntax());
            } else if (child instanceof EdiParser.SenderContext) {
                sender = (Sender) visitSender(ctx.sender());
            } else if (child instanceof EdiParser.RecipientContext) {
                recipient = (Recipient) visitRecipient(ctx.recipient());
            } else if (child instanceof EdiParser.PreparationContext) {
                preparation = (Preparation) visitPreparation(ctx.preparation());
            } else if (child instanceof EdiParser.ControlReferenceContext) {
                controlReference = (ControlReference) visitControlReference(ctx.controlReference());
            } else if (child instanceof EdiParser.PriorityContext) {
                priority = (Priority) visitPriority(ctx.priority());
            } else {
                System.out.println("Unexpected children of EdiObject.");
            }
        }

        return new InterchangeHeader(syntax, sender, recipient, preparation, controlReference, priority);
    }
}
