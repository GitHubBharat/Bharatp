package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int empno;
	private String eName;
	private String degs;
	private int sal;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDegs() {
		return degs;
	}

	public void setDegs(String degs) {
		this.degs = degs;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
