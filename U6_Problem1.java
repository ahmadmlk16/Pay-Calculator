import java.util.Scanner;

public class PayCalc {

    public static void main(String[] args) {
        String name = getName();
        double HrWage = getHourlyWage();
        int Hr = getNumberOfHours();
        double WkSalary = calculateWeeklySalary(HrWage,Hr);
        printInformation(name,HrWage,Hr,WkSalary);
    }
    public static String getName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter employee name");
        String name = keyboard.nextLine();
        return name;
    }
    public static double getHourlyWage() {
        Scanner keyboard = new Scanner(System.in);
        double HrWage;
        do {
            System.out.println("Enter your wage per hour");
            HrWage = keyboard.nextDouble();
            if(HrWage < 10){
                System.out.println("Your hourly wage is too low ");
            }
            else if (HrWage > 100)
                System.out.println("Your hourly wage is too high");
            else break;
        }while(HrWage < 10 || HrWage > 100);
        return HrWage;
    }
    public static double calculateWeeklySalary(double HrWage, int NumHours) {
        double sal = HrWage * ((double)NumHours);
        return sal;
    }
    public static int getNumberOfHours() {
        Scanner keyboard = new Scanner(System.in);
        int NumHours;
        do {
            System.out.println("Enter the number of hours worked this week");
            NumHours = keyboard.nextInt();
            if( NumHours > 100) {
                System.out.println("Your number of hours is too high");
            }
            else if (NumHours < 0 ){
                System.out.println("Your number of hours is too low ");
            }
        }while(NumHours < 0 || NumHours > 100);

        return NumHours;
    }

    public static void printInformation(String name, double HrWage, int NumHours, double WkSalary) {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Hourly Wage: " + HrWage);
        System.out.println("Hours Worked this week: " + NumHours);
        System.out.println("Salary for the week: " + WkSalary);
    }


}
