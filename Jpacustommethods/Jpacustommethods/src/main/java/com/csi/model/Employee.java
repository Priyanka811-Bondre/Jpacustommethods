package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue

    private int empId;

    @Size(min=2,message = "Employee FirstName should be more than 2 character")
    private String empFirstName;

    @Pattern(regexp="[A-Za-z]*", message="Last name should not contain space and special characters")
    private String empLastName;


    private String empAddress;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    private double empSalary;

    @Size(min=10,max = 10,message = "ContactNumber must be atleast 10 digit")
    @Column(unique = true)
    private String empContactNumber;

    @Email(message = "EmailId must be valid")
    @Column(unique = true)
    private String empEmailId;

    @Size(min = 4,message = "password should be atleast 4 charactor")
    private String empPassword;
}
