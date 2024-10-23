package Worksheet5;

public class Employee {
    private final int pay_low;
    private final int pay_high;
    private String name;
    private final int employee_id;

    public int getLowPay() {
        return pay_low;
    }

    public int getMaxPay() {
        return pay_high;
    }

    public int getID() {
        return employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("Name: %s, ID: %d", name, employee_id);
    }

    public Employee(int id, String name, int pay_low, int pay_high) {
        employee_id = id;
        this.pay_low = pay_low;
        this.pay_high = pay_high;
        this.name = name;
    }

}


/*
1. Regarding class Employee:
a. Does it store any value? If yes, what are their types? Are they instance or class variables?
    It stores class variables because they are private.
b. Explain when you need to use the word “this”.
    When setting a the current variable to the same name as the parameter being passed in.
2. Write the class SoftwareEngineer to be a child of Employee, considering
the following requirements:
a. sets the Employee pay scale to be 75,000-250,000
b. has a jobcode associated with them
c. needs a getJobCode() and setJobCode() method
d. needs a constructor of the format SoftwareEngineer(int id, String name)
e. Add a toString method to SoftwareEngineer. It should print out:
Name: name, ID: id, JobCode: jobcode
3. Write a class AppEmployee that contains a main method to test your
previous classes.

 */

