package t3;

public class OrganizationTesting {
    public static void main(String[] args) {

        PMS pms = new PMS();

        // Defining the first employee with this name, salary and the date where he started working
        Employee emp1 = new Employee();
        emp1.setEmployeeName("John Doe");
        emp1.setSalary(50000);
        emp1.setStartedWorking("2023-01-12");

        // Defining the second employee with this name, salary and the date where he started working
        Employee emp2 = new Employee();
        emp2.setEmployeeName("Jane Smith");
        emp2.setSalary(60000);
        emp2.setStartedWorking("2024-06-21");

        pms.addEmployee(emp1);
        pms.addEmployee(emp2);

        pms.printEmployees();

        // Modifying an employee
        Employee updatedEmp = new Employee();
        updatedEmp.setEmployeeName("John Doe Jr.");
        updatedEmp.setSalary(55000);
        updatedEmp.setStartedWorking("2023-01-12");

        // checking if the modifyEmployee returned True. If so that means that the employee was modified
        boolean modified = pms.modifyEmployee(emp1, updatedEmp);
        if (modified) {
            System.out.println("************************************");
            System.out.println("Employee " + updatedEmp.getEmployeeName() + " updated successfully");
            System.out.println("************************************");
        }

        pms.printEmployees();

        // Removing an employee
        Employee toRemove = new Employee();
        toRemove.setEmployeeName("Test User");
        toRemove.setSalary(45000);
        toRemove.setStartedWorking("2022-05-05");

        pms.addEmployee(toRemove);
        System.out.println("************************************");
        pms.printEmployees();
        System.out.println("************************************");

        pms.removeEmployee(toRemove);

        System.out.println("************************************");
        pms.printEmployees();
        System.out.println("************************************");
        

        // Testing feature where we modify the employees current salary
        // checking if the modifyEmployeeSalary returned True. If so that means that the employee's salary was modified
        boolean salaryUpdated = pms.modifyEmployeeSalary("Jane Smith", 65000);
        if (salaryUpdated) {
            System.out.println("Salary updated for Jane Smith.");
        } else {
            System.out.println("Failed to update salary.");
        }

    }

}
