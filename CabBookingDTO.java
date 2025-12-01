package com.infy.api;

public class CabBookingDTO {

    private int tripID;
	private Long mobileNumber;
    private String pickUpLocation;
    private String dropOffLocation;
    private boolean isCancelled;
    // You can add more fields as needed

    // Constructors, getters, and setters
    
    public int gettripID() {
        return tripID;
    }

    public void settripID(int tripID) {
        this.tripID = tripID;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

	public boolean isCancelled() {
		return isCancelled;
	}

	public void setCancelled(boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
}
