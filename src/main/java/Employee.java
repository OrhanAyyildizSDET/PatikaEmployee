
import java.util.Scanner;

public class Employee {
    String name = "";
    int salary = 0;
    int workHours = 0;
    int hireYear = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yes = true;
        while (yes){
            Employee employee = new Employee();
            System.out.println("Please enter a name");
            employee.name = scanner.nextLine();

            System.out.println("Please enter a salary");
            employee.salary = scanner.nextInt();

            System.out.println("Please enter a workHours");
            employee.workHours = scanner.nextInt();

            System.out.println("Please enter a hireYear");
            employee.hireYear = scanner.nextInt();

            employee.salary = raiseSalary(employee.salary,employee.hireYear);
            employee.salary = tax(employee.salary);
            employee.salary = bonus(employee.salary,employee.workHours);
            employeeDetail(employee.name, employee.salary, employee.workHours,employee.hireYear);

            System.out.println("Do you want to go on?"+"  "+"Yes, No");
            scanner.nextLine();
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("no")){
                System.out.println("Game Over!");
                yes = false;
            }
            else if (!answer.equals("yes")){
                System.out.println("Please enter a valid answer");
            }
        }
    }

    public static void employeeDetail(String name, int salary, int workHours, int hireYear){
        System.out.println("Employee Name is : "+name);
        System.out.println("Employee Salary is : "+salary);
        System.out.println("Employee WorkHours is : "+workHours);
        System.out.println("Employee HireYear is : "+hireYear);
    }
    public static int tax(int salary){
        int taxedSalary = salary;
        if (salary >= 1000) {
            taxedSalary = salary *97/100;
        }
        return taxedSalary;
    }
    public static int bonus(int salary,int workHours){
        if (workHours%40 > 0){
            salary = salary + (workHours / 40*30);
        }
        return salary;
    }
    public static int raiseSalary(int salary,int hireYear){
        int workYear = 2021 - hireYear;
        if (workYear < 9 ){
            salary = salary*5/100 + salary;
        }else if (workYear < 20){
            salary = salary*10/100 + salary;
        }else {
            salary = salary*15/100 + salary;
        }
        return salary;
    }
}
