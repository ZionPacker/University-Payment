public class ABCEmployee {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String address;
    protected int id;
    protected double monthlySalary;

    public ABCEmployee(String firstName, String lastName, String phoneNumber, String address, int id, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
        this.monthlySalary = monthlySalary;

    }

    public double calculateSalary(){
        return monthlySalary * 9;
    }

    public String getDetails() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "ID: " + id + "\n" +
                "Monthly Salary: " + monthlySalary + "\n" +
                "Annual Salary: " + calculateSalary() + "\n";
    }
}
