import java.util.ArrayList;

class Hospital {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public void showAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available.");
            return;
        }
        for (Doctor doctor : doctors) {
            doctor.displayInfo();
        }
    }

    public void showAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
            return;
        }
        for (Patient patient : patients) {
            patient.displayInfo();
        }
    }

    public Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }

    public Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public void bookAppointment(int appointmentId, int patientId, int doctorId, String date) {
        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        Appointment appointment = new Appointment(appointmentId, patient, doctor, date);
        appointments.add(appointment);
        System.out.println("Appointment booked successfully.");
    }

    public void showAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments booked.");
            return;
        }
        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }

    public void generateBill(int patientId, int doctorId) {
        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);

        if (patient == null || doctor == null) {
            System.out.println("Invalid patient or doctor ID.");
            return;
        }

        double totalBill = doctor.getConsultationFee();

        System.out.println("----- BILL -----");
        System.out.println("Patient Name: " + patient.getName());
        System.out.println("Doctor Name: " + doctor.getName());
        System.out.println("Consultation Fee: ₹" + doctor.getConsultationFee());
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("----------------");
    }
}
