package CH7_Arrays;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Create an ArrayList to hold some names
        ArrayList<String> nameList = new ArrayList<>();

        //Add some names to the Array List
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Display the size of the ArrayList
        System.out.println("The ArrayList has " +
                nameList.size() + " objects stored in it");

        //Now display the items in the nameList
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));

        }
    }
}
