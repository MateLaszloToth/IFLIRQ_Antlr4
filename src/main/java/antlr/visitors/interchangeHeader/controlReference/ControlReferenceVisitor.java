package antlr.visitors.interchangeHeader.controlReference;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.dataClasses.interchangeHeader.controlReference.ControlReference;
import antlr.dataClasses.interchangeHeader.controlReference.id.Id;
import org.antlr.v4.runtime.tree.ParseTree;

public class ControlReferenceVisitor  extends EdiBaseVisitor {

    @Override
    public ControlReference visitControlReference(EdiParser.ControlReferenceContext ctx) {
        Id id = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.IdContext) {
                id = (Id) visitId(ctx.id());
            } else {
                System.out.println("Unexpected child of ControlReference");
            }
        }
        assert id != null;
        return new ControlReference(id);
    }
}
