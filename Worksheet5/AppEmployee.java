package Worksheet5;

public class AppEmployee {
    public static void main(String args[]){
        SoftwareEngineer newEmployee = new SoftwareEngineer(001, "Archer");
        newEmployee.setJobCode(0123);
        int lowEndSalary = newEmployee.getLowPay();
        int highEndSalary = newEmployee.getMaxPay();
        System.out.println(newEmployee.toString());
        System.out.println("Low salary: " + lowEndSalary);
        System.out.println("High salary: " + highEndSalary);
    }
}
