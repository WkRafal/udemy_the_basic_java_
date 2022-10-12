package org.example.dao;

import java.util.List;

public class ProjectService {
    private AbstractDaoInterface<Project> projectDAO;

    public ProjectService(AbstractDaoInterface<Project> projectDAO) {
        this.projectDAO = projectDAO;
    }

    public void persist(Project entity) {
        projectDAO.persist(entity);
    };
    public void update(Project entity){
        projectDAO.update(entity);
    };
    public Project findId(Integer id) {
        return projectDAO.findId(id);
    };
    public void delete(Project entity) {
        projectDAO.delete(entity);
    };
    public void deleteAll() {
        projectDAO.deleteAll();
    };
    public List<Project> findAll() {
        return projectDAO.findAll();
    };
}
