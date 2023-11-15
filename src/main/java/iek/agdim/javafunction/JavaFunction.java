/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iek.agdim.javafunction;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaFunction {

    public static void main(String[] args) {
      String name;
      int age;
      char gender;
      double salary;
      int kids;
      
        
        Scanner console=new Scanner(System.in);
        System.out.println("Enter name:");
        name=console.nextLine();
        System.out.println("Enter age:");
        age=console.nextInt();
        System.out.println("Enter gender:(F/M)");
        gender=console.next().charAt(0);
        System.out.println("Enter salary:");
        salary=console.nextDouble();
		
		// εαν ο υπάλληλος έχει δύο παιδιά, ο μισθός θα είναι 20% μεγαλύτερος
		// παράδειγμα: printStat(όνομα, ηλικία ....);

                System.out.println("Enter No of Kids:");
		kids=console.nextInt();
		if (kids>2){
		salary=salary*1.2;}
                
                printStat(name,age,gender,salary,kids);
                
                String[] kidsNames = new String[kids] ;
                int[] kidsAges = new int[kids];
 
                // new function for printing kids data
                // if there are kids, print with new function
                // their data
                
    }
    
    static void printStat (String empName, 
                        int empAge, char empGender, 
			double empSalary, int empKids) {
   
        
        System.out.println("\nName: "+empName+"\nAge: "+empAge+
							"\nGender: "+empGender+"\nSalary: "+empSalary+
							"Kids: "+empKids);
    }
    
    
}
