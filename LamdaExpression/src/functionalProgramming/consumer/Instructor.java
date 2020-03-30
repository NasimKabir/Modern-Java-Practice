package functionalProgramming.consumer;

import java.util.List;

public class Instructor {
private int id;
private String name;
List<String>coursess;



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public List<String> getCoursess() {
	return coursess;
}



public void setCoursess(List<String> coursess) {
	this.coursess = coursess;
}



public Instructor(int id, String name, List<String> coursess) {
	super();
	this.id = id;
	this.name = name;
	this.coursess = coursess;
}



public Instructor() {
	super();
}



@Override
public String toString() {
	return "Instructor [id=" + id + ", name=" + name + ", coursess=" + coursess + "]";
}



}
