package Bidang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
public class PersegiPanjang implements MenghitungBidang {
    public double panjang, lebar;
    
    public PersegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 *(this.panjang + this.lebar);
    }
    
}
