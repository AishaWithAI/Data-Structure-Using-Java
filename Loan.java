import java.util.Date;

public class Loan {
    private double AnnualInterestRate;
    private int NumberOfYears;
    private double LoanAmount;
    private Date LoanDate;

    //no-arg constructors
    public Loan(){
        AnnualInterestRate=2.5;
        NumberOfYears=1;
        LoanAmount=1000;
        LoanDate=new Date();
    }
    //parameterized constructors
    public Loan(
            double AnnualInterestRate,
            int NumberOfYears,
            double LoanAmount,
            Date LoanDate
    ){
        this.AnnualInterestRate = AnnualInterestRate;
        this.NumberOfYears = NumberOfYears;
        this.LoanAmount = LoanAmount;
        this.LoanDate= LoanDate;
    }
    //getters
    public double getAnnualInterestRate(){
        return AnnualInterestRate;
    }

    public int getNumberOfYears() {
        return NumberOfYears;
    }

    public double getLoanAmount() {
        return LoanAmount;
    }

    public Date getLoanDate() {
        return LoanDate;
    }
    //setters
    public void setAnnualInterestRate(double AnnualInterestRate){
        this.AnnualInterestRate = AnnualInterestRate;

    }

    public void setNumberOfYears(int numberOfYears) {
        this.NumberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.LoanAmount = loanAmount;
    }

    //calculating
    public double getMonthlyPayment(){
        double MonthlyInterestRate= AnnualInterestRate/1200;
        return LoanAmount*MonthlyInterestRate/
                (1-Math.pow(1+MonthlyInterestRate,-NumberOfYears*12));
    }

    public double getTotalAmount(){
        return getMonthlyPayment()*NumberOfYears*12;
    }
}
