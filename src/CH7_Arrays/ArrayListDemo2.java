package CH7_Arrays;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //Create an ArrayList to hold some names
        ArrayList<String> nameList = new ArrayList<String>();

        //Add some names to the array list
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");

        //Display the size of the Array List
        System.out.println("The ArrayList has " +
                nameList.size() + " objects stored in it");

        //Now display the items in nameList
        for (String name :
                nameList) {
            System.out.println(name);
        }
    }
}
