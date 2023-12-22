package Pack4;
import Pack1.WheeledTransportation;

import java.util.Objects;

public class Monowheel extends WheeledTransportation {
    private double maximumWeight;
    private long serialNumber;
    private static long serialNumCount = 55000 ;

    public double getMaximumWeight() {
        return maximumWeight;
    }

    public void setMaximumWeight(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public Monowheel(double maximumWeight) {
        this.maximumWeight = maximumWeight;
    }
    public Monowheel(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Monowheel(Monowheel monowheel){
        setMaximumSpeed(monowheel.getMaximumSpeed());
        setNumberOfWheels(monowheel.getNumberOfWheels());
        this.maximumWeight = monowheel.maximumWeight;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Monowheel(int numberOfWheels, double maximumSpeed, double maximumWeight) {
        super(numberOfWheels, maximumSpeed);
        this.maximumWeight = maximumWeight;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }

    public boolean equals (Object object){
        if (object == null || this.getClass() != object.getClass()){
            return false;
        }else{
            Monowheel monowheel = (Monowheel) object;
            if(this.getNumberOfWheels() == monowheel.getNumberOfWheels()
                    && this.getMaximumSpeed() == monowheel.getMaximumSpeed()
                    && this.maximumWeight ==  monowheel.maximumWeight )  {
                return true;
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return "This Monowheel " +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() +" wheels"+
                ", has a maximumSpeed of " + getMaximumSpeed() +"km/hr " +
                "and has a maximumWeight of " + maximumWeight + "kg";
    }


}
