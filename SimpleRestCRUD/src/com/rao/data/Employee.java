package com.rao.data;

/**
 * Created by Vinay on 7/23/2015.
 */
public class Employee {
    private final long id;
    private final String name;

    public Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee(){
        this(0, "Default");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
