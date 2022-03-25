package com.sunglowsys.manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class EmployeeM {
    @Id
    private Integer eId;
    private String name;
    @ManyToMany
    private List<Project> projects;

    public EmployeeM() {
    }

    public EmployeeM(Integer eId, String name, List<Project> projects) {
        this.eId = eId;
        this.name = name;
        this.projects = projects;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }


}
