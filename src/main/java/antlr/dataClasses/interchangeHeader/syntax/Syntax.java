package antlr.dataClasses.interchangeHeader.syntax;

import antlr.dataClasses.interchangeHeader.controlReference.id.Id;
import antlr.dataClasses.interchangeHeader.syntax.versionNumber.VersionNumber;

public class Syntax {

    public String id;
    public String versionNumber;

    public Syntax(Id id, VersionNumber versionNumber){
        this.id = id.content;
        this.versionNumber = versionNumber.content;
    }
}
