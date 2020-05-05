package com.olmedo.actividadlabo3.Controller;

import com.olmedo.actividadlabo3.Domain.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {
    private List<Student> students= new ArrayList<Student>();

    @GetMapping(path = "/ejemplo1", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String ejemplo1() {
        return "Bienvenidos \n"+"Programacion NCAPAS";
    }

    @GetMapping("/ejemplo2")
    public @ResponseBody List<Student> ejemplo2(){
        return Arrays.asList(
                new Student("nombre1","apellido","10/10/1992","ing Informatica", true),
                new Student("nombre2","apellido","10/10/1992","ing Informatica", false)
        );
    }

    @GetMapping("/inicio")
    public String inicio(Student student){
        return "index";
    }

    @PostMapping("/form")
    public ModelAndView proc(Student student){
        ModelAndView mav = new ModelAndView();
        students.add(student);
        mav.setViewName("index");
        mav.addObject("student", new Student());
        return mav;
    }
    @GetMapping("/listado")
    public ModelAndView listado(){
       /* for (Student e:this.students) {
            System.out.println(e.getNombre()+e.getApellido()+e.getCarrera());
        }*/
        ModelAndView mav = new ModelAndView();
        mav.setViewName("listado");
        mav.addObject("list", this.students);
        return mav;
    }

}
