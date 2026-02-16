package az.edu.java.studentproject.service;

import az.edu.java.studentproject.dao.entity.Student;
import az.edu.java.studentproject.exception.UserNotFoundException;
import az.edu.java.studentproject.model.mapper.StudentMapper;
import az.edu.java.studentproject.model.request.StudentRequest;
import az.edu.java.studentproject.model.response.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> studentList = new ArrayList<>();
    private final StudentMapper mapper;
    private int idCounter = 3;

    public StudentService(StudentMapper mapper) {
        this.mapper = mapper;
        studentList.add(new Student(1, "Ali Aliyev", 20, "ali@mail.com"));
        studentList.add(new Student(2, "Vali Valiyev", 22, "vali@mail.com"));
    }

    public List<StudentResponse> getAllStudents() {
        return studentList.stream()
                .map(mapper::toResponse)
                .toList();
    }

    public StudentResponse getById(int id) {
        return studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .map(mapper::toResponse)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public void addStudent(StudentRequest request) {
        Student student = mapper.toEntity(idCounter++, request);
        studentList.add(student);
    }

    public void updateStudent(int id, StudentRequest request) {
        studentList.stream()
                .filter(s -> s.getId() == id)
                .forEach(s -> {
                    s.setName(request.getName());
                    s.setAge(request.getAge());
                    s.setEmail(request.getEmail());
                });
    }

    public void deleteStudent(int id) {
        studentList.removeIf(s -> s.getId() == id);
    }
}