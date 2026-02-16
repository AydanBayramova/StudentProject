package az.edu.java.studentproject.model.mapper;

import az.edu.java.studentproject.dao.entity.Student;
import az.edu.java.studentproject.model.request.StudentRequest;
import az.edu.java.studentproject.model.response.StudentResponse;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    public StudentResponse toResponse(Student student) {
        StudentResponse response = new StudentResponse();
        response.setId(student.getId());
        response.setName(student.getName());
        response.setEmail(student.getEmail());
        return response;
    }

    public Student toEntity(int id, StudentRequest request) {
        return new Student(id, request.getName(), request.getAge(), request.getEmail());
    }
}