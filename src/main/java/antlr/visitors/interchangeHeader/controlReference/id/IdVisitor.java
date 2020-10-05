package antlr.visitors.interchangeHeader.controlReference.id;

import antlr.EdiBaseVisitor;
import antlr.EdiParser;
import antlr.dataClasses.interchangeHeader.controlReference.id.Id;

public class IdVisitor extends EdiBaseVisitor {

    @Override
    public Object visitId(EdiParser.IdContext ctx) {
        return new Id(ctx.getText());
    }
}
