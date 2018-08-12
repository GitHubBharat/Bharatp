package com.er.command;

public class JobSeekerCommand {
	private String name;
	private String email;
	private String passwod;
	private long mobile;
	private String quly;
	private String skills;
	private float exp;
	private int ctc;
	private int expactedctc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswod() {
		return passwod;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getQuly() {
		return quly;
	}

	public void setQuly(String quly) {
		this.quly = quly;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
	}

	public int getCtc() {
		return ctc;
	}

	public void setCtc(int ctc) {
		this.ctc = ctc;
	}

	public int getExpactedctc() {
		return expactedctc;
	}

	public void setExpactedctc(int expactedctc) {
		this.expactedctc = expactedctc;
	}

	@Override
	public String toString() {
		return "JobSeekerCommand [name=" + name + ", email=" + email + ", passwod=" + passwod + ", mobile=" + mobile
				+ ", quly=" + quly + ", skills=" + skills + ", exp=" + exp + ", ctc=" + ctc + ", expactedctc="
				+ expactedctc + "]";
	}

}
