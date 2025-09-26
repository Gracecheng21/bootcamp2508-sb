package com.bootcamp.demo.demo_sb_calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import com.bootcamp.demo.demo_sb_calculator.model.Database;
import com.bootcamp.demo.demo_sb_calculator.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class StudentController {
  @PostMapping(value = "/student")
  public Student createStudent(@RequestBody Student student) {
      if (Database.studentDatabase.add(student)) {
        return student;
      }
      return null;
  }
  
  // ! Put -> assume 100% trust API User
  // @PutMapping(value = "/student/{id}")
  // public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
  @PutMapping(value = "/student/{id}")
  public Student updateStudent(@RequestParam Long id, @RequestBody Student student) {
      for (int i = 0; i < Database.studentDatabase.size(); i++) {
        if (id.equals(Database.studentDatabase.get(i).getId())) {
          return Database.studentDatabase.set(i, student);
        }
      }
      return null;
  }

  // Update: PUT and PATCH
  // ! Patch ->

  // URL with parameters -> Two Designs
  // 1. Path Variable: http://localhost:8092/student/id/1/name/John // searching
  // @PatchMapping(value = "/student/id/{id}/name/{name}")
  // public Student patchStudent(@PathVariable Long id, @RequestBody String name) {

  // ! 2. Request Parameter: http://localhost:8092/student?id=1&name=John
  @PatchMapping(value = "/student")
  public Student patchStudentName(@RequestParam Long id, @RequestParam String name) {
      for (int i = 0; i < Database.studentDatabase.size(); i++) {
        if (id.equals(Database.studentDatabase.get(i).getId())) {
          Student student = Database.studentDatabase.get(i);
          student.setName(name);
          return Database.studentDatabase.set(i, student);
        }
      }
      return null;
  }

  // Get all -> return List<Film>
  @GetMapping("/students")
  public List<Student> getAllStudents() {
    return Database.studentDatabase;
  }
}
