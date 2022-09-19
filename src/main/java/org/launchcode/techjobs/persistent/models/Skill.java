package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

//    added entity, created no arg consturctor with accessor methods

//    @NotBlank
//    @Size(min = 3, max = 255, message = "Description cannot exceed 255 Characters")

    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}