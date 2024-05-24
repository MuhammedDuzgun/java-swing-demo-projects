package Demo_4_Dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {

        //JFrame
        JFrame form = new JFrame("Kullanici Etkilesimi");
        form.setSize(800,600);
        form.setLocation(600,600);
        form.setLayout(null);

        //JTextField - Username
        JTextField txtUsername = new JTextField(20);
        txtUsername.setBounds(50,50,80,20);
        form.add(txtUsername);

        //JButton - Login
        JButton btnLogin  = new JButton("Login");
        btnLogin.setBounds(150,50,80,20);
        form.add(btnLogin);

        //ButtonAction - btnLogin
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Dialog
                JOptionPane panel = new JOptionPane();
                panel.showMessageDialog(null,
                        "Hoş Geldiniz : " + txtUsername.getText(),
                        "Giriş", JOptionPane.INFORMATION_MESSAGE);

                //Input Dialog
                String meslek = panel.showInputDialog("Mesleginizi Giriniz : " );

                //Dialog
                panel.showInternalMessageDialog(null,
                        "Kullanıcı Bilgileri : " + "Kullanıcı Adı : " + txtUsername.getText() + " Meslek : " + meslek);

            }
        });

        //Show JFrame
        form.setVisible(true);
        form.setDefaultCloseOperation(form.EXIT_ON_CLOSE);


    }

}
