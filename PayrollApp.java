package iuh.fit;

import java.time.LocalDate;

public class PayrollApp {
    public static void main(String[] args) {

        Employee emp1 = new HourlyEmployee("EMP101", "Khanh Nguyen", LocalDate.of(2000,3,15), 45, 10.0);
        Employee emp2 = new SalariedEmployee("EMP102","Le Lan",LocalDate.of(1999,4,25), 12000.0);
        Employee emp3 = new Manager("EMP103","Tran Lan",LocalDate.of(1987,4,25), 15000.0,5.0);

        IEmployee employees = new EmployeeList();
        ((EmployeeList)employees).addEmployee(emp1);
        ((EmployeeList)employees).addEmployee(emp2);
        ((EmployeeList)employees).addEmployee(emp3);


        emp1 = new HourlyEmployee("EMP101", "Khanh Nguyen Thi Hoang", LocalDate.of(1993,3,15), 50, 10.0);
        ((EmployeeList)employees).updateEmployee(emp1);

        Employee[] list =  employees.sortEmployeesByDOB();
        for (Employee emp : list)
            System.out.println(emp);

//        Employee[] list = employees.sortEmployeesByName();
//        for (Employee emp : list)
//            System.out.println(emp);

//        Employee[] list = employees.getEmployees();
//        for (Employee emp: list)
//            System.out.println(emp);

//        Employee temp = employees.findEmployeeByID("EMP102");
//        System.out.println(temp);


//        Employee emp4 = new Manager("EMP104");
//        Employee emp5 = new HourlyEmployee("EMP105");

//        ((HourlyEmployee) emp1).getTest();

//        System.out.println(emp1);
//        System.out.println(emp2);
//        System.out.println(emp3);

//        CRUD: Create, Read, Update, Delete
    }
}
