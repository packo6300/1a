package com.noticiero.web.app.beans;

public class MedidaPrincipal {
	private Double temp;
	private Double temp_min;
	private Double temp_max;
	private Double pressure;
	private Double sea_level;
	private Double grnd_level;
	private int humidity;
	private Double temp_kf;
	
	
	/**
	 * @return the temp
	 */
	public Double getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	/**
	 * @return the tempMin
	 */
	public Double getTemp_min() {
		return temp_min;
	}
	/**
	 * @param tempMin the tempMin to set
	 */
	public void setTemp_min(Double tempMin) {
		this.temp_min = tempMin;
	}
	/**
	 * @return the tempMax
	 */
	public Double getTemp_max() {
		return temp_max;
	}
	/**
	 * @param tempMax the tempMax to set
	 */
	public void setTemp_max(Double tempMax) {
		this.temp_max = tempMax;
	}
	/**
	 * @return the pressure
	 */
	public Double getPressure() {
		return pressure;
	}
	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	/**
	 * @return the seaLevel
	 */
	public Double getSea_level() {
		return sea_level;
	}
	/**
	 * @param seaLevel the seaLevel to set
	 */
	public void setSea_level(Double seaLevel) {
		this.sea_level = seaLevel;
	}
	/**
	 * @return the grndLevel
	 */
	public Double getGrnd_level() {
		return grnd_level;
	}
	/**
	 * @param grndLevel the grndLevel to set
	 */
	public void setGrnd_level(Double grndLevel) {
		this.grnd_level = grndLevel;
	}
	/**
	 * @return the humidity
	 */
	public int getHumidity() {
		return humidity;
	}
	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	/**
	 * @return the tempKf
	 */
	public Double getTemp_kf() {
		return temp_kf;
	}
	/**
	 * @param tempKf the tempKf to set
	 */
	public void setTemp_kf(Double tempKf) {
		this.temp_kf = tempKf;
	}
	
	
	
}
