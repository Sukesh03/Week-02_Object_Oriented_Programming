public class Course {
    private String courseName;
    private int duration; // in weeks
    private double fee;
    private static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course.updateInstituteName("Tech Academy");

        Course c1 = new Course("Java Programming", 8, 5000);
        Course c2 = new Course("Web Development", 10, 7500);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("X Institute");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
