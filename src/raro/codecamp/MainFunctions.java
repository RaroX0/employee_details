package raro.codecamp;

import java.util.ArrayList;
import java.util.Scanner;

public class MainFunctions {

    private final ArrayList<Employee> employeeList = new ArrayList<>();

    public void run(){

        /*
        Making object Instances.
         */
        Employee employee = new Employee();

        /*
        main function.
         */
        for(int i = 0; i <= 2; i++){

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter ID: ");
            double idNumber = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Given Name: ");
            String givenName = scanner.nextLine();

            System.out.print("Enter Middle Name: ");
            String middleName = scanner.nextLine();

            System.out.print("Enter Tin Number: ");
            int tinNumber = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter SSS Number: ");
            double sssNumber = Double.parseDouble(scanner.nextLine());

            /*
            using the setter function of Employee object.
             */
            employee.set(idNumber, lastName, givenName, middleName, tinNumber, sssNumber);

            /*
            storing employees to an array.
             */
            employeeList.add(employee);
        }

        /*
        printing the information using for-loop.
         */
        for (Employee employeeMain : employeeList) System.out.println("ID Number: " + employeeMain.getIdNumber() + "\nLast Name: " + employeeMain.getLastName() + "\nGiven Name: " + employeeMain.getGivenName() + "\nMiddle Name: " + employeeMain.getMiddleName() + "\nTin Number: " + employeeMain.getTinNumber() + "\nSSS Number: " + employeeMain.getSssNumber());
    }
}

class Employee{

    /*
    instance variables.
     */
    private double idNumber;
    private String lastName;
    private String givenName;
    private String middleName;
    private int tinNumber;
    private double sssNumber;

    /*
    accessor methods.
     */
    public double getIdNumber(){
        return this.idNumber;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getGivenName(){
        return this.givenName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public int getTinNumber(){
        return this.tinNumber;
    }
    public double getSssNumber(){
        return this.sssNumber;
    }

    /*
    mutator method.
     */
    public void set(double id, String lName, String gName, String mName, int tNum, double sssNum){
        idNumber = id;
        lastName = lName;
        givenName = gName;
        middleName = mName;
        tinNumber = tNum;
        sssNumber = sssNum;
    }

}
