package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;

	public Semester(Date start, Date end) {
		this.SemesterID = UUID.randomUUID();
		this.StartDate = start;
		this.EndDate = end;
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setStartDate(Date d) {
		StartDate = d;
	}

	public void setEndDate(Date d) {
		EndDate = d;
	}
}
