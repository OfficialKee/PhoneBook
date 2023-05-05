package com.keetotheweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.keetotheweb.webphonebook.Address;
import com.keetotheweb.webphonebook.Person;


@Controller
public class PhoneController {

   ArrayList<Person> phoneBook = new ArrayList<>();
 
    Address Home = new Address("123", "working rd", "Jacksonville", "florida", "32270");

    Person Kee = new Person("Shikee", "Maloney", Home, "706-405-0550");
   
 


   

    @GetMapping("/")
    public String getHome(Model model ){
        phoneBook.add(Kee);        model.addAttribute("phonebook", phoneBook);
        return "index";
    }
}
