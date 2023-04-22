import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Boolean running = true;
        ArrayList<Person> mainPhoneBook = new ArrayList<>();

        starterContacts(mainPhoneBook);

        while (running) {

            int value = welcomeUser();
            // exits apllication
            if (value == 0) {
                running = false;
            }
            // create and add contact to phone book
            if (value == 1) {

                createContact(mainPhoneBook);
            }
            // print out list of users
            if (value == 2) {

                printPhoneBook(mainPhoneBook);
            }
            // delete by number
            if (value == 3) {
                deleteByPhoneNumber(mainPhoneBook);

            }
            // filter user choices
            if (value == 4) {
                filterChoices(mainPhoneBook);

            }
            // update user
            if (value == 5) {
                updateByNumber(mainPhoneBook);

            }
        }

    }

    public static int welcomeUser() {
        // System.out.println("\nWelcome to The PhoneBook");
        System.out.println("\nChoose an option: ");
        System.out.println(" \n------------------------");
        System.out.println(" [0] Exit Phonebook App ");
        System.out.println(" [1] Add contact ");
        System.out.println(" [2] Show Phonebook ");
        System.out.println(" [3] Delete Contact ");
        System.out.println(" [4] Search Contact ");
        System.out.println(" [5] Update Contact ");
        System.out.println(" ------------------------");
        System.out.println("                                                       ");
        System.out.println("                                                       ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~PhoneBook~~~~~~~~~~~~~~~~~~~~~~");

        Scanner scanner = scanner();
        return scanner.nextInt();
    }

    public static int deleteChoices() {

        System.out.println("\nChoose an option: ");
        System.out.println(" \n------------------------");
        System.out.println(" [1] Delete by name ");
        System.out.println(" [2] Delete by number");
   
        System.out.println("                                                       ");
        System.out.println("                                                       ");
     

        Scanner scanner = scanner();
        return scanner.nextInt();
    }

    public static String addFirstName() {
        System.out.println("Enter users first name: ");
        Scanner scanner = scanner();
        String firstName = scanner.next();
        return firstName;

    }

    public static String addLastName() {

        Scanner scanner = scanner();
        System.out.println("Enter users last name: ");
        String lastName = scanner.next();
        return lastName;

    }

    public static long addNumber() {
        System.out.println("Enter users phone number: ");
        Scanner scanner = scanner();
        long phoneNumber = scanner.nextLong();
        return phoneNumber;
    }

    public static Address addAddress() {
        Scanner scanner = scanner();
        System.out.println("Enter home or apartment number");
        int home = scanner.nextInt();
        System.out.println("Enter street name: ");
        scanner.nextLine();
        String street = scanner.nextLine();
        System.out.println("Enter city: ");
        String city = scanner.next();
        System.out.println("Enter state: ");
        String state = scanner.next();
        System.out.println("Enter zip code: ");
        int zipCode = scanner.nextInt();

        Address theAddy = new Address(home, street, city, state, zipCode);

        return theAddy;

    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void printPhoneBook(ArrayList<Person> mainPhoneBook) {
        // sort function that sorts the names into order on each print call
        sortArray(mainPhoneBook);
        System.out.println("______________________________________________________________________________");
        System.out.println("                                                              ");
        System.out.println("Name \t\t Number\t\t Address");
        System.out.println("______________________________________________________________________________");
        for (Person person : mainPhoneBook) {
            System.out.println(person);

            System.out.println("==============================================================================");
            System.out.println("==============================================================================");

        }

    }

    public static void createContact(ArrayList<Person> mainPhoneBook) {
        String firstName = addFirstName();
        String lastName = addLastName();
        Address address = addAddress();
        long phoneNumber = addNumber();
        Person contact = new Person(firstName, lastName, address, phoneNumber);
        mainPhoneBook.add(contact);
    }

    public static void deleteByFirstName(ArrayList<Person> mainPhoneBook) {
        System.out.println("Enter the FIRST NAME of the user you want to delete. ");
        Scanner scanner = scanner();
        String deleteValue = scanner.next();

        for (Person contact : mainPhoneBook) {
            String nameToBeDeleted = contact.getFirstName();
            if (deleteValue.toLowerCase().equals(nameToBeDeleted.toLowerCase())) {
                mainPhoneBook.remove(contact);
                break;
            }

        }
        // printPhoneBook(mainPhoneBook); ... for whatever reason this was breaking my
        // code

    }

    public static void deleteByPhoneNumber(ArrayList<Person> mainPhoneBook) {
        System.out.println("Enter the PHONE NUMBER of the user you want to delete. ");
        Scanner scanner = scanner();
        Long deleteValue = scanner.nextLong();

        for (Person contact : mainPhoneBook) {
            Long numberToBeDeleted = contact.getPhoneNumber();
            if (deleteValue.equals(numberToBeDeleted)) {
                mainPhoneBook.remove(contact);
                break;
            }

        }
        // printPhoneBook(mainPhoneBook); ... for whatever reason this was breaking my
        // code

    }

    public static void filterByName(ArrayList<Person> mainPhoneBook) {
        System.out.println("Enter the LAST NAME of the user you want to search for. ");
        Scanner scanner = scanner();
        String filterValue = scanner.next();
        System.out.println(" Here are the contacts with the last name " + filterValue.toUpperCase());
        System.out.println("\n \n \n \n");

        for (Person contact : mainPhoneBook) {
            String nameToBeFiltered = contact.getLastName();
            if (filterValue.toLowerCase().equals(nameToBeFiltered.toLowerCase())) {

                System.out.println(contact);

            }

        }
        System.out.println("\n \n \n \n");

    }

    public static void filterByNumber(ArrayList<Person> mainPhoneBook) {
        System.out.println("Enter the PHONE NUMBER of the user you want to search for. ");
        Scanner scanner = scanner();
        Long filterValue = scanner.nextLong();
        System.out.println("\n \n \n \n");
        System.out.println(" Here are the contacts with the phone number " + filterValue);
        for (Person contact : mainPhoneBook) {
            Long nameToBeFiltered = contact.getPhoneNumber();
            if (filterValue.equals(nameToBeFiltered)) {

                System.out.println(contact);

            }

        }
        System.out.println("\n \n \n \n");

    }

    public static void starterContacts(ArrayList<Person> mainPhoneBook) {
        Address Home = new Address(2943, "Lake well Dr", "Jacksonville", "Florida", 32279);

        Person Kee = new Person("Kee", "Maloney", Home, 7064050550L);
        Person Shiloh = new Person("Shiloh", "Maloney", Home, 3371234567L);
        Person Amira = new Person("Amira", "Waiters", Home, 7193375190L);
        Person Pharaoh = new Person("Pharaoh", "Waiters", Home, 3344156789L);
        mainPhoneBook.add(Kee);
        mainPhoneBook.add(Shiloh);
        mainPhoneBook.add(Amira);
        mainPhoneBook.add(Pharaoh);

    }

    public static void sortArray(ArrayList<Person> mainPhoneBook) {

        // for (Person contact : mainPhoneBook) {
        mainPhoneBook.sort(new ContactCompare());

        // }

    }

    public static void updateByNumber(ArrayList<Person> mainPhoneBook) {
        System.out.println("Enter the PHONE NUMBER of the user you want to update. ");
        Scanner scanner = scanner();
        Long filterValue = scanner.nextLong();
        System.out.println("\n \n \n \n");
        System.out.println(" Here are the contacts with the phone number " + filterValue);
        for (Person contact : mainPhoneBook) {
            Long nameToBeFiltered = contact.getPhoneNumber();
            if (filterValue.equals(nameToBeFiltered)) {

                System.out
                        .println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getPhoneNumber());
                System.out.println("Enter updated number: ");

                Long updatedNumber = scanner.nextLong();

                contact.setPhoneNumber(updatedNumber);

            }

        }
        System.out.println("\n \n \n \n");

    }

    public static void filterChoices(ArrayList<Person> mainPhoneBook) {
        System.out.println("Wouldyou like to filter user by: ");
        System.out.println("[1] name ");
        System.out.println("[2] number");
        Scanner scanner = scanner();
        int filterChoice = scanner.nextInt();
        if (filterChoice == 1) {
            filterByName(mainPhoneBook);
        }
        if (filterChoice == 2) {
            filterByNumber(mainPhoneBook);
        }

        // update user

    }
}

// create a function that takes the person and the addess and add it to an array
// of objects.
/*
 * [
 * {name:
 * address:},
 * {name:
 * address:},
 * {name:
 * address:},
 * {name:
 * address:},
 * ]
 * 
 * 
 */

/*
 * search by last name function
 * 
 * search by first name
 * 
 * search by full name
 * 
 * search by number
 * 
 * search by city
 * 
 * search by state
 * 
 * update by telephone number
 * 
 * delete by telephone number
 */

/*
 * Java comparable interface
 */