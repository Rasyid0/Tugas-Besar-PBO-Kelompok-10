import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class Petunjuk extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnBack;
 
   public Petunjuk() {
      isiLayout();
   }
   public void isiLayout(){
    str1 = "Petunjuk Penggunaan:\n"+
    "1. Silahkan Login terlebih dahulu. Setelah anda login maka anda akan mengakses fitur-fitur yang tersedia.\n"+
    "2. Kemudian silahkan tekan genre yang diinginkan lalu tekan tombol Baca Buku.\n"+
    "3. Setelah itu anda akan diarahkan ke menu Bacaan.\n"+
    "4. Lalu pilih bacaan yang diinginkan. Kemudian tekan tombol Baca.\n"+
    "5. Setelah selesai membaca anda dapat memberikan penilaian terhadap bacaan tersebut. Dengan cara tekan tombol rate, lalu masukkan penilaian.\n"+
    "    Contoh: Sangat Bagus, Bagus, Kurang Bagus.\n"+
    "6. Anda dapat kembali ke menu sebelumnya dengan menekan tombol back.";
    
      

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Petunjuk Penggunaan"));

      panel = new JPanel();
      panel.setLayout(new GridLayout(1, 2, 3, 3));
      panel.add(scrollPane1);
 
      getContentPane().add(panel, BorderLayout.CENTER);
      
      setTitle("Pentunjuk Penggunaan");
      setSize(400, 400);
      setVisible(true);
      setLocationRelativeTo(null);

      p1 = new JPanel();
      
      btnBack = new JButton("Back");
      btnBack.setSize(300,200);
      p1.add(btnBack);

      add("South",p1);
      btnBack.addActionListener(this);
   }
       public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btnBack){
            this.dispose();
            Home home = new Home();
            home.btnBaca.setEnabled(true);
            home.btnPetunjuk.setEnabled(true);
            home.btnLogin.setEnabled(false);
        }
    }
 
   public static void main(String[] args) {
      Petunjuk frame = new Petunjuk();

   }
}