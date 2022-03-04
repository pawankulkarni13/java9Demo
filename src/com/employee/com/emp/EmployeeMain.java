package com.employee.com.emp;

import com.address.com.add.AddressUtil;

public class EmployeeMain {
    public static void main(String[] args) {
        AddressUtil addressUtil = new AddressUtil();
        System.out.println(addressUtil.getCity(560098));
    }
}
