/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUF
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;
    

    public Balok(double p, double l, double t){
        super(p,l);
        tinggi = t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    @Override
    public double hitungLuasP() {
       return 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
    }
    
}
