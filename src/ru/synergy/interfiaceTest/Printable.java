package ru.synergy.interfiaceTest;

public interface Printable {
    void print();

    default void read(String appendString){
        System.out.println("Read printable" + "///Appended string///->" + appendString);
    }

}
