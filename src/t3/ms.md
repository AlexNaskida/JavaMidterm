# Project Management System

## Description

This document describes a basic Project Management System (PMS) in Java that manages project data. The system allows adding, removing, and modifying projects, as well as viewing project information.

## System Components
The system consists of three main classes:

1. **Project** - Stores project data such as project name, price, and the date it started.
2. **PMS** - Manages project operations such as adding, removing, modifying, and viewing projects.
3. **ProjectTesting** - Tests the functionality of the `PMS` class by performing operations on project data.

## New Features in PMS Class

In the `PMS` class, two new features were added to enhance project management:

```java
// Updates full project info if both name and price match
public boolean modifyProject(Project target, Project updated) {
   for (Project current : projectList) {
       // Match by name and current price
       if (current.getProjectName().equals(target.getProjectName()) && current.getPrice() == target.getPrice()) {
           // Update name, price, and start date
           current.setProjectName(updated.getProjectName());
           current.setPrice(updated.getPrice());
           current.setStartedWorking(updated.getStartedWorking());
           return true;
       }
   }
   return false;
}
   public boolean modifyProjectPrice(String projectName, int newPrice) {
    for (Project current : projectList) {
        if (current.getProjectName().equals(projectName)) {
            current.setPrice(newPrice);
            return true;
        }
    }
    return false;
}
```
