/**
 * 
 */
package com.nt.dto;

/** 
 * @author ErBharatp
 *
 */
public class StudentDTO {
	private int sno;
	private String sname;
	private String address;
	private String course;
	private float avg;


	public int getSno() {
	return sno;
}


public void setSno(int sno) {
	this.sno = sno;
}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

		public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}
}
