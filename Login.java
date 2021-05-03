import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Login extends JFrame implements ActionListener {
    String a = "LOGIN GAGAL";
    public JButton btnLogin, btnCancel;
    public JLabel lblUsername,lblPassword,lblImage;
    public JTextField txtUsername;
    public JPasswordField txtPassword;
    public ImageIcon book;
    private Color color = Color.BLUE;
    private Color color1 = Color.white;
    private String uname ="admin";
    private String pw = "admin";

    public Login (){
       isiLayout();
    }
    
    public void isiLayout(){
        lblImage     = new JLabel();
        lblUsername  = new JLabel("Username :");
        lblPassword  = new JLabel("Password :");

        txtUsername  = new JTextField();
        txtPassword  = new JPasswordField();
       
        btnLogin = new JButton("LOGIN");
        btnCancel = new JButton("CANCEL");

        book = new ImageIcon("book.png");

        setTitle("LOGIN E-BOOK");
        setBounds(500,150,400,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Icon
        lblImage.setBounds(155,25,325,100);
        lblImage.setIcon(book);
        add(lblImage);
        // Akhir Icon

        // Username
        add(lblUsername); 
        lblUsername.setBounds(75,75,90,100);
        add(txtUsername); 
        txtUsername.setBounds(70,135,250,30);
        // Akhir Username

        // Password
        add(lblPassword); 
        lblPassword.setBounds(75,125,90,100);
        add(txtPassword); 
        txtPassword.setBounds(70,185,250,30);
        // Akhir Password

        // btn Login
        add(btnLogin); 
        btnLogin.setBounds(70,245, 100, 25);
        btnLogin.setBackground(Color.BLUE);
        btnLogin.setForeground(Color.white);

        //Button Cancel
        add(btnCancel); 
        btnCancel.setBounds(200,245, 120, 25);
        btnCancel.setBackground(Color.BLUE);
        btnCancel.setForeground(Color.white);
        // Akhir Button Cancel

        //Menambahkan event listener
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
    }
    
    public String getUsername(){
        String user = txtUsername.getText();
        return user;
    }
    public String getPassword(){
        String pass = txtPassword.getText();
       return pass;
         
    }
    public void setUsername(){
        txtUsername.setText("");
    }
    public void setPassword(){
        txtPassword.setText("");
    }

    public void validasiLogin(){
        String uname;
        String pw;
        uname = this.uname;
        pw = this.pw;
        if(getUsername().equals(uname)){ // jika string n sama dengan string nama  dan string p sama dengan string password maka
            if(getPassword().equals(pw)){
                JOptionPane.showMessageDialog(this, "LOGIN SUKSES!", "Message", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                Home home = new Home();
                home.btnBaca.setEnabled(true);
                home.btnPetunjuk.setEnabled(true);
                home.btnLogin.setEnabled(false);
                // Source Code menuju halaman home
            }else{
                JOptionPane.showMessageDialog(this, "Password Anda Salah", "Message", JOptionPane.INFORMATION_MESSAGE);
                setPassword();
            }
        }else if(getUsername().matches("[^\\w]") || getPassword().matches("[^\\w]")){
            JOptionPane.showMessageDialog(this, "DILARANG MENGGUNAKAN SIMBOL", "Message", JOptionPane.INFORMATION_MESSAGE);
            setUsername();
            setPassword();
        }
        else{
            JOptionPane.showMessageDialog(this, "Username dan Password Anda Salah", "Message", JOptionPane.INFORMATION_MESSAGE);
            setUsername();
            setPassword();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){ // Jika tombol btnLogin di klik maka
            validasiLogin();

        }
         if(e.getSource()==btnCancel){
            this.dispose(); //Menutup
            new Home().setVisible(true);
        }    
    }
    
}