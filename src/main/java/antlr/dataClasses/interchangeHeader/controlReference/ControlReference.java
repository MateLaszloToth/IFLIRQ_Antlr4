package antlr.dataClasses.interchangeHeader.controlReference;

import antlr.dataClasses.interchangeHeader.controlReference.id.Id;

public class ControlReference {

    public String id;

    public ControlReference(Id id) {
        this.id = id.content;
    }
}
