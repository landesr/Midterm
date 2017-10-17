package com.cisc181.core;

import java.util.UUID;

public class Course {
	 private UUID CourseID;
	 private String CourseName;
	 private int GradePoints;
	 public Course(String name,int pts) {
		 CourseName=name;
		 GradePoints=pts;
		 CourseID = UUID.randomUUID();
	 }
	 public UUID getCourseID() {
		 return CourseID;
	 }
	 public String getCourseName() {
		 return CourseName;
	 }
	 public int getGradePoints() {
		 return GradePoints;
	 }
	 public void setCourseName(String name) {
		 CourseName=name;
	 }
	 public void setGradePoints(int pts) {
		 GradePoints=pts;
	 }
}
