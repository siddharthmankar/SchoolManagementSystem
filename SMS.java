package school.management.system;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

/**Created by Siddharth
 *
 *
 */

public class SMS {

    private static ArrayList<Student> studentlist = new ArrayList<Student>();
    private static ArrayList<Teacher> teacherlist = new ArrayList<Teacher>();
    private static ArrayList<Faculty> facultylist = new ArrayList<Faculty>();
    private static ArrayList<Exam> examlist = new ArrayList<Exam>();
    private static ArrayList<Activity> activitieslist = new ArrayList<Activity>();
    private static ArrayList<Canteen> canteenlist = new ArrayList<Canteen>();

    public static void main(String[] args){

        LocalDate FeesDate = LocalDate.now();
        LocalDate SalaryDate = LocalDate.now().plusDays(1);
        LocalDate ExamDate = LocalDate.now().plusDays(60);
        LocalDate ActivityDate = LocalDate.now().plusDays(75);

        School MPSTME = new School(teacherlist, studentlist, facultylist, examlist, activitieslist, canteenlist);

        Scanner in = new Scanner(System.in);
        int option;
        int suboption1;
        int suboption2;
        int suboption3;
        int suboption4;

        int repeat = 5;

        while (repeat > 0) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("----------------WELCOME TO SCHOOL MANAGEMENT SYSTEM----------------");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("-------------Please choose one of the below Options----------------");
            System.out.println("1. Enter the details.");
            System.out.println("2. Display details.");
            System.out.println("3. Search for details.");
            System.out.println("4. Funds Available.");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            System.out.println("-------------------------------------------------------------------");

            option = Integer.parseInt(in.next());

            switch (option) {
                case 1:
                    int repeat1 = 7;
                    while (repeat1 > 0) {
                    System.out.println("-------------Please choose one of the below Options----------------");
                    System.out.println("1. Enter the details of the Students.");
                    System.out.println("2. Enter the details of the Teachers.");
                    System.out.println("3. Enter the details of the Faculty.");
                    System.out.println("4. Enter the details of the Exam");
                    System.out.println("5. Enter the details of the Activity");
                    System.out.println("6. Enter the details pf the Canteen inventory");
                    System.out.println("7. Return");
                    System.out.print("Enter your choice: ");
                    System.out.println("-------------------------------------------------------------------");

                    suboption1 = Integer.parseInt(in.next());

                    switch (suboption1) {
                        case 1: {
                            System.out.println("Enter Student Id: ");
                            int id = in.nextInt();
                            boolean checkId = checkStudentId(id);
                            if (checkId) {
                                System.out.println("Student Id Already Exist.");
                                break;
                            }
                            in.nextLine();
                            System.out.println("Enter Student Name: ");
                            String name = in.nextLine();
                            System.out.println("Enter Student Stream: ");
                            String stream = in.nextLine();
                            System.out.println("Enter Student Age: ");
                            int age = in.nextInt();
                            System.out.println("Enter Student fees: ");
                            int fees = in.nextInt();
                            Student student = new Student(id, name, stream, age, fees);
                            studentlist.add(student);
                            repeat1= -7;
                            break;
                        }

                        case 2: {
                            System.out.println("Enter Teacher Id: ");
                            int id = in.nextInt();
                            boolean checkId1 = checkTeacherId(id);
                            if (checkId1) {
                                System.out.println("Teacher Id Already Exist.");
                                break;
                            }
                            in.nextLine();
                            System.out.println("Enter Teacher Name: ");
                            String name = in.nextLine();
                            System.out.println("Enter Teacher Subject: ");
                            String subject = in.nextLine();
                            System.out.println("Enter Teacher salary: ");
                            int salary = in.nextInt();
                            Teacher teacher = new Teacher(id, name, subject, salary);
                            teacherlist.add(teacher);
                            repeat1= -7;
                            break;
                        }

                        case 3: {
                            System.out.println("Enter Faculty Id: ");
                            int id = in.nextInt();
                            boolean checkId2 = checkFacultyId(id);
                            if (checkId2) {
                                System.out.println("Faculty Id Already Exist.");
                                break;
                            }

                            in.nextLine();
                            System.out.println("Enter Faculty Name: ");
                            String name = in.nextLine();
                            System.out.println("Enter Faculty Department: ");
                            String facultydept = in.nextLine();
                            System.out.println("Enter Faculty salary: ");
                            int salary = in.nextInt();
                            Faculty faculty = new Faculty(id, name, facultydept, salary);
                            facultylist.add(faculty);
                            repeat1= -7;
                            break;
                        }

                        case 4: {
                            System.out.println("Enter Exam Id: ");
                            int id = in.nextInt();
                            boolean checkId3 = checkExamId(id);
                            if (checkId3) {
                                System.out.println("Exam Id Already Exist.");
                                break;
                            }
                            in.nextLine();
                            System.out.println("Enter Exam Subject: ");
                            String examsubject = in.nextLine();
                            System.out.println("Enter Subject Code: ");
                            int subjectcode = in.nextInt();
                            System.out.println("Enter Exam Expenditure: ");
                            int expenditure = in.nextInt();
                            Exam exam = new Exam(id,examsubject,subjectcode,expenditure);
                            examlist.add(exam);
                            repeat1= -7;
                            break;
                        }

                        case 5: {
                            System.out.println("Enter Activity Id: ");
                            int id = in.nextInt();
                            boolean checkId4 = checkActivityId(id);
                            if (checkId4) {
                                System.out.println("Activity Id Already Exist.");
                                break;
                            }
                            in.nextLine();
                            System.out.println("Enter Activity Name: ");
                            String activityname = in.nextLine();
                            System.out.println("Enter Department: ");
                            String department = in.nextLine();
                            System.out.println("Enter Attendance: ");
                            int footfall = in.nextInt();
                            System.out.println("Enter Activity Expenditure: ");
                            int expenditure = in.nextInt();
                            System.out.println("Enter Sponsorships received: ");
                            int sponsorship = in.nextInt();
                            Activity activity = new Activity(id,activityname,department,footfall,expenditure,sponsorship);
                            activitieslist.add(activity);
                            repeat1= -7;
                            break;
                        }

                        case 6: {
                            System.out.println("Enter Canteen Inventory Id: ");
                            int id = in.nextInt();
                            boolean checkId5 = checkInventoryId(id);
                            if (checkId5) {
                                System.out.println("Canteen Inventory Id Already Exist.");
                                break;
                            }
                            in.nextLine();
                            System.out.println("Enter Inventory: ");
                            String inventory = in.nextLine();
                            System.out.println("Enter Quantity: ");
                            int quantity = in.nextInt();
                            System.out.println("Enter Expenditure: ");
                            int expenditure = in.nextInt();
                            System.out.println("Enter Profit: ");
                            int profit = in.nextInt();
                            Canteen canteen = new Canteen(id,inventory,quantity,expenditure,profit);
                            canteenlist.add(canteen);
                            repeat1 = -7;
                            break;
                        }

                        case 7: {
                            break;
                        }
                    }
                    repeat1 = -7;
                    break;
                }
                    break;

                case 2:
                    int repeat2 = 7;
                    while (repeat2 > 0){
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("1. Display the details of Students ");
                    System.out.println("2. Display the details of Teachers ");
                    System.out.println("3. Display the details of Faculty ");
                    System.out.println("4. Display the details of Exam ");
                    System.out.println("5. Display the details of College Activities: ");
                    System.out.println("6. Display the details of Canteen Inventory: ");
                    System.out.println("7. Return");
                    System.out.println("-------------------------------------------------------------------");

                    suboption2 = Integer.parseInt(in.next());

                    switch (suboption2) {
                        case 1: {
                            displayAllStudent();
                            repeat2 = -7;
                            break;
                        }
                        case 2: {
                            displayAllTeacher();
                            repeat2 = -7;
                            break;
                        }
                        case 3: {
                            displayAllFaculty();
                            repeat2 = -7;
                            break;
                        }
                        case 4: {
                            displayAllExam();
                            repeat2 = -7;
                            break;
                        }
                        case 5: {
                            displayAllActivities();
                            repeat2 = -7;
                            break;
                        }
                        case 6: {
                            displayAllInventory();
                            repeat2 = -7;
                            break;
                        }
                        case 7: {
                            break;
                        }
                    }
                }
                break;

                case 3:
                    int repeat3 = 7;
                    while (repeat3 > 0){
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("---------------Please choose one of the below Options--------------");
                    System.out.println("1. Search Student details.");
                    System.out.println("2. Search Teacher details.");
                    System.out.println("3. Search Faculty details.");
                    System.out.println("4. Search Exam details.");
                    System.out.println("5. Search College Activity details.");
                    System.out.println("6. Search Canteen Inventory details.");
                    System.out.println("7. Return.");
                    System.out.println("-------------------------------------------------------------------");

                    suboption3 = Integer.parseInt(in.next());

                    switch (suboption3) {
                        case 1: {
                            System.out.println("Enter Student ID you want to Search: ");
                            int searchStudentId = in.nextInt();
                            searchStudent(searchStudentId);
                            repeat3 = -7;
                            break;
                        }

                        case 2: {
                            System.out.println("Enter Teacher ID you want to Search: ");
                            int searchTeacherId = in.nextInt();
                            searchTeacher(searchTeacherId);
                            repeat3 = -7;
                            break;
                        }

                        case 3: {
                            System.out.println("Enter Faculty ID you want to Search: ");
                            int searchFacultyId = in.nextInt();
                            searchFaculty(searchFacultyId);
                            repeat3 = -7;
                            break;
                        }

                        case 4: {
                            System.out.println("Enter Exam ID you want to Search: ");
                            int searchExamId = in.nextInt();
                            searchExam(searchExamId);
                            repeat3 = -7;
                            break;
                        }

                        case 5: {
                            System.out.println("Enter College Activity ID you want to Search: ");
                            int searchActivityId = in.nextInt();
                            searchActivity(searchActivityId);
                            repeat3 = -7;
                            break;
                        }

                        case 6: {
                            System.out.println("Enter Canteen Inventory ID you want to Search: ");
                            int searchInventoryId = in.nextInt();
                            searchInventory(searchInventoryId);
                            repeat3 = -7;
                            break;
                        }

                        case 7: {
                            break;
                        }
                    }
                }
                break;

                case 4:
                    int repeat4 = 7;
                    while (repeat4 > 0){
                        System.out.println("-------------------------------------------------------------------");
                        System.out.println("---------------Please choose one of the below Options--------------");
                        System.out.println("1. Funds available after Student's Fee Collection: ");
                        System.out.println("2. Funds available after Teacher's Salary Distribution: ");
                        System.out.println("3. Funds available after Faculty's Salary Distribution: ");
                        System.out.println("4. Funds available after Exam expenditure: ");
                        System.out.println("5. Funds available after College Activities: ");
                        System.out.println("6. Funds available after Canteen Expenditure: ");
                        System.out.println("7. Return");
                        System.out.println("-------------------------------------------------------------------");

                        suboption4 = Integer.parseInt(in.next());

                        switch (suboption4) {
                            case 1: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Please enter Student Id:");
                                int id = in.nextInt();
                                System.out.println("Please enter Fees:");
                                int fees = in.nextInt();
                                for (Student student : studentlist) {
                                    if (student.getStudentId() == id) {
                                        student.payFees(fees);
                                    }
                                }
                                System.out.println("Payment of fees done on " + FeesDate);
                                System.out.println("Available funds in MPSTME after fee collection is $" + MPSTME.getTotalMoneyEarned() + "\n");
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 2: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Please enter Teacher Id:");
                                int id = in.nextInt();
                                System.out.println("Please enter Salary:");
                                int salary = in.nextInt();
                                for (Teacher teacher : teacherlist) {
                                    if (teacher.getTeacherId() == id) {
                                        teacher.receiveSalary(salary);
                                    }
                                }

                                System.out.println("Payment of Salary of teachers done on " + SalaryDate);
                                System.out.println("Available funds in MPSTME after distribution of Teacher's salary is $" + MPSTME.getTotalMoneyEarned() + "\n");
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 3: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Please enter Faculty Id:");
                                int id = in.nextInt();
                                System.out.println("Please enter Salary:");
                                int salary = in.nextInt();
                                for (Faculty faculty : facultylist) {
                                    if (faculty.getFacultyId() == id) {
                                        faculty.receiveSalary(salary);
                                    }
                                }
                                System.out.println("Payment of Salary of faculty done on " + SalaryDate);
                                System.out.println("Available funds in MPSTME after distribution of Faculty's salary is $" + MPSTME.getTotalMoneyEarned() + "\n");
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 4: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Enter Exam Id: ");
                                int id = in.nextInt();
                                System.out.println("Enter Exam Expenditure: ");
                                int expenditure = in.nextInt();
                                for (Exam exam : examlist) {
                                    if (exam.getExamId() == id) {
                                        exam.payExpenditure(expenditure);
                                    }
                                }

                                System.out.println("Exam Expenditures is due on " + ExamDate);
                                System.out.println("Available funds in MPSTME after Exam expenditure is $" + MPSTME.getTotalMoneyEarned() + "\n");
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 5: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Enter College Activity Id: ");
                                int id = in.nextInt();
                                System.out.println("Enter Sponsorship: ");
                                int sponsorship = in.nextInt();
                                System.out.println("Enter Expenditure: ");
                                int expenditure = in.nextInt();
                                for (Activity activity : activitieslist) {
                                    if (activity.getActivityId() == id) {
                                        activity.receiveSponsorship(sponsorship);
                                        activity.payExpenditure(expenditure);
                                    }
                                }
                                System.out.println("College Activity Expenditures due on " + ActivityDate);
                                System.out.println("Available funds in MPSTME after Activities is $ " + MPSTME.getTotalMoneyEarned());
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 6: {
                                System.out.println("---------------------------------------------------------------");
                                System.out.println("Enter Canteen Inventory Id: ");
                                int id = in.nextInt();
                                System.out.println("Enter Profit: ");
                                int profit = in.nextInt();
                                System.out.println("Enter Expenditure: ");
                                int expenditure = in.nextInt();
                                for (Canteen canteen : canteenlist) {
                                    if (canteen.getInventoryId() == id) {
                                        canteen.receiveProfit(profit);
                                        canteen.payExpenditure(expenditure);
                                    }
                                }
                                System.out.println("Canteen Expenditures done on " + SalaryDate);
                                System.out.println("Available funds in MPSTME after Canteen expenditure is $" + MPSTME.getTotalMoneyEarned());
                                System.out.println("---------------------------------------------------------------");
                                repeat4 = -7;
                                break;
                            }

                            case 7: {
                                break;
                            }
                        }
                    }
                    break;

                    case 5: {
                        repeat = -5;
                        break;
                    }
                }

            }

        }

    public static void displayAllStudent() {
        for (Student st : studentlist) {
            System.out.println("Student Id: " + st.getStudentId() + " Student Name: " + st.getName() + " Stream: " + st.getStream()
                    + " Age: " + st.getAge() + " Fees Paid: " + st.getFeesPaid());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void displayAllTeacher() {
        for (Teacher st : teacherlist) {
            System.out.println("Teacher Id: " + st.getTeacherId() + " Teacher Name: " + st.getName() + " Subject: " + st.getSubject() + " Salary: " + st.getSalary());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void displayAllFaculty() {
        for (Faculty st : facultylist) {
            System.out.println("Faculty Id: " + st.getFacultyId() + " Faculty Name: " + st.getName() + " Faculty Department: " + st.getFacultydept() + " Salary: " + st.getSalary());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void displayAllExam() {
        for (Exam st : examlist) {
            System.out.println("Exam Id: " + st.getExamId() + " Subject: " + st.getExamsubject() + " Subject Code: " + st.getSubjectcode() + " Expenditure " + st.getExpenditure());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void displayAllActivities() {
        for (Activity st : activitieslist) {
            System.out.println("College Activity Id: " + st.getActivityId() + " Activity Name: " + st.getActivityname() + " Activity Department: " + st.getDepartment() + "Attendance: " + st.getFootfall() + " Sponsorships: " + st.getSponsorship() + "Expenditure: " + st.getExpenditure());
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void displayAllInventory() {
        for (Canteen st : canteenlist) {
            System.out.println("Inventory Id: " + st.getInventory() + " Inventory: " + st.getInventory() + " Quantity: " + st.getQuantity() + " Profit: " + st.getProfit() + " Expenditure: " + st.getExpenditure());
            System.out.println("-------------------------------------------------------------------");
        }
    }


    public static boolean checkStudentId ( int id){
        for (Student st : studentlist) {
            if (st.getStudentId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkTeacherId ( int id){
        for (Teacher st : teacherlist) {
            if (st.getTeacherId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkFacultyId ( int id){
        for (Faculty st : facultylist) {
            if (st.getFacultyId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExamId ( int id){
            for (Exam st : examlist) {
                if (st.getExamId() == id) {
                    return true;
                }
            }
            return false;
        }

        public static boolean checkActivityId ( int id){
            for (Activity st : activitieslist) {
                if (st.getActivityId() == id) {
                    return true;
                }
            }
            return false;
        }

        public static boolean checkInventoryId ( int id){
            for (Canteen st : canteenlist) {
                if (st.getInventoryId() == id) {
                    return true;
                }
            }
            return false;
        }


        private static void searchStudent ( int searchStudentId){
            boolean search = true;
            for (Student st : studentlist) {
                if (st.getStudentId() == searchStudentId) {
                    System.out.println("Student Id: " + st.getStudentId() + " Student Name: " + st.getName() + " Stream: " + st.getStream()
                            + " Age: " + st.getAge() + " Fees Paid: " + st.getFeesPaid());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchStudentId + " does not exist");
            }

        }

        private static void searchTeacher ( int searchTeacherId){
            boolean search = true;
            for (Teacher st : teacherlist) {
                if (st.getTeacherId() == searchTeacherId) {
                    System.out.println("Teacher Id: " + st.getTeacherId() + " Teacher Name: " + st.getName() + " Subject: " + st.getSubject() + " Salary: " + st.getSalary());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchTeacherId + " does not exist");
            }
        }

        private static void searchFaculty ( int searchFacultyId){
            boolean search = true;
            for (Faculty st : facultylist) {
                if (st.getFacultyId() == searchFacultyId) {
                    System.out.println("Faculty Id: " + st.getFacultyId() + " Faculty Name: " + st.getName() + " Faculty Department: " + st.getFacultydept() + " Salary: " + st.getSalary());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchFacultyId + " does not exist");
            }
        }

        private static void searchExam ( int searchExamId){
            boolean search = true;
            for (Exam st : examlist) {
                if (st.getExamId() == searchExamId) {
                    System.out.println("Exam Id: " + st.getExamId() + " Subject: " + st.getExamsubject() + " Subject Code: " + st.getSubjectcode() + " Expenditure " + st.getExpenditure());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchExamId + " does not exist");
            }
        }

        private static void searchActivity ( int searchActivityId){
            boolean search = true;
            for (Activity st : activitieslist) {
                if (st.getActivityId() == searchActivityId) {
                    System.out.println("College Activity Id: " + st.getActivityId() + " Activity Name: " + st.getActivityname() + " Activity Department: " + st.getDepartment() + "Attendance: " + st.getFootfall() + " Sponsorships: " + st.getSponsorship() + "Expenditure: " + st.getExpenditure());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchActivityId + " does not exist");
            }
        }

        private static void searchInventory ( int searchInventoryId){
            boolean search = true;
            for (Canteen st : canteenlist) {
                if (st.getInventoryId() == searchInventoryId) {
                    System.out.println("Inventory Id: " + st.getInventory() + " Inventory: " + st.getInventory() + " Quantity: " + st.getQuantity() + " Profit: " + st.getProfit() + " Expenditure: " + st.getExpenditure());
                    search = false;
                }
            }
            if (search) {
                System.out.println(searchInventoryId + " does not exist");
            }
        }


    }

