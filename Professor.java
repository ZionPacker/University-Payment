public class Professor extends AssistantProfessor {
    private double grantAmount;

    public Professor(String firstName, String lastName, String phoneNumber, String address, int id, double basicMonthlySalary) {
        super(firstName, lastName, phoneNumber, address, id, basicMonthlySalary);
    }

    public void setGrantAmount(double grantAmount) {
        this.grantAmount = grantAmount;
    }

    public double calculateBonusPayment() {
        if (grantAmount > 1000000) {
            return 7000;
        }
        return 0;
    }

    public double calculateAnnualPaymnet(){
        return super.calculateSalary() + calculateSummerPayment();
    }

    public String getDetails(){
        return super.getDetails() + "  " + calculateSummerPayment();
    }


}