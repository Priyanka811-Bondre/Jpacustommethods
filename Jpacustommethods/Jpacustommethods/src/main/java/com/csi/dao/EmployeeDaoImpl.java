package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee signUp(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }
    public boolean signIn(String empEmailId,String empPassword){
         boolean flag=false;
         if(employeeRepositoryImpl.findByEmpEmailIdAndEmpPassword(empEmailId,empPassword).size()>=1){
             flag=true;
         }
      return flag;
    }

    public Optional<Employee> getDataById(int empId){
        return employeeRepositoryImpl.findById(empId);
    }
    public List<Employee>getAllData(){
        return employeeRepositoryImpl.findAll();
    }
    public List<Employee>getDataByEmpFirstName(String empFirstName){
        return employeeRepositoryImpl.findByEmpFirstName(empFirstName);
    }
    public Employee getDataByEmpContactNumber(String empContactNumber){
        return employeeRepositoryImpl.findByEmpContactNumber(empContactNumber);
    }
    public  Employee getDataByEmpEmailId(String empEmailId){
        return  employeeRepositoryImpl.findByEmpEmailId(empEmailId);
    }
    public List<Employee>getDataByEmpFirstNameAndEmpLastName(String empFirstName,String empLastName){
        return employeeRepositoryImpl.findByEmpFirstNameAndEmpLastName(empFirstName,empLastName);
    }
    public Employee updateData(Employee employee){
        return employeeRepositoryImpl.save(employee);
    }
    public  void deleteDataById(int empId){
        employeeRepositoryImpl.deleteById(empId);
    }
}
