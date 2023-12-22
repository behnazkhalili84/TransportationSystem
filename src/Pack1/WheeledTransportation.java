package Pack1;

import java.util.Objects;

public class WheeledTransportation {
    private int numberOfWheels;
    private double maximumSpeed;
    private long serialNumber;
    private static long serialNumCount ;

    public WheeledTransportation()
    {
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);


    }
    public WheeledTransportation(int numberOfWheels, double maximumSpeed) {
        this.numberOfWheels = numberOfWheels;
        this.maximumSpeed = maximumSpeed;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public WheeledTransportation(WheeledTransportation wheeledTransportation){

        setMaximumSpeed(wheeledTransportation.getMaximumSpeed());
        setNumberOfWheels(wheeledTransportation.getNumberOfWheels());
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "This WheeledTransportation" +
                "-serial#" + serialNumber +
                "-has " + numberOfWheels +" wheels"+
                ", has a maximumSpeed of " + maximumSpeed +"km/hr. ";
    }

    @Override
    public boolean equals(Object o) {
      if(o == null || this.getClass() != o.getClass()){
          return false;
      }else {
          WheeledTransportation wheeledTransportation = (WheeledTransportation) o;
          if(this.maximumSpeed == wheeledTransportation.maximumSpeed
                  && this.numberOfWheels == wheeledTransportation.numberOfWheels){
              return true;
          }
          return false;
      }
    }
    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }


}
