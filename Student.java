package school.management.system;

/**Created by Siddharth
 * Responsible for keeping track of student id,name,stream,age,fees */

 public class Student {

    private int id;
    private String name;
    private String stream ;
    private int age;
    private int fees;
    private int feesPaid;
    private int feesTotal;

    /**To create a new string by initializing
     * fees per annum for all students $5000
     * fees paid initially is $0
     * id of the student : unique
     * name of the student 
     * stream of the student
     * year of the student
     */

     public Student(int id, String name, String stream, int age, int fees){

        this.feesPaid=0;
        this.feesTotal=5000;
        this.id=id;
        this.name=name;
        this.stream=stream;
        this.age=age;
        this.fees=fees;
     }

     //Not going to alter Student name, id.
     
     //Used to update the student year
          public void setAge(int age){
         
        this.age=age;
     }

     /**School is going to receive new funds
      * Add the fees to feesPaid
      * Keep adding fees to feesPaid field
     */



     public int getStudentId(){
         return id;              //return id of the student
     }

     public String getName(){
         return name;             //return name of the student
     }

     public String getStream(){
         return stream;          //return stream of the student
     }

     public int getAge(){
         return age;            //return year of the student
     }

     public int getFees(){
         return fees;
     }

     public void setFees(int fees){
        this.fees = fees;
    }

     public int getFeesPaid(){
         return feesPaid;         //return fees paid of the student
     }

     public int getFeesTotal(){
        return feesTotal;         //return total fees of the student
     }

     public int getRemainingFees(){
         return feesTotal-feesPaid;
     }

    public void payFees(int fees){
        feesPaid=feesPaid+fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    @Override
    public String toString() {
        return "Student's Name: " + name + "\n"+
                "ID: " + id + "\n"+
                "Stream: " + stream + "\n"+
                "Age: " + age + "\n"+
                "Fees Paid: $" + feesPaid + "\n";
    }


 }



