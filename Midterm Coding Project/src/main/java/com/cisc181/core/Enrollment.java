package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment() {
		SectionID=UUID.randomUUID();
		StudentID=UUID.randomUUID();
		EnrollmentID=UUID.randomUUID();
	}
	public Enrollment(UUID StudentID, UUID SectionID) {
		this.StudentID=StudentID;
		this.SectionID=SectionID;
		EnrollmentID=UUID.randomUUID();
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public double getGrade() {
		return Grade;
	}

}
