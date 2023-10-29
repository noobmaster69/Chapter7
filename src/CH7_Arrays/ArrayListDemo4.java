package CH7_Arrays;

import java.util.ArrayList;


public class ArrayListDemo4{
    public static void main(String[] args) {

        //Create an ArrayList to hold some names
        ArrayList<String> nameList = new ArrayList<>();

        //Add some names to the arraylist
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Display the items and their indices
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Index: " + i + " Name: " +
                    nameList.get(i));

        }

        //Now insert an item at index1
        nameList.add(1, "Mary");

        System.out.println("Mary was added at index 1 " +
                "Here are the items now");


        //Display the items in nameList and their indices
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Index: " + i + " Name: " + nameList.get(i));

        }
    }
}