import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class legendaGunungBromo extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnRate,btnBack;
 
   public legendaGunungBromo() {
      isiLayout();
   }
   public void isiLayout(){
          str1 = " Dikisahkan di zaman dahulu hiduplah seorang pemuda yang bernama Joko Seger jatuh hati kepada Roro Anteng.\n\n"+
          " Mereka kemudian menjalin kasih serta memutuskan agar segera menikah. Namun sayangnya, niat suci tersebut terhambat dengan adanya orang jahat yang sakti ingin merebut sang Roro Anteng.\n\n"+
          " Namun Roro pun tidak berani melakukan penolakan sebab ia merasa khawatir apabila akan terjadi hal buruk yang mungkin akan dikerjakan orang jahat itu.\n\n"+
          " Akhirnya sang pria jahat tersebut menyanggupinya serta berupaya untuk membuat sumur di Gunung Bromo dengan memakai tempurung kelapa atau dalam bahasa Jawa disebut sebagai 'batok'.\n\n"+
          " Untuk menggagalkan upaya tersebut, Roro Anteng kemudian memukulkan alu padi agar membangunkan para ayam supaya mereka segera berkokok.\n\n"+
          " Dan akhirnya usaha itu berhasil serta pria jahat tersebut kalah sebab ia belum berhasil membuat lautan.\n\n"+
          " Itulah alasan mengapa Gunung Bromo bentuknya tumpul.\n\n"+
          " Merasa marah serta mengamuk, ia kemudian melemparkan batok kelapa yang ia pakai serta sekarang menjadi Gunung Batok.\n\n"+
          " Selepas itu, Roro Anteng kembali di pelukan Joko Seger dan mereka hidup bahagia selamanya.\n\n"+
          "                                                                                   TAMAT\n\n\n"+
          " Sumber: https://www.yuksinau.id/teks-cerita-fiksi/contoh/#Contoh_Teks_Cerita_Fiksi_Cerita_Rakyat";
    
      

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Legenda Gunung Bromo"));

      panel = new JPanel();
      panel.setLayout(new GridLayout(1, 2, 3, 3));
      panel.add(scrollPane1);
 
      getContentPane().add(panel, BorderLayout.CENTER);
      
      setTitle("Cerpen");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(700, 500);
      setVisible(true);
      setLocationRelativeTo(null);

      p1 = new JPanel();
      

      btnRate = new JButton("Rate");
      btnRate.setSize(300,200);
      p1.add(btnRate);

      btnBack = new JButton("Back");
      btnBack.setSize(300,200);
      p1.add(btnBack);

      add("South",p1);
      btnRate.addActionListener(this);
      btnBack.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRate){ // Jika tombol btnLogin di klik maka
            String a = (JOptionPane.showInputDialog("Masukkan Rating Anda "));
             JOptionPane.showMessageDialog(this, "Terima kasih :)", "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this ,"Rating yang anda input : "+a);
        }
        if(e.getSource()== btnBack){
            this.dispose();
            Fiksi fik =  new Fiksi();
            fik.setVisible(true);
            fik.b2.setEnabled(false);
        }
    }
 
   public static void main(String[] args) {
      legendaGunungBromo frame = new legendaGunungBromo();
    }
}