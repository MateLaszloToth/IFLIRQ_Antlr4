package antlr.visitors.interchangeHeader.syntax;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.dataClasses.interchangeHeader.controlReference.id.Id;
import antlr.dataClasses.interchangeHeader.syntax.Syntax;
import antlr.dataClasses.interchangeHeader.syntax.versionNumber.VersionNumber;
import org.antlr.v4.runtime.tree.ParseTree;

public class SyntaxVisitor extends EdiBaseVisitor {

    @Override
    public Object visitSyntax(EdiParser.SyntaxContext ctx) {
        Id id = null;
        VersionNumber versionNumber = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EdiParser.IdContext) {
                id = (Id) visitId(ctx.id());
            } else if(child instanceof EdiParser.VersionNumberContext) {
                versionNumber = (VersionNumber) visitVersionNumber(ctx.versionNumber());
            } else {
                System.out.println("Unexpected child of ControlReference");
            }
        }
        assert id != null;
        assert versionNumber != null;
        return new Syntax(id, versionNumber);
    }
}
