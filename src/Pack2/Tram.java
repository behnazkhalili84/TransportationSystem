package Pack2;

import Pack3.Metro;

import java.util.Objects;

public class Tram extends Metro {
    private int yearOfCreation;
    private long serialNumber;
    private static long serialNumCount = 30000 ;

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Tram(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation, int totalNumberOfStops, int yearOfCreation) {
        super(numberOfWheels, maximumSpeed, numberOfVehicles, nameOfStartingStation, nameOfDestinationStation, totalNumberOfStops);
        this.yearOfCreation = yearOfCreation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Tram(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Tram(Tram tram){
        setMaximumSpeed(tram.getMaximumSpeed());
        setNumberOfVehicles(tram.getNumberOfVehicles());
        setNameOfStartingStation(tram.getNameOfStartingStation());
        setNameOfDestinationStation(tram.getNameOfDestinationStation());
        setNumberOfWheels(tram.getNumberOfWheels());
        setTotalNumberOfStops(tram.getTotalNumberOfStops());
        this.yearOfCreation = tram.yearOfCreation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Tram tram)) return false;
        if (!super.equals(object)) return false;
        return yearOfCreation == tram.yearOfCreation ;
    }



    @Override
    public String toString() {
        return "This Tram" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() +" wheels"+
                ", has a maximumSpeed of " + getMaximumSpeed() +"km/hr. "+
                "It has "+getNumberOfVehicles()+" vehicles and its starting and destination stations are "+
                getNameOfStartingStation() + " and " + getNameOfDestinationStation()+" and " + getTotalNumberOfStops() +
                "# Stops and yearOfCreation is: " + yearOfCreation + " . ";
    }

    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }
}
