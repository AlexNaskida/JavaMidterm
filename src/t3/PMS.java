package t3;

import java.util.ArrayList;
import java.util.List;

public class PMS {
    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee e = employeeList.get(i);
            if (e.getEmployeeName() != null && e.getEmployeeName().equals(employee.getEmployeeName())
                    && e.getSalary() == employee.getSalary()) {
                employeeList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e.getEmployeeName() + ", $" + e.getSalary() + ", Started on: " + e.getStartedWorking());
                System.out.println();
            }
        }
    }

    public boolean modifyEmployee(Employee target, Employee updated) {
        for (Employee current : employeeList) {
            if (current.getEmployeeName().equals(target.getEmployeeName()) && current.getSalary() == target.getSalary()) {
                current.setEmployeeName(updated.getEmployeeName());
                current.setSalary(updated.getSalary());
                current.setStartedWorking(updated.getStartedWorking());
                return true;
            }
        }
        return false;
    }

    public boolean modifyEmployeeSalary(String employeeName, int newSalary) {
        for (Employee current : employeeList) {
            if (current.getEmployeeName().equals(employeeName)) {
                current.setSalary(newSalary);
                return true;
            }
        }
        return false;
    }
}
