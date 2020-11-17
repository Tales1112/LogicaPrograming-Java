package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;

	public HourContract(Date date, Double ValuePerHour, Integer Hours) {
		this.date = date;
		this.valuePerHour = ValuePerHour;
		this.hours = Hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHoura(Double ValuePorHour) {
		this.valuePerHour = ValuePorHour;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer Hour) {
		this.hours = Hour;
	}

	public Double totalValue() {
		return hours * valuePerHour;
	}

	@Override
	public String toString() {
		return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
	}

}
