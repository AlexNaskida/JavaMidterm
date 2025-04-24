# Project Management System

## Description

This document describes a basic Project Management System (PMS) in Java that manages employee data. The system allows adding, removing, and modifying employees, as well as viewing employee information.

## System Components
The system consists of three main classes:

Employee - Stores employee data
PMS - Manages employee operations
OrganizationTesting - Tests the functionality

## New Feature

In PMS Class I added two new feature for managemtn of employees. One of them changed the name and surname of employee, another one adjusts salary.


```java 
// Updates full employee info if both name and salary match
public boolean modifyEmployee(Employee target, Employee updated) {
    for (Employee current : employeeList) {
        // Match by name and current salary
        if (current.getEmployeeName().equals(target.getEmployeeName()) && current.getSalary() == target.getSalary()) {
            // Update name, salary, and start date
            current.setEmployeeName(updated.getEmployeeName());
            current.setSalary(updated.getSalary());
            current.setStartedWorking(updated.getStartedWorking());
            return true;
        }
    }
    return false;
}

// Updates only the salary of the employee with the given name
public boolean modifyEmployeeSalary(String employeeName, int newSalary) {
    for (Employee current : employeeList) {
        if (current.getEmployeeName().equals(employeeName)) {
            current.setSalary(newSalary);
            return true;
        }
    }
    return false;
}

```

As you can see