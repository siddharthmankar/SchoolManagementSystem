package school.management.system;

/**
 * Created by Siddharth
 */

public class Faculty {

   private int id;
   private String name;
   private String facultydept;
   private int salary;
   private int salaryEarned;

    /**
     * Creates a new Faculty object
     * id of the Faculty
     * name of the Faculty
     * salary of the Faculty
     */

    public Faculty(int id, String name,String facultydept, int salary){

        this.id=id;
        this.name=name;
        this.facultydept=facultydept;
        this.salary=salary;
        this.salaryEarned=0;

    }

    public int getFacultyId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFacultydept() {
        return facultydept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;  //set the salary
    }

    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Faulty Name: " + name + "\n"+
                "ID: " + id + "\n"+
                "Faculty Department: " + facultydept + "\n" +
                "Salary: $" + salary + "\n";
    }
}
