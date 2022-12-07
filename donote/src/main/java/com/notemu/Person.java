package com.notemu;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private int id;

@Lob
private String Userdata;
public Person(String userdata) {

	Userdata = userdata;
}



public Person() {

}



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserdata() {
	return Userdata;
}
public void setUserdata(String userdata) {
	Userdata = userdata;
}


	
	
}
