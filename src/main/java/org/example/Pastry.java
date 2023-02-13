package org.example;

public class Pastry {
    private int pastryId;
    private String pastryName;
    private String pastryFrosting;
    private double pastryWeight;

    public Pastry() {
        this.pastryId = 1;
        this.pastryName = "Pekarna";
        this.pastryFrosting = "blue";
        this.pastryWeight = 100;
    }

    public Pastry(int pastryId, String pastryName, String pastryFrosting, double pastryWeight) {
        this.pastryId = pastryId;
        this.pastryName = pastryName;
        this.pastryFrosting = pastryFrosting;
        this.pastryWeight = pastryWeight;
    }

    public int getPastryId() {
        return pastryId;
    }

    public void setPastryId(int pastryId) {
        this.pastryId = pastryId;
    }

    public String getPastryName() {
        return pastryName;
    }

    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    public String getPastryFrosting() {
        return pastryFrosting;
    }

    public void setPastryFrosting(String pastryFrosting) {
        this.pastryFrosting = pastryFrosting;
    }

    public double getPastryWeight() {
        return pastryWeight;
    }

    public void setPastryWeight(double pastryWeight) {
        this.pastryWeight = pastryWeight;
    }

    @Override
    public String toString() {
        return "Pastry{" +
                "pastryId=" + pastryId +
                ", pastryName='" + pastryName + '\'' +
                ", pastryFrosting='" + pastryFrosting + '\'' +
                ", pastryWeight=" + pastryWeight +
                '}';
    }
}
