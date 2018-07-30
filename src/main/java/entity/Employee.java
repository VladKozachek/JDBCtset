package entity;

import java.sql.Date;

public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private Date birtday;
    private long addressId;

    public Employee() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirtday(Date birtday) {
        this.birtday = birtday;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtday=" + birtday +
                ", addressId=" + addressId +
                '}';
    }
}
