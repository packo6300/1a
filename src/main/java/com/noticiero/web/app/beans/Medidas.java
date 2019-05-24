package com.noticiero.web.app.beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
/**
 * 
 * @author packo
 *
 */
public class Medidas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger dt;
	private MedidaPrincipal main;
	private ArrayList<Weather> weather;
	private Clouds clouds;
	private Wind wind;
	private Sys sys;
	private String dt_txt;
	
	/**
	 * @return the dt
	 */
	public BigInteger getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(BigInteger dt) {
		this.dt = dt;
	}
	/**
	 * @return the main
	 */
	public MedidaPrincipal getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(MedidaPrincipal main) {
		this.main = main;
	}
	/**
	 * @return the weather
	 */
	public ArrayList<Weather> getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}
	/**
	 * @return the clouds
	 */
	public Clouds getClouds() {
		return clouds;
	}
	/**
	 * @param clouds the clouds to set
	 */
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	/**
	 * @return the wind
	 */
	public Wind getWind() {
		return wind;
	}
	/**
	 * @param wind the wind to set
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	/**
	 * @return the sys
	 */
	public Sys getSys() {
		return sys;
	}
	/**
	 * @param sys the sys to set
	 */
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	/**
	 * @return the dtText
	 */
	public String getDt_txt() {
		return dt_txt;
	}
	/**
	 * @param dtText the dtText to set
	 */
	public void setDt_txt(String dtText) {
		this.dt_txt = dtText;
	}
}
