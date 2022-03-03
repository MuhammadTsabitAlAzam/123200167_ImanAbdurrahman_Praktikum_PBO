/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
public class Lingkaran implements MenghitungBidang {

    private double jari;

    public Lingkaran(double r) {
        jari = r;
    }
    public void setJari(double jari) {
        this.jari = jari;
    }
    public double getJari() {
        return jari;
    }
    public double getDiameter(){
        return 2*jari;
    }
    
    @Override
    public double hitungLuas() {
       return PHI * (jari * jari);
    }

    @Override
    public double hitungKeliling() {
        return PHI * (2*jari);
    }
}
