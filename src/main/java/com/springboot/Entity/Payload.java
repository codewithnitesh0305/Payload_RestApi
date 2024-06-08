package com.springboot.Entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Payload")
public class Payload {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private int noOfTruck;
	private int weight;
	private String comment;
	private String shipperId;
	private LocalDate date;
	public Payload() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payload(int id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTruck, int weight, String comment, String shipperId, LocalDate date) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}
	
	public Payload(int id, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTruck, int weight, String comment) {
		super();
		this.id = id;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTruck = noOfTruck;
		this.weight = weight;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public int getNoOfTruck() {
		return noOfTruck;
	}
	public void setNoOfTruck(int noOfTruck) {
		this.noOfTruck = noOfTruck;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Payload [id=" + id + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTruck=" + noOfTruck + ", weight="
				+ weight + ", comment=" + comment + ", shipperId=" + shipperId + ", date=" + date + "]";
	}
	
}
