/**
 * 
 */
package com.er.command;

import java.util.Arrays;

/**
 * @author ErBharatp
 *
 */
public class StudentCommand {
	private String name;
	private String address;
	private String gender;
	private String course[];
	private String hobbies[];
	private String country[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String[] getCountry() {
		return country;
	}
	public void setCountry(String[] country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "StudentCommand [name=" + name + ", address=" + address + ", gender=" + gender + ", course="
				+ Arrays.toString(course) + ", hobbies=" + Arrays.toString(hobbies) + ", country="
				+ Arrays.toString(country) + "]";
	}
}
