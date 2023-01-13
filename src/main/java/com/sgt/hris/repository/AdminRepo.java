package com.sgt.hris.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class AdminRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Map<String,Object>> getEmployees(){
        return this.jdbcTemplate.queryForList("exec hr.sp_fetchemployee");

    }
    public List<Map<String,Object>> getAspirants(){
        return this.jdbcTemplate.queryForList("exec hr.sp_fetchjobAspirants");

    }
    public List<Map<String,Object>> getRoles(){
        return this.jdbcTemplate.queryForList("exec hr.sp_getRoles");

    }
    public List<Map<String,Object>> getDepartments(){
        return this.jdbcTemplate.queryForList("exec hr.sp_getDepartments");

    }
    public Map<String,Object> employee(Integer id) {

        return this.jdbcTemplate.queryForMap("exec hr.sp_getemployee ?",id);
    }
    public Map<String,Object> jobAspirant(Integer id) {

        return this.jdbcTemplate.queryForMap("exec hr.sp_getjobAspirant ?",id);
    }
    public void insertAspirant(String firstName,String lastName,String userName,String mobile,String email,String password,String skills,Integer deparment,Integer role){
        this.jdbcTemplate.update("EXEC blog.sp_addPost ?,?,?,?,?,?,?,?,?",firstName,lastName,userName,mobile,email,password,skills,deparment,role);
    }
}
