package az.edu.java.studentproject.controller;

import az.edu.java.studentproject.model.request.StudentRequest;
import az.edu.java.studentproject.model.response.StudentResponse;
import az.edu.java.studentproject.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<StudentResponse> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentResponse getById(@PathVariable int id) {
        return studentService.getById(id);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public void create(@RequestBody StudentRequest request) {
        studentService.addStudent(request);
    }

    @PutMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void update(@PathVariable int id, @RequestBody StudentRequest request) {
        studentService.updateStudent(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
