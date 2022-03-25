package com.sunglowsys.manyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private Integer pId;
    private String projectName;

    @ManyToMany(mappedBy = "projects")
    private List<EmployeeM> employies;

    public Project() {
    }

    public Project(Integer pId, String projectName, List<EmployeeM> employies) {
        this.pId = pId;
        this.projectName = projectName;
        this.employies = employies;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<EmployeeM> getEmployies() {
        return employies;
    }

    public void setEmployies(List<EmployeeM> employies) {
        this.employies = employies;
    }
}
