package Pack2;

import Pack1.WheeledTransportation;

import java.util.Objects;

public class Train extends WheeledTransportation {
    private int numberOfVehicles;
    private String nameOfStartingStation;
    private String nameOfDestinationStation;
    private long serialNumber;
    private static long serialNumCount = 10000;


    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getNameOfStartingStation() {
        return nameOfStartingStation;
    }

    public void setNameOfStartingStation(String nameOfStartingStation) {
        this.nameOfStartingStation = nameOfStartingStation;
    }

    public String getNameOfDestinationStation() {
        return nameOfDestinationStation;
    }

    public void setNameOfDestinationStation(String nameOfDestinationStation) {
        this.nameOfDestinationStation = nameOfDestinationStation;
    }


    public Train() {

        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }

    public Train(int numberOfWheels, double maximumSpeed, int numberOfVehicles, String nameOfStartingStation, String nameOfDestinationStation) {
        super(numberOfWheels, maximumSpeed);
        this.numberOfVehicles = numberOfVehicles;
        this.nameOfStartingStation = nameOfStartingStation;
        this.nameOfDestinationStation = nameOfDestinationStation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Train(Train train){
        this.numberOfVehicles= train.numberOfVehicles;
        this.nameOfDestinationStation = train.nameOfDestinationStation;
        this.nameOfStartingStation = train.nameOfStartingStation;
        setMaximumSpeed(train.getMaximumSpeed());
        setNumberOfWheels(train.getNumberOfWheels());
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    @Override
    public String toString() {
        return "This Train" +
                "-serial#" + serialNumber +
                "-has " + getNumberOfWheels() +" wheels"+
                ", has a maximumSpeed of " + getMaximumSpeed() +"km/hr. "+
                "It has "+numberOfVehicles+" vehicles and its starting and destination stations are "+
                nameOfStartingStation + " and " + nameOfDestinationStation+".";
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }if(!super.equals(object) ) {return  false;}else {
            Train train = (Train) object;
           if (this.numberOfVehicles == ((Train) object).numberOfVehicles
                    && this.nameOfStartingStation.equals(((Train) object).nameOfStartingStation)
                    && this.nameOfDestinationStation.equals(nameOfDestinationStation)){
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

