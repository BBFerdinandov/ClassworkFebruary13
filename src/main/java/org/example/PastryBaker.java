package org.example;

import java.util.ArrayList;

public class PastryBaker  {

    private ArrayList<Pastry> pastries;
    private ArrayList<Baker> bakers;

    public PastryBaker(ArrayList<Pastry> pastries, ArrayList<Baker> bakers) {
        this.pastries = pastries;
        this.bakers = bakers;
    }

    public ArrayList<Pastry> getPastries() {
        return pastries;
    }

    public void setPastries(ArrayList<Pastry> pastries) {
        this.pastries = pastries;
    }

    public ArrayList<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(ArrayList<Baker> bakers) {
        this.bakers = bakers;
    }

    public void addElements(Baker baker, Pastry pastry) {
        pastries.add(pastry);
        bakers.add(baker);
    }

    @Override
    public String toString() {
        return "PastryBaker{" +
                "pastries=" + pastries +
                ", bakers=" + bakers +
                '}';
    }

    public void  returnInfo(ArrayList<PastryBaker> pastryBakers, ArrayList<Pastry> pastries) {
        for (PastryBaker pb:pastryBakers) {
            System.out.println(pb.toString());
        }
    }

    /*public ArrayList<PastryBaker> pastries(int bakerId) {

    }*/
}
