package org.example;

public class Cake {
    private String cakeCrust;
    private boolean cakeMultipleLayers;

    public Cake() {
        this.cakeCrust = "debel";
        this.cakeMultipleLayers = false;
    }

    public Cake(String cakeCrust, boolean cakeMultipleLayers) {
        this.cakeCrust = cakeCrust;
        this.cakeMultipleLayers = cakeMultipleLayers;
    }

    public String getCakeCrust() {
        return cakeCrust;
    }

    public void setCakeCrust(String cakeCrust) {
        this.cakeCrust = cakeCrust;
    }

    public boolean isCakeMultipleLayers() {
        return cakeMultipleLayers;
    }

    public void setCakeMultipleLayers(boolean cakeMultipleLayers) {
        this.cakeMultipleLayers = cakeMultipleLayers;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "cakeCrust='" + cakeCrust + '\'' +
                ", cakeMultipleLayers=" + cakeMultipleLayers +
                '}';
    }
}
