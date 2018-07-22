/**
 * 
 */
package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

/** 
 * @author ErBharatp
 *
 */
public class RailwayDTO implements  Serializable{
	private String pname;
	private String source;
	private String dest ;
	private String jounaryStart;
	private float fare;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getJounaryStart() {
		return jounaryStart;
	}
	public void setJounaryStart(String jounaryStart) {
		this.jounaryStart = jounaryStart;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "RailwayDTO [pname=" + pname + ", source=" + source + ", dest=" + dest + ", jounaryStart=" + jounaryStart
				+ ", fare=" + fare + "]";
	}
	}
