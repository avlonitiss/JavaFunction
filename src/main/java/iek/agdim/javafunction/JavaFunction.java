/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package iek.agdim.javafunction;

/**
 *
 * @author User
 */
public class JavaFunction {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
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
static void printStat() {
   
        
        System.out.println("Name:"+name+"Age"+age+"Gender"+gender+"Salary:"+salary);
    }
    }
}
