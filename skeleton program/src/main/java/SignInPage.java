package main.java;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

public class SignInPage extends JFrame {
    private static JFrame jFrame1;
    private static JPanel jPanel1;
    private static JPanel jPanel2;
    private static JLabel signInLabel;
    private static JLabel usernameLabel;
    private static JLabel passwordLabel;
    private static JTextField usernameTextField;
    private static JPasswordField passwordField;
    private static JToggleButton showPassword;
    private static JButton signUpButton;
    private static JButton enterButton;


    public SignInPage()
    {
        initComponents();
    }

    private void initComponents()
    {
        jFrame1 = new JFrame("Raffle");
        jFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame1.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        jPanel1 = new JPanel();
        //Dimension d = jFrame1.getSize();

        jPanel1.setBounds(0,0,jFrame1.getWidth(),jFrame1.getHeight());
        jPanel1.setBackground(new Color(0,240,100,100));
        //jPanel1.repaint();
        //new Color(160,160,160,150) Grey
        //new Color(0,240,100,100) Greenish
        //new Color(200,130,130,160) Pink



        jPanel2 = new JPanel();
        //jPanel2.setLayout(new BoxLayout(jPanel2,BoxLayout.PAGE_AXIS));
        GroupLayout gl = new GroupLayout(jPanel2);
        jPanel2.setLayout(gl);
        jPanel2.setBounds(jFrame1.getWidth()/8,jFrame1.getHeight()/6,3*jFrame1.getWidth()/4,5*jFrame1.getHeight()/6);
        jPanel2.setBackground(new Color(160,160,160,150));

        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        signInLabel = new JLabel("Sign In",JLabel.CENTER);
        signInLabel.setPreferredSize(new Dimension(jPanel2.getWidth(),100));
        signInLabel.setMinimumSize(signInLabel.getPreferredSize());
        signInLabel.setMaximumSize(signInLabel.getPreferredSize());
        //signInLabel.setBounds(jFrame1.getWidth()/3,jFrame1.getHeight()/6,2*jFrame1.getWidth()/3,jFrame1.getHeight()/6);
        signInLabel.setFont(new Font("Apple Chancery",Font.BOLD,50));
        signInLabel.setForeground(new Color(0,0,0));

        usernameLabel = new JLabel("Username:",SwingConstants.LEFT);
        usernameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        usernameLabel.setPreferredSize(new Dimension(jPanel2.getWidth(),60));
        usernameLabel.setMinimumSize(usernameLabel.getPreferredSize());
        usernameLabel.setMaximumSize(usernameLabel.getPreferredSize());
        usernameLabel.setFont(new Font("Futura",Font.BOLD,22));
        usernameLabel.setForeground(new Color(0,0,0));

        passwordLabel = new JLabel("Password:",SwingConstants.LEFT);
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordLabel.setPreferredSize(new Dimension(jPanel2.getWidth(),60));
        passwordLabel.setMinimumSize(passwordLabel.getPreferredSize());
        passwordLabel.setMaximumSize(passwordLabel.getPreferredSize());
        passwordLabel.setFont(new Font("Futura",Font.BOLD,22));
        passwordLabel.setForeground(new Color(0,0,0));

        usernameTextField = new JTextField("Enter Username");
        usernameTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
        usernameTextField.setPreferredSize(new Dimension(jPanel2.getWidth()-20,50));
        usernameTextField.setMinimumSize(usernameTextField.getPreferredSize());
        usernameTextField.setMaximumSize(usernameTextField.getPreferredSize());
        usernameTextField.setFont(new Font("TimesRoman",Font.ITALIC,14));
        usernameTextField.setForeground(new Color(0,0,0,80));
        //usernameTextField.setBounds(jPanel2.getLocation().x,usernameLabel.getLocation().y+usernameLabel.getHeight(),jPanel2.getWidth()/2,200);
        usernameTextField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (usernameTextField.getText().equals("Enter Username"))
                {
                    usernameTextField.setText("");
                    usernameTextField.setFont(new Font("Calibri",Font.PLAIN,14));
                    usernameTextField.setForeground(new Color(0,0,0));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (usernameTextField.getText().equals("")) {
                    usernameTextField.setText("Enter Username");
                    usernameTextField.setFont(new Font("TimesRoman",Font.ITALIC,14));
                    usernameTextField.setForeground(new Color(0,0,0,80));
                }
            }
        });
        showPassword = new JToggleButton("Show password");
        showPassword.setAlignmentX(Component.LEFT_ALIGNMENT);
        showPassword.setPreferredSize(new Dimension(jPanel2.getWidth()/8,50));
        showPassword.setMinimumSize(showPassword.getPreferredSize());
        showPassword.setMaximumSize(showPassword.getPreferredSize());


        passwordField = new JPasswordField("Enter Password");
        passwordField.setEchoChar((char)0);
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordField.setPreferredSize(new Dimension((7*jPanel2.getWidth()/8)-20,50));
        passwordField.setMinimumSize(passwordField.getPreferredSize());
        passwordField.setMaximumSize(passwordField.getPreferredSize());
        passwordField.setFont(new Font("TimesRoman",Font.ITALIC,14));
        passwordField.setForeground(new Color(0,0,0,80));


        showPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPassword.isSelected())
                    passwordField.setEchoChar((char)0);
                else
                    passwordField.setEchoChar('*');

            }
        });


        passwordField.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                if (java.util.Arrays.toString(passwordField.getPassword()).equals("[E, n, t, e, r,  , P, a, s, s, w, o, r, d]"))
                {
                    if(!showPassword.isSelected())
                        passwordField.setEchoChar('*');
                    passwordField.setText("");
                    passwordField.setForeground(new Color(0,0,0));

                }
            }

            @Override
            public void mouseExited(MouseEvent e) {

                if (Arrays.toString(passwordField.getPassword()) == "[]")
                {
                    passwordField.setEchoChar((char)0);
                    passwordField.setText("Enter Password");
                    passwordField.setFont(new Font("TimesRoman",Font.ITALIC,14));
                    passwordField.setForeground(new Color(0,0,0,80));
                }

            }
        });
        //passwordField.setBounds(jPanel2.getX(),passwordLabel.getY()+passwordLabel.getHeight(),3*jPanel2.getWidth()/4,50);



        //set bounds for usernametextfield
        /*jPanel2.add(signInLabel);
        jPanel2.add(usernameLabel);
        jPanel2.add(usernameTextField);
        jPanel2.add(passwordLabel);
        jPanel2.add(passwordField);
        jPanel2.add(showPassword);*/

        signUpButton = new JButton("Don't have an account?");
        signUpButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        signUpButton.setPreferredSize(new Dimension(jPanel2.getWidth()/6,50));
        signUpButton.setMinimumSize(signUpButton.getPreferredSize());
        signUpButton.setMaximumSize(signUpButton.getPreferredSize());
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUpPage sup = new SignUpPage();
                jFrame1.setVisible(false);
            }
        });


        enterButton = new JButton("Enter");
        enterButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        enterButton.setPreferredSize(new Dimension(jPanel2.getWidth()/6,50));
        enterButton.setMinimumSize(enterButton.getPreferredSize());
        enterButton.setMaximumSize(enterButton.getPreferredSize());
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = "";
                char[] ch = passwordField.getPassword();
                for(int i = 0;i<ch.length;i++)
                    password+=ch[i];
                if (usernameTextField.getText().equals("user1234") && password.equals("5678"))
                {
                    // Code to go to main page

                }
                else
                {
                    JOptionPane.showMessageDialog(jFrame1,"Wrong username and/or password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        gl.setHorizontalGroup(
                gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(signInLabel)
                        .addComponent(usernameLabel)
                        .addComponent(usernameTextField)
                        .addComponent(passwordLabel)
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(passwordField)
                                .addComponent(showPassword)

                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(signUpButton)
                                .addGap(100)
                                .addComponent(enterButton)
                        )

        );

        gl.setVerticalGroup(
                gl.createSequentialGroup()
                        .addComponent(signInLabel)
                        .addComponent(usernameLabel)
                        .addComponent(usernameTextField)
                        .addGap(40)
                        .addComponent(passwordLabel)
                        .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(passwordField)
                                .addComponent(showPassword)

                        )
                        .addGap(150)
                        .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(signUpButton)
                                .addComponent(enterButton)
                        )
                        //.addGap(jPanel2.getHeight()/4)
        );


        jFrame1.getContentPane().add(jPanel2);
        jFrame1.getContentPane().add(jPanel1);
        //jFrame1.getContentPane().add(signInLabel);
        jFrame1.setExtendedState(JFrame.MAXIMIZED_BOTH);


        jFrame1.setVisible(true);
    }



    public static void main(String[] args)
    {
        SignInPage s = new SignInPage();
    }





}
