package Pack3;

import Pack1.WheeledTransportation;
import Pack2.Train;

import java.util.Objects;

public class Metro extends Train {
    private int totalNumberOfStops;
    private long serialNumber;
    private static long serialNumCount = 25000;

    public int getTotalNumberOfStops() {
        return totalNumberOfStops;
    }

    public void setTotalNumberOfStops(int totalNumberOfStops) {
        this.totalNumberOfStops = totalNumberOfStops;
    }

    public Metro(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Metro(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation, int totalNumberOfStops) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, nameOfStartingStation, nameOfDestinationStation);
        this.totalNumberOfStops = totalNumberOfStops;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Metro(Metro metro){
        setMaximumSpeed(metro.getMaximumSpeed());
        setNumberOfVehicles(metro.getNumberOfVehicles());
        setNameOfStartingStation(metro.getNameOfStartingStation());
        setNameOfDestinationStation(metro.getNameOfDestinationStation());
        setNumberOfWheels(metro.getNumberOfWheels());
        this.totalNumberOfStops = metro.totalNumberOfStops;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    @Override
    public String toString() {
        return "This Metro" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() +" wheels"+
                ", has a maximumSpeed of " + getMaximumSpeed() +"km/hr. "+
                "It has "+getNumberOfVehicles()+" vehicles and its starting and destination stations are "+
                getNameOfStartingStation() + " and " + getNameOfDestinationStation()+" and " + totalNumberOfStops +
                "# Stops .";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Metro metro)) return false;
        if (!super.equals(object)) return false;
        return totalNumberOfStops == metro.totalNumberOfStops ;
    }
    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }

}
