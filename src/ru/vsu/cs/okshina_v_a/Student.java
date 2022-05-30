package ru.vsu.cs.okshina_v_a;

public class Student implements Comparable<Student> {

    private int courseNumber;
    private int groupNumber;
    private String surname;
    private String name;

    public Student(int courseNumber, int groupNumber, String surname, String name) {
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
        this.surname = surname;
        this.name = name;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo( Student s ) {
        if( !surname.equalsIgnoreCase( s.surname) ) {
            return surname.compareToIgnoreCase( s.surname );
        }
        return Integer.compare(courseNumber, s.courseNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + " : " + courseNumber + " курс, " + groupNumber + " группа";
    }
}