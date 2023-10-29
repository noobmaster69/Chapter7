package CH7_Arrays;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        //Create an ArrayList to hold some names
        ArrayList<String> nameList = new ArrayList<>();

        //Add some names to the ArrayList
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Display the items in nameList and their indices
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Index: " + i + " Name: " +
                    nameList.get(i));


        }

        //Now remove the item at index 1
        nameList.remove(1);

        System.out.println("The item at index 1 is removed. " +
                "Here are the items now");


        //Display the items in nameList and their indices
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Index: " + i + " Name: " +
                    nameList.get(i));

        }
    }
}
