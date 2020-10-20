package antlr.dataClasses.messageTrailer;

import antlr.dataClasses.common.MessageReference;

public class MessageTrailer {
    public MessageControl messageControl;
    public MessageReference messageReference;

    public MessageTrailer(
            MessageControl messageControl,
            MessageReference messageReference
    ) {
        this.messageControl = messageControl;
        this.messageReference = messageReference;
    }
}
