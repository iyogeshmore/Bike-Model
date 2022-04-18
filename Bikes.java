package Bridgelabz;

import java.util.ArrayList;

public class Bikes {
    public static void main(String[] args) {
        ArrayList<String> bike_list = new ArrayList<String>(3);
        bike_list.add("Suzuki");
        bike_list.add("Yamaha");
        bike_list.add("Kawasaki");
        bike_list.add("Ninja");
        System.out.println("*** Bike list ***");
        for (int i=0;i<3;i++){
            System.out.println(bike_list.get(i).toString());
        }
        ArrayList<String>oldmodel = new ArrayList<String>(2);
        oldmodel.add("TVS");
        oldmodel.add("Hero");
        oldmodel.add("Honda");
        bike_list.addAll(oldmodel);
        System.out.println("New size of the list is :" +bike_list.size());
        System.out.println("*** Bike list with old model ***");
        for (int i=0;i<7;i++){
            System.out.println(bike_list.get(i).toString());
        }
        bike_list.remove("Yamaha");
        System.out.println("New size od the list :" +bike_list.size());
        System.out.println("*** Yamaha model removed ***");
        for (int i=0;i<6;i++)
        {
            System.out.println(bike_list.get(i).toString());
        }
    }
}
