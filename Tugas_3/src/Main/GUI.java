/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.*;
import javax.swing.*;
import Ruang.Balok;
/**
 *
 * @author TUF
 */
public class GUI extends JFrame implements ActionListener {
    
    JLabel labelJudul = new JLabel("Cuboid Calculator");
    
    JLabel labelPanjang = new JLabel("Length");
    JTextField tfPanjang = new JTextField(20);
    JLabel labelLebar = new JLabel("Width");
    JTextField tfLebar = new JTextField(20);
    JLabel labelTinggi = new JLabel("Height");
    JTextField tfTinggi = new JTextField(20);
    
    JLabel labelHasil = new JLabel("Result");
    JLabel labelLuas = new JLabel();
    JLabel labelKeliling = new JLabel();
    JLabel labelLuasPermukaan = new JLabel();
    JLabel labelVolume = new JLabel();
    
    JButton btnHitung = new JButton("Count");
    JButton btnReset = new JButton("Reset");
    
    
    public GUI(){
        setTitle("Cuboid Calculator");
        
        setSize(300,400);
        setLayout(null);
        add(labelJudul);
        add(labelPanjang);
        add(tfPanjang);
        add(labelLebar);
        add(tfLebar);
        add(labelTinggi);
        add(tfTinggi);
        
        add(labelHasil);
        add(labelLuas);
        add(labelKeliling);
        add(labelLuasPermukaan);
        add(labelVolume);
        
        add(btnHitung);
        add(btnReset);
        
        labelJudul.setBounds(90, 5, 140, 30);
        labelPanjang.setBounds(20, 40, 100, 20);
        tfPanjang.setBounds(110,40,150,20);
        labelLebar.setBounds(20,65,100,20);
        tfLebar.setBounds(110,65,150,20);
        labelTinggi.setBounds(20,95,100,20);
        tfTinggi.setBounds(110,95,150,20);
        
        labelHasil.setBounds(125,125,100,30);
        labelLuas.setBounds(30,160,200,30);
        labelKeliling.setBounds(30,185,200,30);
        labelLuasPermukaan.setBounds(30,210,200,30);
        labelVolume.setBounds(30,235,200,30);
        
        btnHitung.setBounds(55,300,80,20);
        btnReset.setBounds(155,300,80,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int panjang, lebar, tinggi;
        
        if(e.getSource() == btnHitung){
            if(tfPanjang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Length cannot empty");
            }else if(tfLebar.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Width cannot empty");
            }else if(tfTinggi.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Height cannot empty");
            }else {
                try {
                    panjang = Integer.parseInt(tfPanjang.getText());
                    lebar = Integer.parseInt(tfLebar.getText());
                    tinggi = Integer.parseInt(tfTinggi.getText());
                    
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    
                    labelLuas.setText("Squre Area                           : " + balok.hitungLuas());
                    labelKeliling.setText("Square Circumference        : " + balok.hitungKeliling());
                    labelLuasPermukaan.setText("Cuboid Surface Area           : " + balok.hitungLuasP());
                    labelVolume.setText("Cuboid Volume                    : " + balok.hitungVolume());
                } catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(this, "Input Number, Please");
                }
            }
        }
        if (e.getSource() == btnReset){
            labelLuas.setText(" ");
            labelKeliling.setText(" ");
            labelLuasPermukaan.setText(" ");
            labelVolume.setText(" ");
            tfPanjang.setText("");
            tfLebar.setText("");
            tfTinggi.setText("");
        }
    }
}
