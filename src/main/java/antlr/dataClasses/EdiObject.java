package antlr.dataClasses;


import antlr.dataClasses.interchangeHeader.InterchangeHeader;

public class EdiObject {

    public InterchangeHeader interchangeHeader;


    public EdiObject(InterchangeHeader interchangeHeader){
        this.interchangeHeader = interchangeHeader;
    }
}
