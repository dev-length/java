package ch17.sec07.exam02;

import ch17.sec07.exam01.Student;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<ch17.sec07.exam01.Student> studentList = new ArrayList<>();
        studentList.add(new ch17.sec07.exam01.Student("dd", 30));
        studentList.add(new ch17.sec07.exam01.Student("dd2", 20));
        studentList.add(new Student("dd3", 10));

        studentList.stream()
                .sorted((s1,s2)-> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s-> System.out.println(s.getName()+ " " + s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted((s1,s2)-> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s-> System.out.println(s.getName() + " " + s.getScore()));
    }
}
