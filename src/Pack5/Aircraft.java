package Pack5;

import java.text.DecimalFormat;
import java.util.Objects;

public class Aircraft {
    private double price;
    private  double maximumElevation;

    private long serialNumber;
    private static long serialNumCount ;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaximumElevation() {
        return maximumElevation;
    }

    public void setMaximumElevation(double maximumElevation) {
        this.maximumElevation = maximumElevation;
    }

    public Aircraft(double price, double maximumElevation) {
        this.price = price;
        this.maximumElevation = maximumElevation;
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public Aircraft(){
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);

    }

    public Aircraft(Aircraft aircraft){
        setPrice(aircraft.getPrice());
        setMaximumElevation(aircraft.getMaximumElevation());
        this.serialNumber = serialNumCount;
        serialNumCount = getNextSerialNumber(serialNumber);
    }
    public static long getNextSerialNumber(long serialNumber){
        long serialNumCnt  = serialNumber + 1;

        return serialNumCnt;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Aircraft aircraft)) return false;
        return Double.compare(price, aircraft.price) == 0 && Double.compare(maximumElevation, aircraft.maximumElevation) == 0 ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, maximumElevation, serialNumber);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String formattedmostexp = decimalFormat.format(price);
        return "This Aircraft" +
                "-serial#" + serialNumber +
                "-has " + formattedmostexp +" price"+
                ", has a maximum elevation of " + maximumElevation+". ";
    }
}
