package com.bridgelabz.serviceimpl;

import com.bridgelabz.model.EmployeePayroll;
import com.bridgelabz.service.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollServiceImpl implements EmployeePayrollService {

    List<EmployeePayroll> employeePayrollList;

    public EmployeePayrollServiceImpl() {

    }

    public EmployeePayrollServiceImpl(List<EmployeePayroll> employeePayrollList) {
        this.employeePayrollList = new ArrayList<EmployeePayroll>();
    }

    @Override
    public void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employee ID : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name : ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary : ");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmployeePayroll(id, name, salary));
    }

    @Override
    public void writeEmployeePayrollData() {
        System.out.println("\n Writing Employee Payroll Roaster to Console\n" + employeePayrollList);
    }

    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

}
