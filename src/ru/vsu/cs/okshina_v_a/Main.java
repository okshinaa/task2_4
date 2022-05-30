package ru.vsu.cs.okshina_v_a;

import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new FileReader("input.txt"));

        int nStudent = 5;
        Student[] studentArray = new Student[nStudent];
        Scanner lineScanner;

        int counter = 0;
        while (scanner.hasNext()) {
            lineScanner = new Scanner(scanner.nextLine());
            String surname = lineScanner.next();
            String name = lineScanner.next();
            int courseNumber = lineScanner.nextInt();
            int groupNumber = lineScanner.nextInt();

            studentArray[counter++] = new Student(courseNumber, groupNumber, name, surname);
            lineScanner.close();
        }
        System.out.println("Список студентов:");
        for(int j = 0; j < counter; j++){
            System.out.println(studentArray[j]);

        }
        System.out.println();


        Arrays.sort(studentArray,0,counter, Comparator.comparingInt(Student::getCourseNumber));
        System.out.println("Список отсортирован по номеру курса!");
        for(int j = 0; j < counter; j++){
            System.out.println(studentArray[j]);
        }
        System.out.println();

        Arrays.sort(studentArray,0,counter, Comparator.comparing(Student::getGroupNumber));
        System.out.println("Список отсортирован по номеру группы!");
        for(int j = 0; j < counter; j++){
            System.out.println(studentArray[j]);
        }
        System.out.println();

        Arrays.sort(studentArray,0,counter, Comparator.comparing(Student::getName));
        System.out.println("Список осортирован по фамилии!");
        for(int j = 0; j < counter; j++){
            System.out.println(studentArray[j]);
        }
    }
}