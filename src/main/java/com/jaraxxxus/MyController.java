package com.jaraxxxus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
    static {
        System.out.println("ya rodilsya");
    }

    @RequestMapping("/")
    public String showFirstView(){
        for (int i = 0; i < 10; ++i){
            System.out.println("asdasdas");
        }

        return "first_view";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask_emp_details_view";
    }
    /*
    @RequestMapping("/showDetails")
    public String ShowEmployeeDetails(){
        return "show_emp_details_view";
    }*/

//    @RequestMapping("/showDetails")
//    public String ShowEmployeeDetails(HttpServletRequest request, Model model){
//        String employeeName = request.getParameter("EmployeeName");
//        employeeName = "Mr." + employeeName;
//        model.addAttribute("employeeName", employeeName);
//        return "show_emp_details_view";
//    }

    /*
    @RequestMapping("/showDetails")
    public String ShowEmployeeDetails(@RequestParam("EmployeeName") String employeeName, Model model){
        employeeName = "Mr." + employeeName;
        model.addAttribute("employeeName", employeeName);
        return "show_emp_details_view";
    }*/

    @RequestMapping("/showDetails")
    public String ShowEmployeeDetails(@ModelAttribute("employee") Employee employee){
        employee.setSalary(employee.getSalary() * 100);

        return "show_emp_details_view";
    }
}
