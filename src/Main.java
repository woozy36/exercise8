import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<PersonInfo> listOfPeople = new ArrayList<>();


        PersonInfo human1 = new PersonInfo("john", "johnnyboy@mailmail.gaming");
        Business human2 = new Business("NotJohn", "veryAppropriateEmail@yahoo.outlook", "6146146111");
        human1.display();
        human2.display();


        Scanner input = new Scanner(System.in);


        //System.out.println("whats your name");
        //String userName = input.nextLine();

        //System.out.println("whats your email");
        //String userEmail = input.nextLine();

        //System.out.println("whats your phone number");
        //String userPhoneNumber = input.nextLine();

        //Business user = new Business(userEmail,userName,userPhoneNumber);

        //user.display();

//        System.out.println(human);
//THIS IS HOW TO USE ToSTRING() !!!!

        listOfPeople.add(human1);
        listOfPeople.add(human2);
        System.out.println(listOfPeople);


    }
}