public class Employee01 {
    private String name = "";
    private double salary = 0;
    private int workHours = 0;
    private int workYears = 0;
    public static void main(String[] args) {
        Employee01 employee = new Employee01("orhan",2000,22,2022);
        System.out.println(employee);
        Employee01 employee2 = new Employee01("orhan",19000,30,2022);
        System.out.println(employee2);
    }
    public Employee01() {}
    public Employee01(String name,double salary,int workHours,int workYears){
        this.name = name;
        this.workHours = workHours;
        this.workYears = workYears;
        this.salary = bonus(tax(raiseSalary(salary, workYears)),workHours);
    }
    public static double tax(double salary){
        double taxedSalary = salary;
        if (salary >= 1000) {
            taxedSalary = salary *97/100;
        }
        return taxedSalary;
    }
    public static double bonus(double salary,int workHours){
        if (workHours%40 > 0){
            salary = salary + (workHours / 40*30);
        }
        return salary;
    }
    public static double raiseSalary(double salary,int hireYear){
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

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +"\n"+
                " salary=" + salary +"\n"+
                " workHours=" + workHours +"\n"+
                " workYears=" + workYears +"\n"+
                "======================================";
    }
}
