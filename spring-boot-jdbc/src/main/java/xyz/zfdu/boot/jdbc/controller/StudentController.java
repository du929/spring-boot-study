package xyz.zfdu.boot.jdbc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import xyz.zfdu.boot.jdbc.controller.dto.AjaxResponse;
import xyz.zfdu.boot.jdbc.entity.Student;
import xyz.zfdu.boot.jdbc.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@RestController
@RequestMapping(value = "/api/v1/students")
@Slf4j
@Validated
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("all")
    public AjaxResponse selectStudent(){
        List<Student> studentList = studentService.getAll();
        return AjaxResponse.success(studentList);
    }
    @GetMapping("{id}")
    public  AjaxResponse getById(@RequestParam int id){
        return AjaxResponse.success(studentService.getById(id));
    }
    @PostMapping()
    public  AjaxResponse postStudent(@RequestBody Student student){
        return AjaxResponse.success(studentService.postStudent(student));
    }
    @PutMapping()
    public  AjaxResponse updateStudent(@RequestBody Student student){

        return AjaxResponse.success(studentService.updateStudent(student));
    }
    @DeleteMapping()
    public AjaxResponse deleteById(@RequestParam int id){
        return AjaxResponse.success(studentService.deleteStudent(id));
    }

}
