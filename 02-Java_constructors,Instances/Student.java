public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Arjun Nair", 8.5);
        s1.displayStudentInfo();
        s1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Neha Joshi", 9.2, "Artificial Intelligence");
        pg.displayPGStudentInfo();
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPGStudentInfo() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name (protected): " + name);
        System.out.println("CGPA (via getter): " + getCGPA());
        System.out.println("Research Topic: " + researchTopic);
        System.out.println();
    }
}
