public class Professor extends AssistantProfessor {
    private double grantAmount;

    public Professor(String firstName, String lastName, String phoneNumber, String address, int id, double basicMonthlySalary) {
        super(firstName, lastName, phoneNumber, address, id, basicMonthlySalary);
    }

    public void setGrantAmount(double grantAmount) {
        this.grantAmount = grantAmount;
    }

    public double calculateBonusPayment() {
        if (grantAmount > 1_000_000) {
            return 7000;
        }
        return 0;
    }

    public double calculateTotalBonusPayment() {
        return calculateBonusPayment() + calculateSummerPayment();
    }

    public double calculateAnnualPaymnet(){
        return super.calculateSalary() + calculateSummerPayment() + calculateBonusPayment();
    }

    @Override
    public String getDetails() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "ID: " + id + "\n" +
                "Summer Course Title: " + summerCourseTitle + "\n" +
                "Summer Payment: " + calculateSummerPayment() + "\n" +
                "Bonus Payment: " + calculateBonusPayment() + "\n" +
                "Total Bonus Payment: " + calculateTotalBonusPayment() + "\n" +
                "Monthly Salary: " + monthlySalary + "\n" +
                "Annual Salary: " + calculateSalary() + "\n";
    }


}