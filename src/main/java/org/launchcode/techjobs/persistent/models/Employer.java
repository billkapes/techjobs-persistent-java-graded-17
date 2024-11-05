package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String location;

    public Employer() {}

    public @NotEmpty @Size(min = 2, max = 100) String getLocation() {
        return location;
    }

    public void setLocation(@NotEmpty @Size(min = 2, max = 100) String location) {
        this.location = location;
    }
}
