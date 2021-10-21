package school.management.system;

/**
 * Created by Siddharth
 * This class is responsible for keeping the track of teachers id, name and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private String subject;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * id of the teacher
     * name of the teacher
     * subject of the teacher
     * salary of the teacher    
     */

    public Teacher(int id, String name,String subject, int salary){

        this.id=id;
        this.name=name;
        this.subject=subject;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getTeacherId(){
        return id;     //return id of the teacher
    }

    public String getName(){
        return name;   //return name of the teacher
    }

    public String getSubject(){
        return subject;
    }

    public int getSalary(){
        return salary; //return salary of the teacher
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
        return "Teacher's Name: " + name + "\n"+
                "ID: " + id + "\n"+
                "Subject" + subject + "\n"+
                "Salary: $" + salary + "\n";
    }
}
