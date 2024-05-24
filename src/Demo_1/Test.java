package Demo_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {

        //Form
        JFrame form = new JFrame("Demo_1");

        //Buttons
        JButton btnLogin = new JButton("Giris");

        //Form main properties
        form.setSize(800,600);
        form.setLocation(400,250);
        form.setVisible(true);

        //Form layout properties
        form.getContentPane().setLayout(new FlowLayout());
        form.getContentPane().add(btnLogin);

        //btnLogin
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane message = new JOptionPane();
                message.showConfirmDialog(null, "Giriş Başarılı");
            }
        });

    }

}
