package antlr.dataClasses.messageHeader.messageType;

import antlr.dataClasses.common.VersionNumber;

public class MessageType {
    public Name name;
    public VersionNumber versionNumber;
    public ReleaseNumber releaseNumber;
    public ControllingAgency controllingAgency;

    public MessageType(
            Name name,
            VersionNumber versionNumber,
            ReleaseNumber releaseNumber,
            ControllingAgency controllingAgency
    ) {
        this.name = name;
        this.versionNumber = versionNumber;
        this.releaseNumber = releaseNumber;
        this.controllingAgency = controllingAgency;
    }
}
