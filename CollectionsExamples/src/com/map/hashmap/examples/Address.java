package com.map.hashmap.examples;

public class Address {
	
	private int houseNo;
	private String streetName;
	private String state;
	private int pinCode;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(int houseNo, String streetName, String state, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.state = state;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Address) {
			Address address=(Address)obj;
			if(this.houseNo==address.getHouseNo()||this.streetName.equals(address.getStreetName())||this.state.equals(address.getState())||this.pinCode==address.getPinCode()) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}
	
	
	
	

}
