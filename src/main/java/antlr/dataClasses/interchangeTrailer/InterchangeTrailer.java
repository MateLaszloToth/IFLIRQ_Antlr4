package antlr.dataClasses.interchangeTrailer;

import antlr.dataClasses.interchangeHeader.controlReference.ControlReference;

public class InterchangeTrailer {
    public InterchangeControl interchangeControl;
    public ControlReference controlReference;

    public InterchangeTrailer(
            InterchangeControl interchangeControl,
            ControlReference controlReference
            ) {
        this.interchangeControl = interchangeControl;
        this.controlReference = controlReference;
    }
}
