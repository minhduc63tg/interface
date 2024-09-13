package iuh.fit;

import java.time.LocalDate;

public class SalariedEmployee extends  Employee{

    private static final int WEEKS_PER_YEAR = 52;
    protected double annualSalary;

    public SalariedEmployee(){
        super();
        this.annualSalary = 0.0;
    }

    public SalariedEmployee(String id) {
        super(id);
        this.annualSalary = 0.0;
    }

    public SalariedEmployee(String id, String name, LocalDate dob, double annualSalary) {
        super(id, name, dob);
        this.annualSalary = annualSalary;
    }

    @Override
    public double weeklyPay() {
        return annualSalary / WEEKS_PER_YEAR;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
