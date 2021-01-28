package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for(Employee employee : employeeList){
            employee.showEmployeeDetails();
        }
    }
}
