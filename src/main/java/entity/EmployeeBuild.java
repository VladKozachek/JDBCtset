package entity;

import java.sql.Date;

public class EmployeeBuild {
    private long id;
    private String firstName;
    private String lastName;
    private Date birtday;
    private long addressId;

    EmployeeBuild setId(int id){
        this.id=id;
        return this;
    }
    EmployeeBuild setFirstName(String firstName){
        this.firstName=firstName;
        return this;
    }
    EmployeeBuild setLastName(String lastName){
        this.lastName=lastName;
        return this;
    }
    EmployeeBuild setBirtday(Date birtday){
        this.birtday=birtday;
        return this;
    }
    EmployeeBuild setAddressId(long addressId){
        this.addressId=addressId;
        return this;
    }

    Employee build(){
        Employee employee=new Employee();
        employee.setId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setBirtday(birtday);
        employee.setAddressId(addressId);
        return employee;
    }
}
