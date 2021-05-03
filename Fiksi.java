import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

// implements Action listener dan Mouse Listener
public class Fiksi extends JFrame implements MouseListener {
    // inisialisasi Global properti
    public JLabel l1,l2,l4;
    public JButton b1,b2,btnBack;
    public ImageIcon book1,book2;
    public JPanel p1,p2;


    // Konstruktor
    public Fiksi(){
        initComponen();
    }
    // void GUI
    public void initComponen(){
        setTitle("DAFTAR BUKU");
        setBounds(500,100,500,500);
        
        p1 = new JPanel();p2 = new JPanel();
        l1 = new JLabel();l2 = new JLabel();l4 = new JLabel("Kategori Fiksi");
        b1 = new JButton("BACA");b2 = new JButton("BACA");
        book1 = new ImageIcon("GunungBromo.jpg");book2 = new ImageIcon("LorongWaktu.jpg");
        
        // Panel
        p1.setLayout(new FlowLayout());
        p1.setBackground(new Color(192,192,192));
        l4.setSize(100,100);
        p1.setSize(500,50);
        add("North",p1);
        p1.add(l4);
        //Akhir Panel 

        // Gambar
        l1.setBounds(55,80,100,100);
        l1.setIcon(book1);
        l1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(l1);

        l2.setBounds(200,80,100,100);
        l2.setIcon(book2);
        l2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(l2);
        // Akhir Gambar

        // Tombol
        b1.setBounds(55,177,100,30);
        add(b1);

        b2.setBounds(200,177,100,30);
        b2.setEnabled(false);
        add(b2);

        // Akhir Button
        
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p2.setBounds(0,420,500,55);
        btnBack = new JButton("Back");
        btnBack.setBounds(100,600,150,50);
        p2.add(btnBack);
        p2.setBackground(Color.BLUE);
        

        add("South",p2);

        // mouse Listener
        l1.addMouseListener(this);
        l2.addMouseListener(this);
        b1.addMouseListener(this);
        b2.addMouseListener(this);
        btnBack.addMouseListener(this);

    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource() == l1){
            JOptionPane.showMessageDialog(null,"Judul = Legenda Gunung Bromo \n Nama Pengarang = ?\n"+"Tahun dibuat = ?","Detail Buku", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getSource() == l2){
            JOptionPane.showMessageDialog(null,"Maaf Belum Tersedia");
        }
        if(e.getSource() == b1){
            new legendaGunungBromo().setVisible(true);
            this.dispose();
        }
        if(e.getSource() == btnBack){
            this.dispose();
            Home home = new Home();
            home.btnBaca.setEnabled(true);
            home.btnPetunjuk.setEnabled(true);
            home.btnLogin.setEnabled(false);
        }

    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String[] args){
        new Fiksi();
    }
}