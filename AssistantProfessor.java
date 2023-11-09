public class AssistantProfessor extends ABCEmployee {
    protected String summerCourseTitle;
    public double basicMonthlySalary;

    public AssistantProfessor(String firstName , String lastName, String phoneNumber, String address, int id, double basicMonthlySalary) {
        super(firstName, lastName, phoneNumber, address, id, basicMonthlySalary);
    }

    public void setSummerCourseTitle(String summerCourseTitle) {
        this.summerCourseTitle = summerCourseTitle;
    }

    public double calculateSummerPayment() {
        return 1.5 * basicMonthlySalary;
    }

    public double calculateAnnualPaymnet(){
        return super.calculateSalary() + calculateSummerPayment();
    }

    @Override
    public String getDetails() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "ID: " + id + "\n" +
                "Summer Course Title: " + summerCourseTitle + "\n" +
                "Summer Payment: " + calculateSummerPayment() + "\n" +
                "Total Bonus Payment: " + calculateSummerPayment() + "\n" +
                "Monthly Salary: " + monthlySalary + "\n" +
                "Annual Salary: " + calculateSalary() + "\n";
    }

}