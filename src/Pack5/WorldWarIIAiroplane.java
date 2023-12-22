package Pack5;

import java.util.Objects;

public class WorldWarIIAiroplane extends Aircraft{
    private boolean twinEngine;
    private long serialNumber;
    private static long serialNumCount = 80000 ;

    public boolean isTwinEngine() {
        return twinEngine;
    }

    public void setTwinEngine(boolean twinEngine) {
        this.twinEngine = twinEngine;
    }

    public WorldWarIIAiroplane(double price, double maximumElevation, boolean twinEngine) {
        super(price, maximumElevation);
        this.twinEngine = twinEngine;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public WorldWarIIAiroplane(WorldWarIIAiroplane worldWarIIAiroplane){
        setPrice(worldWarIIAiroplane.getPrice());
        setMaximumElevation(worldWarIIAiroplane.getMaximumElevation());
        this.twinEngine = worldWarIIAiroplane.twinEngine;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public WorldWarIIAiroplane(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }


    @Override
    public String toString() {
        return "This WorldWarIIAiroplane" +
                "-serial#" + serialNumber +
                "-has " + getPrice() +" price"+
                ", has a maximum elevation of " +getMaximumElevation()+" and twinEngine is " + twinEngine ;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof WorldWarIIAiroplane that)) return false;
        if (!super.equals(object)) return false;
        return twinEngine == that.twinEngine ;
    }

    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }

}
