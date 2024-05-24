package Demo_3_Not_Hesaplama;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {

        //JFrame
        JFrame form = new JFrame("Not Hesaplama Uygulamasi");
        form.setSize(800,600);
        form.setLocation(600,600);
        form.setLayout(null);

        //JLabel - Vize
        JLabel lblVize = new JLabel("Vize : ");
        lblVize.setBounds(50,50,50,30);
        form.add(lblVize);

        //JLabel - Final
        JLabel lblFinal = new JLabel("Final : ");
        lblFinal.setBounds(50,100,50,30);
        form.add(lblFinal);

        //JTextField - Vize
        JTextField txtVize = new JTextField(20);
        txtVize.setBounds(150, 55,80,20);
        form.add(txtVize);

        //JTextField - Final
        JTextField txtFinal = new JTextField(20);
        txtFinal.setBounds(150, 110,80,20);
        form.add(txtFinal);

        //JButton - Hesapla
        JButton btnHesapla = new JButton("Hesapla");
        btnHesapla.setBounds(150, 150,80,20);
        form.add(btnHesapla);

        //JLabel - Sonuc
        JLabel lblSonuc = new JLabel("Sonuc  : ");
        lblSonuc.setBounds(150,200,80,20);
        form.add(lblSonuc);

        //JLabel - Durum
        JLabel lblDurum = new JLabel("Durum : ");
        lblDurum.setBounds(150, 250, 100, 20);
        form.add(lblDurum);


        //ButtonAction - btnHesapla
        btnHesapla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int vizeNot = Integer.parseInt(txtVize.getText());
                int finalNot = Integer.parseInt(txtFinal.getText());
                double ortalama = (double) vizeNot * 0.4 + finalNot * 0.6;

                //Sonuc
                lblSonuc.setText("Sonuc : "  + ortalama);

                //Durum
                if(ortalama >= 50) {
                    lblDurum.setText("Durum :  Geçtiniz.");
                } else {
                    lblDurum.setText("Durum :  Kaldınız.");
                }
            }
        });

        //Show JFrame
        form.setVisible(true);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);

    }

}
