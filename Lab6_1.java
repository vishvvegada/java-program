import java.util.Scanner;

public class Lab6_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students for entry: ");
        int numOfStudents = sc.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nEnter student details " + (i + 1));
            System.out.print("Enter ID number: ");
            int id_no = sc.nextInt();
            System.out.print("Enter number of subjects registered: ");
            int no_of_subjects_registered = sc.nextInt();

            int[] subject_code = new int[no_of_subjects_registered];
            int[] subject_credit = new int[no_of_subjects_registered];
            String[] grade_obtained = new String[no_of_subjects_registered];

            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.print("Enter subject code for subject " + (j + 1) + ": ");
                subject_code[j] = sc.nextInt();

                System.out.print("Enter subject credits for subject " + (j + 1) + ": ");
                subject_credit[j] = sc.nextInt();

                System.out.print("Enter grade obtained for subject " + (j + 1) + ": ");
                grade_obtained[j] = sc.next();
            }

            students[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credit, grade_obtained);
        }
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + " SPI: " + students[i].getSpi());
        }
    }
}

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credit;
    String[] grade_obtained;
    double spi;

    Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credit, String[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credit = subject_credit;
        this.grade_obtained = grade_obtained;
        calculateSPI();
    }

    void calculateSPI() {
        double totalGradepoint = 0;
        double totalCredit = 0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            int gradePoint;
            switch (grade_obtained[i].toUpperCase()) {
                case "A":
                    gradePoint = 10;
                    break;
                case "B":
                    gradePoint = 8;
                    break;
                case "C":
                    gradePoint = 6;
                    break;
                case "P":
                    gradePoint = 4;
                    break;
                default:
                    gradePoint = 0;
                    break;
            }
            totalGradepoint += gradePoint * subject_credit[i];
            totalCredit += subject_credit[i];
        }
        spi = totalGradepoint / totalCredit;
    }

    public double getSpi() {
        return spi;
    }
}
