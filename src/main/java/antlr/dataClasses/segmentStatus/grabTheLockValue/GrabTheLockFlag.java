package antlr.dataClasses.segmentStatus.grabTheLockValue;

public class GrabTheLockFlag {
    public StatusIndicator statusIndicator;
    public Value value;

    public GrabTheLockFlag(
            StatusIndicator statusIndicator,
            Value value
    ) {
        this.statusIndicator = statusIndicator;
        this.value = value;
    }
}
