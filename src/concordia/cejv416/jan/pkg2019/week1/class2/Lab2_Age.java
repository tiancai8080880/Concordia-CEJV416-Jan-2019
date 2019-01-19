/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordia.cejv416.jan.pkg2019.week1.class2;

/**
 *
 * @author po_jiang
 */
public class Lab2_Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int CURRENT_AGE_YEAR = 1989;
        int currentYear = 2019;
        int age = currentYear - CURRENT_AGE_YEAR;
        int numberMonth = age * 12;
        int numberDays = age * 365;
        System.out.println("Person is " + age + " years old");
        System.out.println("Which is " + numberMonth + " months");
        System.out.println("Which is " + numberDays + " days");
    }
    
}
