package com.bdqn.pojo;

import java.io.Serializable;

public class District implements Serializable{
	private Integer did;
	private String dname;
	
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}

	public District(String dname) {
		super();
		this.dname = dname;
	}
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "District [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
}
