package school.management.system;

/**
 * Created by Siddharth
 * */

public class Exam {

    private int id;
    private String examsubject;
    private int subjectcode;
    private int expenditure;
    private int payExpenditure;

    public Exam(int id,String examsubject, int subjectcode, int expenditure) {

        this.id=id;
        this.examsubject=examsubject;
        this.subjectcode=subjectcode;
        this.expenditure=expenditure;
        this.payExpenditure=0;

    }

    public int getExamId(){
        return id;
    }

    public String getExamsubject() {
        return examsubject;
    }

    public int getSubjectcode() {
        return subjectcode;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(int expnediture) {
        this.expenditure = expenditure;
    }

    public void payExpenditure(int expenditure){
        payExpenditure+=expenditure;
        School.updateTotalMoneySpent(expenditure);

    }

    @Override
    public String toString() {
        return "Subject : " + examsubject + "\n"+
                "Subject ID: " + subjectcode + "\n"+
                "Expenditure: $" + expenditure + "\n";
    }
}
