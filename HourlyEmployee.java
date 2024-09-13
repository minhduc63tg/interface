package iuh.fit;

import java.time.LocalDate;

public  class HourlyEmployee extends Employee {//is-a
    private static final int HOURS_MAX = 40;

    private int hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(){
//1
        super();
        this.hoursWorked = 0;
        this.hourlyWage = 0.0;
//2
//        this("","",LocalDate.now(),0,0.0);
    }

    public HourlyEmployee(String id) {
        super(id);
        this.hoursWorked = 0;
        this.hourlyWage = 0.0;
    }

    public HourlyEmployee(String id, String name, LocalDate dob, int hoursWorked, double hourlyWage){
        super(id, name, dob);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double weeklyPay() {
        return hoursWorked > HOURS_MAX
                ? (HOURS_MAX + (hoursWorked - HOURS_MAX) * 1.5)* hourlyWage
                : hoursWorked * hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

//    @Override
//    public void printInfor() {
//        super.printInfor();
//        System.out.println("Hourly employee class");
//    }

//    public void getTest(){
//        super.printInfor();
//    }
}
