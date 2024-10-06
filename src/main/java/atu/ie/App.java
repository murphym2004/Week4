package atu.ie;

public class App {
    private String name;
    private String course;
    private String email;

    public App() {
        this.name = null;
        this.course = null;
        this.email = null;

    }

    public App(String name) {
        this.name = name;
        this.course = null;
        this.email = null;
    }
    public App(String name, String course, String email) {
        this.name = name;
        this.course = course;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
