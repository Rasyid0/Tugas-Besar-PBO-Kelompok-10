import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    public JPanel p1,p2,p3,p4;
    public JLabel l1;
    public JList daftar;
    public JButton btnBaca,btnLogin,btnPetunjuk;

    //konstruktor
    public Home(){

        //frame baru
        super("E-BOOK");
        setBounds(500,150,400,400);

        //panel 1 judul
        p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT,27,12));
        l1 = new JLabel("Kategori");
        l1.setBounds(27,12,115,29);
        p1.add(l1);
        add("North",p1);

        //panel2 judul buku
        String genreBuku[] = {"Aksi dan Petualangan","Fantasi","Fiksi","Horor","Romansa"};
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1,0,0));
        daftar = new JList<>(genreBuku);
        daftar.setBounds(27,45,200,300);
        p2.add(daftar);
        
        //text area utk button
        JTextArea tArea1 = new JTextArea(5,400);
        tArea1.setEditable(false);

        //panel2 button utk baca
        btnBaca = new JButton("Baca Buku");
        btnBaca.setBounds(40,50,300,50);
        btnBaca.setEnabled(false);
        tArea1.add(btnBaca);
        p2.add(tArea1);
        add("Center",p2);

        //navbar bawah
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1,3,0,0));

        //button home    
        btnPetunjuk = new JButton("Petunjuk");
        btnPetunjuk.setBounds(40,0,80,50);
        btnPetunjuk.setBackground(Color.BLUE);
        btnPetunjuk.setForeground(Color.white);
        btnPetunjuk.setEnabled(false);

        //button login
        btnLogin = new JButton("Login");
        btnLogin.setBounds(280,0,80,50);
        btnLogin.setForeground(Color.white);
        btnLogin.setBackground(Color.BLUE);
        

        //masukan ke panel3
        p3.add(btnPetunjuk);
        p3.add(btnLogin);
        add("South", p3);

        //menambahkan eventlistener
        btnBaca.addActionListener(this);
        btnLogin.addActionListener(this);
        btnPetunjuk.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnBaca){
            if(daftar.getSelectedValue()=="Horor"){
                new Horror().setVisible(true);
                this.dispose();
            }else if(daftar.getSelectedValue()=="Fiksi"){
                new Fiksi().setVisible(true);
                this.dispose();
            }else if(daftar.getSelectedValue()=="Fantasi"){
                new Fantasi().setVisible(true);
                this.dispose();
            }else if(daftar.getSelectedValue()=="Romansa"){
                new Romance().setVisible(true);
                this.dispose();
            }else if(daftar.getSelectedValue()=="Aksi dan Petualangan"){
                new Aksi().setVisible(true);
                this.dispose();
            }
        }else if(e.getSource()==btnLogin){
            new Login().setVisible(true);
            setVisible(false);
        }else if(e.getSource()==btnPetunjuk){
            new Petunjuk().setVisible(true);
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Home();
    }
}