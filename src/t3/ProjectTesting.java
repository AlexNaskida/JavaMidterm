package t3;

public class ProjectTesting {
    public static void main(String[] args) {

        PMS pms = new PMS();

        // Defining the first project with name, price, and the date where it started
        Project proj1 = new Project();
        proj1.setProjectName("Website Development");
        proj1.setPrice(50000);
        proj1.setStartedWorking("2023-01-12");

        // Defining the second project with name, price, and the date where it started
        Project proj2 = new Project();
        proj2.setProjectName("Mobile App Development");
        proj2.setPrice(60000);
        proj2.setStartedWorking("2024-06-21");

        pms.addProject(proj1);
        pms.addProject(proj2);

        pms.printProjects();

        // Modifying a project
        Project updatedProj = new Project();
        updatedProj.setProjectName("Website Revamp");
        updatedProj.setPrice(55000);
        updatedProj.setStartedWorking("2023-01-12");

        // checking if the modifyProject returned True. If so that means that the project was modified
        boolean modified = pms.modifyProject(proj1, updatedProj);
        if (modified) {
            System.out.println("************************************");
            System.out.println("Project " + updatedProj.getProjectName() + " updated successfully");
            System.out.println("************************************");
        }

        pms.printProjects();

        // Removing a project
        Project toRemove = new Project();
        toRemove.setProjectName("Test Project");
        toRemove.setPrice(45000);
        toRemove.setStartedWorking("2022-05-05");

        pms.addProject(toRemove);
        System.out.println("************************************");
        pms.printProjects();
        System.out.println("************************************");

        pms.removeProject(toRemove);

        System.out.println("************************************");
        pms.printProjects();
        System.out.println("************************************");

        // Testing feature where we modify the project's current price
        // checking if the modifyProjectPrice returned True. If so that means that the project's price was modified
        boolean priceUpdated = pms.modifyProjectPrice("Mobile App Development", 65000);
        if (priceUpdated) {
            System.out.println("Price updated for Mobile App Development.");
        } else {
            System.out.println("Failed to update price.");
        }

    }
}
