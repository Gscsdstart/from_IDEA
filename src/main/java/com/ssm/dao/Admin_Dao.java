package com.ssm.dao;

import com.ssm.model.Admin;

import java.util.List;

public interface Admin_Dao {

    Admin find_Admin_By_Id(int admin_id);

    List<Admin> find_Admin_All();

}
