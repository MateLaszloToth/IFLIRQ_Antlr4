package antlr.dataClasses.messageHeader;

import antlr.dataClasses.common.MessageReference;
import antlr.dataClasses.messageHeader.messageType.MessageType;

public class MessageHeader {
    public MessageReference messageReference;
    public MessageType messageType;

    public MessageHeader(
            MessageReference messageReference,
            MessageType messageType
    ) {
        this.messageReference = messageReference;
        this.messageType = messageType;
    }
}
