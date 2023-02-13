package org.example;

public class Baker {
    private int bakerId;
    private String bakerCompanyName;
    private String bakerCountry;
    private String bakerWorkTime;

    Baker() {
        this.bakerId = 1;
        this.bakerCompanyName = "Jerry";
        this.bakerCountry = "Bulgaria";
        this.bakerWorkTime = "24/7";
    }

    public Baker(int bakerId, String bakerCompanyName, String bakerCountry, String bakerWorkTime) {
        this.bakerId = bakerId;
        this.bakerCompanyName = bakerCompanyName;
        this.bakerCountry = bakerCountry;
        this.bakerWorkTime = bakerWorkTime;
    }

    public int getBakerId() {
        return bakerId;
    }

    public void setBakerId(int bakerId) {
        this.bakerId = bakerId;
    }

    public String getBakerCompanyName() {
        return bakerCompanyName;
    }

    public void setBakerCompanyName(String bakerCompanyName) {
        this.bakerCompanyName = bakerCompanyName;
    }

    public String getBakerCountry() {
        return bakerCountry;
    }

    public void setBakerCountry(String bakerCountry) {
        this.bakerCountry = bakerCountry;
    }

    public String getBakerWorkTime() {
        return bakerWorkTime;
    }

    public void setBakerWorkTime(String bakerWorkTime) {
        this.bakerWorkTime = bakerWorkTime;
    }

    @Override
    public String toString() {
        return "Baker{" +
                "bakerId=" + bakerId +
                ", bakerCompanyName='" + bakerCompanyName + '\'' +
                ", bakerCountry='" + bakerCountry + '\'' +
                ", bakerWorkTime='" + bakerWorkTime + '\'' +
                '}';
    }
}
