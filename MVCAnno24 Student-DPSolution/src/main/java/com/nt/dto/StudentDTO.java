/**
 * 
 */
package com.nt.dto;

/** 
 * @author ErBharatp
 *
 */
public class StudentDTO {
	private Integer sno;
	private String sname;
	private String address;
	private String course;
	private Float avg;


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

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Float getAvg() {
		return avg;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}
}
