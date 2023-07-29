package org.myself.model;

import java.net.URL;

import java.util.Set;

public class Pet {

    public double id;
    public Category category;
    public String name;
    public Set<String> photoUrls;
    public Set<Tag> tags;
    public PetStatus status;

}
