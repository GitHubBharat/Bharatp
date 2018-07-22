/**
 * 
 */
package com.nt.bo;

/** 
 * @author ErBharatp
 *
 */
public class StudentBO {
	private int sno;
	private String sname;
	private String address;
	private String course ;
	private float avg;
public StudentBO() {

}


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


	@Override
	public String toString() {
		return "StudentBO [sno=" + sno + ", sname=" + sname + ", address=" + address + ", course=" + course + ", avg="
				+ avg + "]";
	}
	
}
