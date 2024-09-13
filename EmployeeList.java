package iuh.fit;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeList implements IEmployee{

    private Employee[] employees;
    private int count = 0;

    public EmployeeList(){
        employees = new Employee[10];
    }

    public void addEmployee(Employee emp){
//      Check constraints

//      Successfully added
        employees[count++] = emp;
    }

    public void updateEmployee(Employee emp){
//      Check constraints

        Employee temp = findEmployeeByID(emp.getId());
//      Successfully updated
        if(temp != null){
            temp.setName(emp.getName());
            temp.setDob(emp.getDob());

            if(temp instanceof HourlyEmployee){
//                HourlyEmployee tempx = (HourlyEmployee) temp;
//                HourlyEmployee empx = (HourlyEmployee) emp;
                ((HourlyEmployee) temp).setHoursWorked(((HourlyEmployee) emp).getHoursWorked());
                ((HourlyEmployee) temp).setHourlyWage(((HourlyEmployee) emp).getHourlyWage());
            }else if (temp instanceof Manager){
//                your code here
            }else{
//                your code here
            }
        }
    }

    @Override
    public Employee findEmployeeByID(String id) {

        for (int i = 0; i < count; i++) {
            if(employees[i].getId().equalsIgnoreCase(id))
                return employees[i];
        }
        
        return null;
    }

    @Override
    public Employee[] getEmployees() {

        return Arrays.copyOf(employees, count);
    }

    @Override
    public Employee[] sortEmployeesByName() {
        Employee[] temp = Arrays.copyOf(employees, count);
        Arrays.sort(temp);
        return temp;
    }

    @Override
    public Employee[] sortEmployeesByDOB(){
        Employee[] temp = Arrays.copyOf(employees, count);

//        Arrays.sort(temp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return  o1.getDob().compareTo(o2.getDob());
//            }
//        });
         Arrays.sort(temp, new EmployeeCompareByDOB());
        return temp;
    }
}


class EmployeeCompareByDOB implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return  o1.getDob().compareTo(o2.getDob());
    }
}