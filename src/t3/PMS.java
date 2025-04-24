package t3;

import java.util.ArrayList;
import java.util.List;

public class PMS {
    private List<Project> projectList = new ArrayList<>();

    public void addProject(Project project) {
        projectList.add(project);
    }

    public boolean removeProject(Project project) {
        for (int i = 0; i < projectList.size(); i++) {
            Project p = projectList.get(i);
            if (p.getProjectName() != null && p.getProjectName().equals(project.getProjectName())
                    && p.getPrice() == project.getPrice()) {
                projectList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printProjects() {
        if (projectList.isEmpty()) {
            System.out.println("No projects found.");
        } else {
            for (Project p : projectList) {
                System.out.println(p.getProjectName() + ", Price: $" + p.getPrice() + ", Started on: " + p.getStartedWorking());
                System.out.println();
            }
        }
    }

    public boolean modifyProject(Project target, Project updated) {
        for (Project current : projectList) {
            if (current.getProjectName().equals(target.getProjectName()) && current.getPrice() == target.getPrice()) {
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
}
