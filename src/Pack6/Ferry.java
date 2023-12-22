package Pack6;

import java.util.Objects;

public class Ferry {
    private double maximumSpeed;
    private double maximumLoad;
    private long serialNumber;
    private static long serialNumCount = 70000 ;

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(double maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public Ferry(double maximumSpeed, double maximumLoad) {
        this.maximumSpeed = maximumSpeed;
        this.maximumLoad = maximumLoad;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Ferry(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Ferry(Ferry ferry){
        this.maximumSpeed = ferry.maximumSpeed;
        this.maximumLoad = ferry.maximumLoad;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }

    @Override
    public String toString() {
        return "This Ferry" +
                "-serial#" + serialNumber +
                "-has " + maximumLoad +" maximumLoad"+
                ", has a maximumSpeed of " + maximumSpeed +"km/hr. ";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Ferry ferry)) return false;
        return Double.compare(maximumSpeed, ferry.maximumSpeed) == 0 && Double.compare(maximumLoad, ferry.maximumLoad) == 0 ;
    }


}
