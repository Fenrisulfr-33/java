package Worksheet5;

public class SoftwareEngineer extends Employee {
    int jobCode;
    public SoftwareEngineer(int id, String name){
        super(id, name, 75000, 250000);
    }

    public int getJobCode(){
        return jobCode;
    }

    public void setJobCode(int jobCode){
        this.jobCode = jobCode;
    }
    
    @Override
    public String toString(){
        return "Name: " + super.getName() + ", ID: " + super.getID() + ", JobCode: " + jobCode;
    }   
}
