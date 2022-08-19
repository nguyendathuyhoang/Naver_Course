package com.likelion.threetier.controller;

import com.likelion.threetier.model.Student;
import com.likelion.threetier.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // trả data dưới dạng template (html)
//@RestController // trả data dưới dạng json
@RequestMapping("/restapi")
public class DemoController {
    @Autowired
    DemoService<Student> demoService;

    @GetMapping("/Student")
    public String Template(Model model)
    {
        model.addAttribute("Student", demoService.getStudent());
        return "index";
    }

    @GetMapping("/Student/{id}")
    @ResponseBody
    public Student returnJson(@PathVariable long id){
        return demoService.findStudent(id);
    }



    @RequestMapping("/DangNhap")
    public String Hello()
    {
        return "index1";
    }

}
