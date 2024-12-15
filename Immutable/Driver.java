package Patterns.Immutable;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] Strs){
        // To make class Immutable we have to make the class final and Data members private and final and do not provide setters emthodsw and provide the List using Copy of list ->(new ArrayList<>(arr))
        List<String> namelist=new ArrayList<>();
        namelist.add("Deepak");
        namelist.add("Leonor");
        namelist.add("Zebra");
        namelist.add("Korakagaz");

        MyImmutableClass myImmutableClassObj=new MyImmutableClass("marry",namelist);

        System.out.println(myImmutableClassObj.getName());
        System.out.println(myImmutableClassObj.getNameList());
        List<String> dup=    myImmutableClassObj.getNameList();
        dup.add("Weds one of those");
        System.out.println(dup);
        System.out.println(myImmutableClassObj.getNameList());


    }
}
