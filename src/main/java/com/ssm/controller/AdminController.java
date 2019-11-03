package com.ssm.controller;


import com.ssm.model.Admin;
import com.ssm.service.Admin_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private Admin_Service admin_service;

    @RequestMapping("/admins")
    public ModelAndView findAdminAll(ModelAndView modelAndView) {
        System.out.println("-------------没有到这里来---------?1111111111");
        List<Admin> admin_All = admin_service.get_Admin_All();
        System.out.println("-------------没有到这里来---------?22222222222");
        for (Admin admin:admin_All) {
            System.out.println("查询到的内容为: "+admin);
        }
        modelAndView.addObject("adminAll",admin_All);
        modelAndView.setViewName("/findAll");
        return modelAndView;
    }


    @RequestMapping("/admins/{id}")
    public ModelAndView findAdminById(@PathVariable("id") int id, ModelAndView modelAndView) {
        System.out.println("-------------到这里来---------");
        Admin admin = admin_service.get_Admin_By_Id(id);
        modelAndView.addObject("admin", admin);
        System.out.println(admin);
        modelAndView.setViewName("/findById");
        return modelAndView;
    }


}
