
package CorageAct_1;

import java.util.Scanner;

public class CorageAct_1 {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String firstname;
        String middlename;
        String lastname;
        String birthday;
        String gender;
        int age;
        
        System.out.println("Firstname: ");
        firstname = scn.nextLine();
        
        System.out.println("Middlename: ");
        middlename = scn.nextLine();
        
        System.out.println("Lastname: ");
        lastname = scn.nextLine();
        
        System.out.println("Birthday: ");
        birthday = scn.nextLine();
        
        System.out.println("Gender: ");
        gender = scn.nextLine();
        
        System.out.println("Age: ");
        age = scn.nextInt();
        
        System.out.println("\n"+"Firstname: "+ firstname + "\n" + "Middlename: "  + middlename + "\n" + "Lastname: " + lastname + "\n" + "Birthday: "  + birthday + "\n" + "Gender: " + gender + "\n" + "Age: " + age);
        
    }
}
    
