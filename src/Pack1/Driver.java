package Pack1;

import Pack2.Train;
import Pack2.Tram;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAiroplane;
import Pack6.Ferry;

import java.text.DecimalFormat;

public class Driver {
    public static void main(String[] args) {
        //Creating object from diferent class and printing them
        //comparing equality of objects
        System.out.println("----------------------------WheeledTransportation---------------------------");
        WheeledTransportation wheeledTransportation1 = new WheeledTransportation();
        System.out.println(wheeledTransportation1);
        WheeledTransportation wheeledTransportation2 = new WheeledTransportation(4,300);
        System.out.println(wheeledTransportation2);
        WheeledTransportation wheeledTransportation3 = new WheeledTransportation(wheeledTransportation2);
        System.out.println(wheeledTransportation3);
        System.out.print("wheeledTransportation1  and wheeledTransportation2 : ");
        printEqual(wheeledTransportation1,wheeledTransportation2);
        System.out.print("wheeledTransportation2  and wheeledTransportation3 : ");
        printEqual(wheeledTransportation2,wheeledTransportation3);
        System.out.println();



        System.out.println("----------------------------Train---------------------------------");
        System.out.println();
        Train train1 = new Train();
        System.out.println(train1);
        Train train2 = new Train(100,100,1,"Toronto","Vancouver");
        System.out.println(train2);
        Train train3 = new Train(train2);
        System.out.println(train3);
        System.out.print("Train1  and Train2 : ");
        printEqual(train1,train2);
        System.out.print("Train2  and Train3 : ");
        printEqual(train2,train3);
        System.out.println();

        System.out.println("----------------------------Metro---------------------------------");
        Metro metro1 = new Metro();
        System.out.println(metro1);
        Metro metro2 = new Metro(100,150,10,"Namur","Cote Vertu",10);
        System.out.println(metro2);
        Metro metro3 = new Metro(metro2);
        System.out.println(metro3);
        System.out.print("Metro1  and Metro2 : ");
        printEqual(metro1,metro2);
        System.out.print("Metro2  and Metro3 : ");
        printEqual(metro2,metro3);
        System.out.println();

        System.out.println("----------------------------Monowheel--------------------------------");
        Monowheel monowheel1 = new Monowheel();
        System.out.println(monowheel1);
        Monowheel monowheel2 = new Monowheel(100,20,1500);
        System.out.println(monowheel2);
        Monowheel monowheel3 = new Monowheel(monowheel2);
        System.out.println(monowheel3);
        System.out.print("Monowheel1  and Monowheel2 : ");
        printEqual(monowheel1,monowheel2);
        System.out.print("Monowheel2  and Monowheel3 : ");
        printEqual(monowheel2,monowheel3);
        System.out.println();

        System.out.println("----------------------------Tram----------------------------------");
        Tram tram1 = new Tram();
        System.out.println(tram1);
        Tram tram2 = new Tram(100,150,10,"Namur","Cote Vertu",10,2000);
        System.out.println(tram2);
        Tram tram3 = new Tram(tram2);
        System.out.println(tram3);
        System.out.print("Tram1  and Tram2 : ");
        printEqual(tram1,tram2);
        System.out.print("Tram2  and Tram3 : ");
        printEqual(tram2,tram3);
        System.out.println();

        System.out.println("----------------------------Ferry----------------------------------");
        Ferry ferry1 = new Ferry();
        System.out.println(ferry1);
        Ferry ferry2 = new Ferry(80,2000);
        System.out.println(ferry2);
        Ferry ferry3 = new Ferry(ferry2);
        System.out.println(ferry3);
        System.out.print("Ferry1  and Ferry2 : ");
        printEqual(ferry1,ferry2);
        System.out.print("Ferry2  and Ferry3 : ");
        printEqual(ferry2,ferry3);
        System.out.println();

        System.out.println("----------------------------Aircraft----------------------------------");
        Aircraft aircraft1 = new Aircraft();
        System.out.println(aircraft1);
        Aircraft aircraft2 = new Aircraft(500000000,98);
        System.out.println(aircraft2);
        Aircraft aircraft3 = new Aircraft(aircraft2);
        System.out.println(aircraft3);
        System.out.print("Aircraft1  and Aircraft2 : ");
        printEqual(aircraft1,aircraft2);
        System.out.print("Aircraft2  and Aircraft3 : ");
        printEqual(aircraft2,aircraft3);
        System.out.println();

        System.out.println("----------------------------WorldWarIIAiroplane------------------------------");
        WorldWarIIAiroplane worldWarIIAiroplane1 = new WorldWarIIAiroplane();
        System.out.println(worldWarIIAiroplane1);
        WorldWarIIAiroplane worldWarIIAiroplane2 = new WorldWarIIAiroplane(6000000,80,true);
        System.out.println(worldWarIIAiroplane2);
        WorldWarIIAiroplane worldWarIIAiroplane3 = new WorldWarIIAiroplane(worldWarIIAiroplane2);
        System.out.println(worldWarIIAiroplane3);
        System.out.print("WorldWarIIAiroplane1  and WorldWarIIAiroplane2 : ");
        printEqual(worldWarIIAiroplane1,worldWarIIAiroplane2);
        System.out.print("WorldWarIIAiroplane2  and WorldWarIIAiroplane3 : ");
        printEqual(worldWarIIAiroplane2,worldWarIIAiroplane3);

        //Creating array from objects

        Object [] array1 = {wheeledTransportation1,train1,tram2,metro2,monowheel1,aircraft1,wheeledTransportation3,worldWarIIAiroplane1,ferry1,ferry2,ferry3,aircraft2};

        Object [] array2 = {wheeledTransportation2,wheeledTransportation1,train2,tram1,tram2,metro1,monowheel1,wheeledTransportation3,worldWarIIAiroplane3,ferry2,ferry3,metro2};

        Object [] array3 = {train1,train2,tram2,ferry1,ferry2,wheeledTransportation1,aircraft1};

        System.out.println("**********************************************************" );
        System.out.println("The most and lest expansive Aircraft price in array 1 is :");
        findLeastAndMostExpensiveAircraft(array1);
        System.out.println("**********************************************************" );
        System.out.println("The most and lest expansive Aircraft price in array 2 is :");
        findLeastAndMostExpensiveAircraft(array2);
        System.out.println("**********************************************************" );
        System.out.println("The most and lest expansive Aircraft price in array 3 is :");
        findLeastAndMostExpensiveAircraft(array3);




    }
    public static void findLeastAndMostExpensiveAircraft(Object [] array) {
        double mostexp = Double.MIN_VALUE;
        double leastexp = Double.MAX_VALUE;

        Aircraft mostExpensiveAircraft = null;
        Aircraft leastExpensiveAircraft = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i].getClass().getName() == "Pack5.Aircraft" ){
                Aircraft aircraft = (Aircraft) array[ i ];
                double price = aircraft.getPrice();
                if (price > mostexp) {
                    mostexp = price;
                    mostExpensiveAircraft = aircraft;
                }
                if (price < leastexp) {
                    leastexp = price;
                    leastExpensiveAircraft = aircraft;
                }
            }
        }

        if (mostexp == Double.MIN_VALUE || leastexp == Double.MAX_VALUE )  {
            System.out.println( " There is no object from Aircraft class in this array");
        }else {
            System.out.println(mostExpensiveAircraft.toString());
            DecimalFormat decimalFormat = new DecimalFormat("#");
            String formattedmostexp = decimalFormat.format(mostexp);
            String formattedleastexp = decimalFormat.format(leastexp);
            System.out.println("Most expensive aircraft details:\n" +mostExpensiveAircraft.toString());
            System.out.println( "Most expensive aircraft price: " + formattedmostexp );
            System.out.println("Least expensive aircraft details:\n" + leastExpensiveAircraft.toString());
            System.out.println( "Least expensive aircraft price: " + formattedleastexp);

        }
    }


    public static void printEqual(Object object1,Object object2){
        if(object1.equals(object2)){
            System.out.println("These two Object are equal");
        }else {
            System.out.println("These two Objet are not equal");
        }
    }


}
