package com.bridgelabz.Controller;

import com.bridgelabz.model.EmployeePayroll;
import com.bridgelabz.serviceimpl.EmployeePayrollServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeController {
    public static void main(String[] args) {
        ArrayList<EmployeePayroll> employeePayrollList = new ArrayList<>();
        EmployeePayrollServiceImpl payrollService = new EmployeePayrollServiceImpl(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        payrollService.readEmployeePayrollData(consoleInputReader);
        payrollService.writeEmployeePayrollData();
    }
}
