/**
 * 
 */
package com.nt.command;

import java.util.Date;

/** 
 * @author ErBharatp
 *
 */
public class RailwayCommand {
	private String pname;
	private String from;
	private String to ;
	private Date jounaryStart;
	private float fare;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getJounaryStart() {
		return jounaryStart;
	}
	public void setJounaryStart(Date jounaryStart) {
		this.jounaryStart = jounaryStart;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
}
