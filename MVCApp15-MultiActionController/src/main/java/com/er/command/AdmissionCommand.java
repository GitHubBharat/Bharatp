package com.er.command;

import lombok.Data;

@Data
public class AdmissionCommand {
	private String name;
	private String branch;
	private String address;
	private String city;

	@Override
	public String toString() {
		return "AdmissionCommmand [name=" + name + ", branch=" + branch + ", address=" + address + ", city=" + city
				+ "]";
	}
}
