class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, int age, String gender, String specialization, double consultationFee) {
        super(id, name, age, gender);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: ₹" + consultationFee);
        System.out.println("---------------------------");
    }
}
