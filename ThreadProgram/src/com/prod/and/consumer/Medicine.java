package com.prod.and.consumer;

public class Medicine {
	
	public static final int MAX_MEDICINE = 10;
	
	private int currentStock = 0;
	
	public Medicine(int id, String medicineName, String batchNumber) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.batchNumber = batchNumber;
	}

	private int id;
	private String medicineName;
	private String batchNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	
	public static int getMaxMedicine() {
		return MAX_MEDICINE;
	}
	public int getCurrentStock() {
		return currentStock;
	}
	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

}


