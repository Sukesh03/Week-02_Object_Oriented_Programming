class Student {
    static String universityName = "Harvard University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sam", 'A');
        Student s2 = new Student(2, "Kavi", 'B');
        Student s3 = new Student(3, "Rekha", 'C');

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();
        s3.displayStudentDetails();
        System.out.println();

        s2.updateGrade('A');
        System.out.println();

        Student.displayTotalStudents();
    }
}
