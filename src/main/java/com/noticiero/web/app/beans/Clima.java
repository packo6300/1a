package com.noticiero.web.app.beans;

import java.util.ArrayList;

public class Clima {
	private String cod;
	private Double message;
	private int cnt;
	private ArrayList<Medidas> list;
	private Ciudad city;
	
	/**
	 * @return the code
	 */
	public String getCod() {
		return cod;
	}
	/**
	 * @param code the code to set
	 */
	public void setCod(String code) {
		this.cod = code;
	}
	/**
	 * @return the message
	 */
	public Double getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(Double message) {
		this.message = message;
	}
	/**
	 * @return the cnt
	 */
	public int getCnt() {
		return cnt;
	}
	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	/**
	 * @return the list
	 */
	public ArrayList<Medidas> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(ArrayList<Medidas> list) {
		this.list = list;
	}
	/**
	 * @return the city
	 */
	public Ciudad getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(Ciudad city) {
		this.city = city;
	}
	
	
}
