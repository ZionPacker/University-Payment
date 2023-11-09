public class AssistantProfessor extends ABCEmployee {
    private String summerCourseTitle;
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

}