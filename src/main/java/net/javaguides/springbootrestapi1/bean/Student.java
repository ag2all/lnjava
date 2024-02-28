package net.javaguides.springbootrestapi1.bean;

public class Student {
    private int id;
    private String first;
    private String last;

    public Student(int id, String first, String last) {
        this.id = id;
        this.first = first;
        this.last = last;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
