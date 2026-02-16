package az.edu.java.studentproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
}
