/**
 * 
 */
package com.nt.command;

/** 
 * @author ErBharatp
 *
 */
public class StudentCommand {
	private Integer sno;
	private String sname;
	private String address;
	private String course;
	private Float avg;
	private String vflag;
	
public StudentCommand() {
	
}

public String getVflag() {
	return vflag;
}

public void setVflag(String vflag) {
	this.vflag = vflag;
}

public Integer getSno() {
return sno;
}


public void setSno(Integer sno) {
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

	public Float getAvg() {
		return avg;
	}

	public void setAvg(Float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "StudentCommand [sno=" + sno + ", sname=" + sname + ", address=" + address + ", course=" + course
				+ ", avg=" + avg + "]";
	}
	
}
