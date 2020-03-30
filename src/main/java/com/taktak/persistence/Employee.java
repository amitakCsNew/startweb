package com.taktak.persistence;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="employe_Nr")
    private Integer employeeNr;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "birth_date")
    private Date dateOfBirth;

    @Column(name = "hire_date")
    private Date hireDate;


    public Integer getEmployeeNr() {
        return employeeNr;
    }

    public void setEmployeeNr(Integer employeeNr) {
        this.employeeNr = employeeNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}


