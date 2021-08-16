package com.bdqn.pojo;

public class Street {
	
	private Integer sid;
	private Integer district_id;
	private String sname;
	private District district;
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(Integer district_id) {
		this.district_id = district_id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Street [sid=" + sid + ", district_id=" + district_id + ", sname=" + sname + ", district=" + district
				+ "]";
	}
	
}
