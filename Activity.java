package school.management.system;

/**
 * Created by Siddharth
 * */

public class Activity {

    private int id;
    private String activityname;
    private String department;
    private int footfall;
    private int expenditure;
    private int sponsorship;
    private int payexpenditure;
    private int receivesponsorship;



    public Activity(int id,String activityname, String department, int footfall, int expenditure, int sponsorship) {

        this.id=id;
        this.activityname=activityname;
        this.department=department;
        this.footfall=footfall;
        this.expenditure=expenditure;
        this.sponsorship=sponsorship;
        this.payexpenditure=0;
        this.receivesponsorship=0;



    }

    public int getActivityId() {
        return id;
    }

    public String getActivityname() {
        return activityname;
    }

    public String getDepartment() {
        return department;
    }

    public int getFootfall() {
        return footfall;
    }

    public int getExpenditure() {
        return expenditure;
    }

    public void getSponsorship(int sponsorship) {
    }

    public void setExpenditure(int expenditure) {
        this.expenditure = expenditure;
    }

    public void setSponsorship(int sponsorship) {
        this.sponsorship = sponsorship;
    }

    public void payExpenditure(int expenditure) {
        payexpenditure += expenditure;
        School.updateTotalMoneySpent(expenditure);
    }

    public void receiveSponsorship(int sponsorship) {
        receivesponsorship += sponsorship;
        School.updateTotalMoneyEarned(sponsorship);
    }

    @Override
    public String toString() {
        return "Activity: " + activityname + "\n"+
                "Department " + department + "\n"+
                "Footfall: " + footfall + " students" + "\n"+
                "Sponsorship: $" + sponsorship + "\n"+
                "Expenditure: $" + expenditure + "\n";
    }

    public int getSponsorship() {
        return this.sponsorship;
    }
}
