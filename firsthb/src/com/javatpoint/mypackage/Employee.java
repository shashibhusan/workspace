package com.javatpoint.mypackage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empdata")
public class Employee {  
private int id;  
private String firstName,lastName;  

@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}
@Column(name = "firstName")
public String getFirstName() {  
    return firstName;  
}  
public void setFirstName(String firstName) {  
    this.firstName = firstName;  
} 
@Column(name = "lastName")
public String getLastName() {  
    return lastName;  
}  
public void setLastName(String lastName) {  
    this.lastName = lastName;  
}  
}  