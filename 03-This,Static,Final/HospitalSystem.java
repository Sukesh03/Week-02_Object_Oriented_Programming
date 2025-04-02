class Patient {
    static String hospitalName = "AIMS";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Raj", 45, "Fever");
        Patient p2 = new Patient(102, "Neha", 34, "Fracture");
        Patient p3 = new Patient(103, "Ravi", 60, "Heart Disease");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();
        p3.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();
    }
}
