package antlr.dataClasses.interchangeHeader.recipient;

import antlr.dataClasses.interchangeHeader.controlReference.id.Id;

public class Recipient {

    public String id;

    public Recipient(Id id) {
        this.id = id.content;
    }
}
