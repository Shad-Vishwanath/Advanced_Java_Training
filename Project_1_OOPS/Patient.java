class Patient extends Person {
    private String disease;

    public Patient(int id, String name, int age, String gender, String disease) {
        super(id, name, age, gender);
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Disease: " + disease);
        System.out.println("---------------------------");
    }
}
