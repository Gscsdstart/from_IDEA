package com.ssm.service;

import com.ssm.model.Admin;

import java.util.List;

public interface Admin_Service {

    Admin get_Admin_By_Id(int admin_id);

    List<Admin> get_Admin_All();


}
