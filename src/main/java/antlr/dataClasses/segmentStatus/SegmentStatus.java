package antlr.dataClasses.segmentStatus;

import antlr.EdiParser;
import antlr.dataClasses.segmentStatus.grabTheLockValue.GrabTheLockFlag;

public class SegmentStatus {
    GrabTheLockFlag grabTheLockFlag;

    public SegmentStatus(GrabTheLockFlag grabTheLockFlag) {
        this.grabTheLockFlag = grabTheLockFlag;
    }
}
