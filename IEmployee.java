package iuh.fit;

public interface IEmployee {

//    public static final int WEEKS_PER_YEAR = 52;
    int WEEKS_PER_YEAR = 52;

//    public abstract Employee findEmployeeByID(String id);
    Employee findEmployeeByID(String id);

    Employee[] getEmployees();

    Employee[] sortEmployeesByName();

    Employee[] sortEmployeesByDOB();
}
