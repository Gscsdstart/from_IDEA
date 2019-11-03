package com.ssm.service.impl;

import com.ssm.dao.Admin_Dao;
import com.ssm.model.Admin;
import com.ssm.service.Admin_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("adminService")
@Transactional
public class Admin_Service_Impl implements Admin_Service {

    @Autowired
    private Admin_Dao admin_dao;

    @Override
    public Admin get_Admin_By_Id(int admin_id) {
        return admin_dao.find_Admin_By_Id(admin_id);
    }

    @Override
    public List<Admin> get_Admin_All() {
        return admin_dao.find_Admin_All();
    }

}
