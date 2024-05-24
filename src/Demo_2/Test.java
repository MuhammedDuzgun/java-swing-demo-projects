package Demo_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {

    public static void main(String[] args) {

        //Form
        JFrame form = new JFrame("Demo_2");

        //Buttons
        JButton btnLogin = new JButton("Giris");

        //Text Field
        JTextField txtName = new JTextField(20);

        //Label
        JLabel lblHello = new JLabel("Hoşgeldiniz");

        //Form properties
        form.setSize(800,600);
        form.setLocation(400,250);
        form.setResizable(false);
        form.setVisible(true);

        //form layout properties
        form.getContentPane().setLayout(new FlowLayout());
        form.add(txtName);
        form.add(btnLogin);
        form.add(lblHello);

        //Button Actions - btnLogin
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblHello.setText("Hoşgeldin : " + txtName.getText());
            }
        });


    }

}
