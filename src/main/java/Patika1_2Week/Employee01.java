package Patika1_2Week;

public class Employee01 {
    private String name;
    private double salary;
    private int workHours;
    private int workStartYear;
    private double tax;
    private double bonus;
    private double raiseSalary;
    private double salaryWithBonusAndTax;
    private double totalSalary;

    public static void main(String[] args) {
        Employee01 employee = new Employee01("orhan", 2000, 22, 2000);
        System.out.println(employee);
        Employee01 employee2 = new Employee01("orhan", 19000, 30, 2011);
        System.out.println(employee2);
        Employee01 employee3 = new Employee01("orhan",880,53,1995);
        System.out.println(employee3);
    }

    public Employee01() {
    }

    public Employee01(String name, double salary, int workHours, int workYears) {
        this.name = name;
        this.workHours = workHours;
        this.workStartYear = workYears;
        this.salary = salary;
        this.tax = tax(salary);
        this.bonus = bonus(workHours);
        this.raiseSalary = raiseSalary(salary, workYears);
        this.salaryWithBonusAndTax = bonus(workHours) + salary - tax;
        this.totalSalary = tax(salary)+raiseSalary(salary,workYears)+bonus(workHours)+salary;
    }

    public static double tax(double salary) {
        double taxedSalary = 0;
        if (salary >= 1000) {
            taxedSalary = salary *0.03;
        }
        return taxedSalary;
    }

    public static double bonus(int workHours) {
        double bonus = workHours > 40 ? (workHours - 40) * 30 : 0;
        return bonus;
    }
    public static double raiseSalary(double salary, int hireYear) {
        int workYear = 2021 - hireYear;
        double raiseSalary;
        if (workYear < 9) {
            raiseSalary = salary * 5 / 100;
        } else if (workYear < 20) {
            raiseSalary = salary * 10 / 100;
        } else {
            raiseSalary = salary * 15 / 100;
        }
        return raiseSalary;
    }

    @Override
    public String toString() {
        return  "name = " + name + '\n'+
                "salary = " + salary + '\n'+
                "workHours = " + workHours + '\n'+
                "workStartYear = " + workStartYear + '\n'+
                "tax = " + tax + '\n'+
                "bonus = " + bonus + '\n'+
                "raiseSalary = " + raiseSalary + '\n'+
                "salaryWithBonusAndTax = " + salaryWithBonusAndTax + '\n'+
                "totalSalary = " + totalSalary + '\n'+
                "====================================" + '\n';
    }
}


