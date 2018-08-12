package com.er.command;

import java.util.Date;

public class EmployeeCommand {
	private int eno;
	private String ename;
	private Date dob;
	private Date doj;
	private Date dom;
	@Override
	public String toString() {
		return "EmployeeCommand [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom
				+ "]";
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDom() {
		return dom;
	}
	public void setDom(Date dom) {
		this.dom = dom;
	}
}
