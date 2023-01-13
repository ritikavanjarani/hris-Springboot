package com.sgt.hris.web;

import com.sgt.hris.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@CrossOrigin(origins="http://localhost:4200")
@RestController

@RequestMapping("/hris")
public class AdminResource {

    @Autowired
    private AdminService adminService;
    @GetMapping("/employees")
    public List<Map<String,Object>> getEmployees(){
        return adminService.getEmployees();
    }
    @GetMapping("/aspirants")
    public List<Map<String,Object>> getAspirants(){
        return adminService.getAspirants();
    }
    @GetMapping("/emp/{id}")
    public Map<String,Object> employee(@PathVariable Integer id){
        return adminService.employee(id);
    }
    @GetMapping("/jobasp/{id}")
    public Map<String,Object> jobAspirant(@PathVariable Integer id){
        return adminService.jobAspirant(id);
    }
    @GetMapping("/roles")
    public List<Map<String,Object>> getRoles() {

        return adminService.getRoles();
    }
    @GetMapping("/departments")
    public List<Map<String,Object>> getDepartments() {

        return adminService.getDepartments();
    }
    @PostMapping("/job")
    public void insertAspirant(@RequestBody Map<String,Object> aspirantData){
        this.adminService.insertAspirant(aspirantData);

    }
}
