package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("dd", 30));
        studentList.add(new Student("dd2", 20));
        studentList.add(new Student("dd3", 10));

        studentList.stream()
                .sorted()
                .forEach(s-> System.out.println(s.getName() + s.getScore()));
        System.out.println();
    }
}
