package school.management.system;

import java.util.List;

/**Created by Siddharth
 * Implements teachers and students using array list
 * 
 */

 public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private List<Faculty> faculties;
    private List<Exam> exams;
    private List<Activity> activities;
    private List<Canteen> canteens;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    /**
     * 
     * school object is created 
     * teachers is the list of teachers in the school
     * students is the number of students in the school
     */



    public School (List<Teacher> teachers, List<Student> students, List<Faculty> faculties , List<Exam> exams , List<Activity> activities, List<Canteen> canteen) {
        this.teachers=teachers;
        this.students=students;
        this.faculties=faculties;
        this.exams=exams;
        this.activities=activities;
        this.canteens=canteen;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers(){ 
        return teachers;                          //return list of teachers of the school  
    }

    public void addTeachers(Teacher teacher){
        teachers.add(teacher);                   //add a teacher to the school
    } 

    public List<Student> getStudents(){
        return students;                         //return the list of student of the school
    }

    public void addStudents(Student student){
        students.add(student);                  //add a student to the school
    }

    public List<Faculty> getFaculties(){
        return faculties;
    }

    public void addFaculties(Faculty faculty){
        faculties.add(faculty);
    }

    public List<Exam> getExams(){
        return exams;
    }

    public void addExams(Exam exam){
        exams.add(exam);
    }

    public List<Activity> getActivities(){
        return activities;
    }

    public void addActivities(Activity activity){
        activities.add(activity);
    }

    public List<Canteen> getCanteen(){
        return canteens;
    }

    public void addCanteens(Canteen canteen){
        canteens.add(canteen);
    }

    public int getTotalMoneyEarned(){
        return totalMoneyEarned;                //return money earned by the school                
    }

    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned += MoneyEarned;        //adds the total money earned by the school         
    }  

    public int getTotalMoneySpent(){
        return totalMoneySpent;                 //return money spent by the school                                   
    }

    public static void updateTotalMoneySpent (int MoneySpent){
        totalMoneyEarned -= MoneySpent;           //update money spent by school(as salary)
    }



 }