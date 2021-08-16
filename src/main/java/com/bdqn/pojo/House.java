package com.bdqn.pojo;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable{
	private Integer id;//编号
	private Integer street_id;//街道编号
	private Integer user_id;//用户编号
	private Integer type_id;//类型编号
	private String title;
	private String description;
	private int price;
	private Date pubdate;
	private int floorrage;
	private String contact;
	private Street street;
//	private District district;
	private Users users;
	private Type type;
	
	public House(Integer street_id, Integer user_id, Integer type_id, String title, String description, int price,
			Date pubdate, int floorrage, String contact) {
		super();
		this.street_id = street_id;
		this.user_id = user_id;
		this.type_id = type_id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.pubdate = pubdate;
		this.floorrage = floorrage;
		this.contact = contact;
	}

	public House() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStreet_id() {
		return street_id;
	}
	public void setStreet_id(Integer street_id) {
		this.street_id = street_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public int getFloorrage() {
		return floorrage;
	}
	public void setFloorrage(int floorrage) {
		this.floorrage = floorrage;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

//	public District getDistrict() {
//		return district;
//	}
//
//	public void setDistrict(District district) {
//		this.district = district;
//	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", street_id=" + street_id + ", user_id=" + user_id + ", type_id=" + type_id
				+ ", title=" + title + ", description=" + description + ", price=" + price + ", pubdate=" + pubdate
				+ ", floorrage=" + floorrage + ", contact=" + contact + ", street=" + street + ", users=" + users
				+ ", type=" + type + "]";
	}

	
	
	
	
}
