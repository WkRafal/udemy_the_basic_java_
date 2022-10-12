package org.example.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class DAOUsageExample {
    public static void main(String[] args) {

        ProjectService projectService = new ProjectService(new ProjectDaoDB());

        int randId = (new Random()).nextInt(99);
        Project project = new Project("project #" + randId, new Date());
        projectService.persist(project);

        List<Project> projects = projectService.findAll();
        projects.stream().forEach(p -> System.out.println(p));

        Project projectFromDB = projectService.findId(projects.get(0).getId());
        System.out.println("\nproject from DB: " + projectFromDB);

        projectService.delete(projectFromDB);
        System.out.println("project id: " + projectFromDB.getId() + "deleted");

        System.out.println("\nafter delete");
        projects = projectService.findAll();
        projects.stream().forEach(p -> System.out.println(p));

    }
}
