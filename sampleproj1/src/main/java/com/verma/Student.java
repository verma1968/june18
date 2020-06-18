/*
 */
package com.verma;

/**
 * @author verma
 */
public class Student {
    private String first;
    private String last;

    @Override
    public String toString() {
        return "Student{" + "first=" + first + ", last=" + last + '}';
    }

    public Student() {
    }
    
    
        public Student(String first, String last) {
        this.first = first;
        this.last = last;
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
