package com.ssm.test;

import com.ssm.model.Admin;
import com.ssm.service.Admin_Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Admin_Test extends basics {

    @Autowired
    private Admin_Service admin_service;

    @Test
    public void findAdminById(){
        Admin admin = admin_service.get_Admin_By_Id(1);
        System.out.println("查询到的内容为: "+admin);

    }

    @Test
    public void findAdminAll(){
        List<Admin> admin_all = admin_service.get_Admin_All();
        for (Admin admin:admin_all) {
            System.out.println("查询到的内容为: "+admin);
        }
    }
    @Test
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("hello world !");
        String str = stringBuffer.toString();
        char [] chars = str.toCharArray();
        System.out.println(chars);

    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop().val);
        }
        return arrayList;
    }
}
