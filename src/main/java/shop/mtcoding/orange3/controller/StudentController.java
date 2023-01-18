package shop.mtcoding.orange3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.orange3.model.Student;
import shop.mtcoding.orange3.model.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping({ "/", "/student" })
    public String findAll(Model model) {
        List<Student> studentList = studentRepository.findAll();
        model.addAttribute("studentList", studentList);
        return "student/main";
    }

    @GetMapping("/student/{id}")
    public String findOne(@PathVariable int id, Model model) {
        Student student = studentRepository.findOne(id);
        model.addAttribute("student", student);
        return "student/detail";
    }

    @GetMapping("/student/addForm")
    public String addForm() {
        return "student/addForm";
    }

    @PostMapping("/student/add")
    public String add(String name, int grade, String email, Model model) {
        int result = studentRepository.insert(name, grade, email);
        if (result == 1) {
            return "redirect:/student";
        } else {
            return "redirct:/student/addForm";
        }
    }

    @PostMapping("/student/{id}/delete")
    public String delete(@PathVariable int id) {
        int result = studentRepository.delete(id);
        if (result == 1) {
            return "redirect:/student";
        } else {
            return "redirct:/student/" + id;
        }
    }

    @GetMapping("student/{id}/updateForm")
    public String updateForm(Model model, @PathVariable int id) {
        Student student = studentRepository.findOne(id);
        model.addAttribute("student", student);
        return "student/updateForm";
    }

    @PostMapping("student/{id}/update")
    public String updateForm(@PathVariable int id, int grade, String email) {
        int result = studentRepository.update(id, grade, email);
        if (result == 1) {
            return "redirect:/student/" + id;
        } else {
            return "redirct:/student/" + id + "/update";
        }
    }
}
