/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maple
 */
public class Taco {
    private String tacotype;
    private int units;
    
    public Taco(String tacotype, int units) {
        this.tacotype = tacotype;
        this.units = units;
    }

    public String getTacotype() {
        return tacotype;
    }

    public int getUnits() {
        return units;
    }
}
