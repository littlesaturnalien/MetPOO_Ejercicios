package models;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void teaching(Course course) {
        System.out.println(name + " is teaching " + course.getName());
    }
}
