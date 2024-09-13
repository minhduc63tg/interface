package iuh.fit;

import java.time.LocalDate;

public final class Manager extends SalariedEmployee{

    private double weeklyBonus;

    public Manager(){
        super();
        this.weeklyBonus = 0.0;
    }

    public Manager(String id) {
        super(id);
        this.weeklyBonus = 0.0;
    }

    public Manager(String id, String name, LocalDate dob, double annualSalary, double weeklyBonus) {
        super(id, name, dob, annualSalary);
        this.weeklyBonus = weeklyBonus;
    }

    @Override
    public double weeklyPay() {
        return super.weeklyPay() + weeklyBonus;
    }

    public double getWeeklyBonus() {
        return weeklyBonus;
    }

    public void setWeeklyBonus(double weeklyBonus) {
        this.weeklyBonus = weeklyBonus;
    }
}
