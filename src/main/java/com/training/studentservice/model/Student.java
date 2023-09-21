package com.training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
//@Table(name="STUD")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Student_ID")
	private long studId;
	@Column(name="Student_Name")
	private String studName;
	//@Column(name="Student_Age")
	private int age;
	@Column(name="Student_Grade")
	private String grade;
	
	public Student(String studName, int age, String grade){
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}

}
