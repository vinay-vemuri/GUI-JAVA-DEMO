import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginGui implements ActionListener {

    private static JLabel Userlabel;
    private static JTextField usertextvalue;
    private static JLabel passwordLabel;
    private static JTextField passwordText;
    private static JButton button;
    private static JLabel success;



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JFrame jframe = new JFrame();
        JPanel panel = new JPanel();
        jframe.setSize(400,200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panel);
        panel.setLayout(null);

        //Username
        Userlabel = new JLabel("Username");
        Userlabel.setBounds(10,20,80,25);
        panel.add(Userlabel);

        usertextvalue = new JTextField();
        usertextvalue.setBounds(100,20,150,25);
        panel.add(usertextvalue);

        //Password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JTextField();
        passwordText.setBounds(100,50,150,25);
        panel.add(passwordText);

        //button
        button = new JButton("Login");
        button.setBounds(100,100,80,25);
        button.addActionListener(new LoginGui());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        jframe.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String user = usertextvalue.getText();
        String password = passwordText.getText();

        if(user.equals("vinay") && password.equals("gui")) {
            success.setText("LoginSuccesfull");
            System.out.println("Login successfull");
        }

        System.out.println("clicked");

    }

}
