package antlr.visitors;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.dataClasses.EdiObject;
import antlr.dataClasses.interchangeHeader.InterchangeHeader;
import org.antlr.v4.runtime.tree.ParseTree;

public class EdiObjectVisitor extends EdiBaseVisitor {

    @Override
    public EdiObject visitEdiObject(EdiParser.EdiObjectContext ctx) {
        InterchangeHeader interchangeHeader = null;
        for(int i = 0; i < ctx.getChildCount(); i++){
            ParseTree child = ctx.getChild(i);
            if(child instanceof EdiParser.InterchangeHeaderContext) {
                interchangeHeader = (InterchangeHeader) visitInterchangeHeader(ctx.interchangeHeader());
            } else if(child instanceof EdiParser.MessageHeaderContext) {

            } else if(child instanceof EdiParser.RequestOriginatorContext) {

            } else if(child instanceof EdiParser.FlightDetailsContext) {

            } else if(child instanceof EdiParser.SegmentStatusContext) {

            } else if(child instanceof EdiParser.MessageTrailerContext) {

            } else if(child instanceof EdiParser.InterchangeTrailerContext) {

            } else {
                System.out.println("Unexpected children of EdiObject.");
            }

        }
        return new EdiObject(interchangeHeader);
    }
}
