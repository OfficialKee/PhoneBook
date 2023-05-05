package com.keetotheweb.webphonebook;
import java.util.Comparator;

public class ContactCompare implements Comparator<Person> {
    @Override

    public int compare(Person p1, Person p2) {
        // if (p1.getFirstName() < p2.getFirstName()) {
        //     return -1;
        // } else if (p1.getFirstName() > p2.getFirstName()) {
        //     return 1;
        // } else {
        //     return 0;
        // }
    
        p1.getLastName().compareTo(p2.getLastName());
        return p2.getFirstName().compareTo(p2.getFirstName());
            
       
    }
}
