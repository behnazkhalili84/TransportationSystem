package Pack1;

import Pack2.Train;
import Pack2.Tram;
import Pack3.Metro;
import Pack4.Monowheel;
import Pack5.Aircraft;
import Pack5.WorldWarIIAiroplane;
import Pack6.Ferry;


import java.lang.management.MonitorInfo;

public class Driver2 {

    public static void main(String[] args) {
        WheeledTransportation wheeledTransportation1 = new WheeledTransportation( 8, 200 );
        WheeledTransportation wheeledTransportation2 = new WheeledTransportation( 4, 300 );
        WheeledTransportation wheeledTransportation3 = new WheeledTransportation( 6, 180 );

        Train train1 = new Train();
        Train train2 = new Train( 100, 100, 1, "Toronto", "Vancouver" );
        Train train3 = new Train( 120, 150, 118, "Montreal", "Vancouver" );

        Tram tram1 = new Tram( 10, 80, 10, "Montreal", "Quebec City", 5, 1999 );
        Tram tram2 = new Tram( 6, 120, 16, "Montreal", "Toronto", 7, 2015 );

        Metro metro1 = new Metro( 18, 110, 13, "Montmorency", "cote-Vertu", 30 );
        Metro metro2 = new Metro( 12, 120, 11, "Snowdon", "Saint-Michel",11 );

        Monowheel monowheel1 = new Monowheel(1,60,100);
        Monowheel monowheel2 = new Monowheel(1,4,75);


        Aircraft aircraft1 = new Aircraft(10000000, 40000);
        Aircraft aircraft2 = new Aircraft (12000000,50000);


        WorldWarIIAiroplane worldWarIIAiroplane1 = new WorldWarIIAiroplane(8000000,35000,true);
        WorldWarIIAiroplane worldWarIIAiroplane2 = new WorldWarIIAiroplane(9200000,45000,false);
        WorldWarIIAiroplane worldWarIIAiroplane3 = new WorldWarIIAiroplane(worldWarIIAiroplane1);


        Ferry ferry1 = new Ferry(46,50);
        Ferry ferry2 = new Ferry(70,65);
        Ferry ferry3 = new Ferry(ferry2);


        Object [] array1 = {train1,tram2,metro2,monowheel1,wheeledTransportation3,worldWarIIAiroplane1,ferry1,ferry3,aircraft2};

        Object [] array2 = {wheeledTransportation2,wheeledTransportation1,train2,tram1,tram2,metro1,monowheel1,wheeledTransportation3,worldWarIIAiroplane3,ferry2,ferry3,metro2};

        Object [] array3 = {train1,train2,tram2,ferry1,ferry2,wheeledTransportation1,aircraft1};
        System.out.println("----------------------------Original Array--------------------------- ");
        for (int i = 0; array1.length > i; i++){
            System.out.println(array1[i]);
        }

        System.out.println("----------------------------Copied Array---------------------------" );
        Object[] newArray = copyTheObject(array1);

        for (int i = 0; newArray.length > i; i++){
            System.out.println( newArray[i]);
        }

        System.out.println();
        Object[] newArray3 = copyTheObject(array3);

        System.out.println("**************************Dispalying Array ********************************" );
        Object[] array  = copyTheObject(array2);
        for (int i=0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }

    }

    public static Object[] copyTheObject(Object[] objects){
        Object[] array = new Object[objects.length];
        System.arraycopy(objects,0,array,0,objects.length);
        return array;
    }

}
