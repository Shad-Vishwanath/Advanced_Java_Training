import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Generate Bill");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor ID: ");
                    int dId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String dName = sc.nextLine();

                    System.out.print("Enter Doctor Age: ");
                    int dAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Doctor Gender: ");
                    String dGender = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();

                    System.out.print("Enter Consultation Fee: ");
                    double fee = sc.nextDouble();

                    Doctor doctor = new Doctor(dId, dName, dAge, dGender, specialization, fee);
                    hospital.addDoctor(doctor);
                    break;

                case 2:
                    System.out.print("Enter Patient ID: ");
                    int pId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pName = sc.nextLine();

                    System.out.print("Enter Patient Age: ");
                    int pAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Gender: ");
                    String pGender = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    Patient patient = new Patient(pId, pName, pAge, pGender, disease);
                    hospital.addPatient(patient);
                    break;

                case 3:
                    hospital.showAllDoctors();
                    break;

                case 4:
                    hospital.showAllPatients();
                    break;

                case 5:
                    System.out.print("Enter Appointment ID: ");
                    int aId = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int patientId = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int doctorId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Appointment Date: ");
                    String date = sc.nextLine();

                    hospital.bookAppointment(aId, patientId, doctorId, date);
                    break;

                case 6:
                    hospital.showAppointments();
                    break;

                case 7:
                    System.out.print("Enter Patient ID: ");
                    int billPatientId = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int billDoctorId = sc.nextInt();

                    hospital.generateBill(billPatientId, billDoctorId);
                    break;

                case 8:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
