package com.sgt.hris.service;

import com.sgt.hris.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    public List<Map<String,Object>> getEmployees(){
        return adminRepo.getEmployees();

    }
    public List<Map<String,Object>> getAspirants(){
        return adminRepo.getAspirants();

    }
    public List<Map<String,Object>> getRoles(){
        return adminRepo.getRoles();

    }
    public List<Map<String,Object>> getDepartments(){
        return adminRepo.getDepartments();

    }
    public Map<String,Object> employee(Integer id){
        return adminRepo.employee(id);

    }
    public Map<String,Object> jobAspirant(Integer id){
        return adminRepo.jobAspirant(id);

    }
    public void insertAspirant(Map<String,Object> blogData){

        String firstName=(String) blogData.get("firstName");
        String lastName=(String) blogData.get("lastName");
        String userName=(String) blogData.get("userName");
        String mobile=(String) blogData.get("mobile");
        String email=(String) blogData.get("email");
        String password=(String) blogData.get("password");
        String skills=(String) blogData.get("skills");
        Integer department=(Integer) blogData.get("department");
        Integer role=(Integer) blogData.get("role");

        this.adminRepo.insertAspirant(firstName,lastName,userName,mobile,email,password,skills,department,role);




    }


}
