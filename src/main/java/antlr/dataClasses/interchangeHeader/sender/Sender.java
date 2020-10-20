package antlr.dataClasses.interchangeHeader.sender;

import antlr.dataClasses.interchangeHeader.controlReference.id.Id;

public class Sender {
    public String id;

    public Sender(Id id) {
        this.id = id.content;
    }
}
