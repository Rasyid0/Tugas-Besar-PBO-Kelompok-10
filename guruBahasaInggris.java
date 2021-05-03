import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class guruBahasaInggris extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnRate,btnBack;
 
   public guruBahasaInggris() {
      isiLayout();
   }
   public void isiLayout(){
          str1 = " Ada seorang gadis muda bernama Putri yang tidak ingin pergi ke sekolah. Namun teaman-temannya sering memnggilnya dengan sebutan Puri. Walaupun ia selalu mendapatkan nilai bagus di sekolahnya ia tidak suka untuk pergi ke sekolah karena selalu bermasalah dengan gurunya.\n\n"+
          " Ketika hari pertama ia kembali ke sekolah, Puri kaget karena ia menemukan seorang guru bahasa inggris baru di sekolahnya. Guru tersebut adalah seorang wanita berusia 30an dengan wajah datar tanpa ada selera humor.\n\n"+
          " Ketika di kelas teman sebangkunya Vera mengacungkan tangannya dan bertanya kepada guru tersebut. 'Bu, mengapa tahi lalatmu terus berubah?'\n\n"+
          " Tiba-tiba guru itu tampak bingung,\n\n"+
          " 'Apa yang mau dibicarakan?' Tanyanya\n\n"+
          " 'Tahi lalat diwajahmu, mereka terus berubah. Hari Senin anda memiliki satu tahi lalat, tetapi hari Selasa dan rabu berubah menjadi tiga tahi lalat.'\n\n"+
          " Puri juga ikut memperhatikan, ternyata memang berbeda.\n\n"+
          " Guru tersebut hanya berkata. 'Seperti yang kamu lihat, saya hanya mempunyai satu tahi lalat di wajah saya. Sekarang, jika kamu memikirkan sesuatu yang tidak sesuai, saya akan mengapresiasi pendapatmu untuk pelajaran ini, dan jagalah mulutmu untuk diam.'\n\n"+
          " Teman-teman sekelasnya hanya tertawa tanpa memperdulikan ucapan Vera.\n\n"+
          " Esok harinya, ia tidak menemukan Vera hadir di kelas, begitu pula dengan ahri-hari setelahnya.\n\n"+
          " Malam itu, Vera akhirnya memutuskan untuk mengikuti gurunya dan mencari tahu dimana ia tinggal. Setelah sampai ia bersembunyi di balik bilik dapur untuk emnegtahui apa yang terjadi.\n\n"+
          " Ternyata disana berdiri tiga orang wanita kembar  dengan tahi lalat yang berbeda. Puri sadar ternyata gurunya bukanlah satu orang, tetapi tiga orang yang  selalu bergantian. Tak lama setelah itu datang petugas kebersihan sekolah yang tak lain adalah suami mereka.\n\n"+
          " 'Apa yang kamu inginkan untuk makan malam kali ini, sayang?'\n\n"+
          " 'Sama seperti tadi malam, paha yang sangat bagus dan juga berair,' kata pria itu sambil menjilati bibirnya.\n\n"+
          " Ketika wanita itu mulai membuka frezer es, Puri sangat terkejut karena disana telah menggantung mayat temannya Vera yang badannya telah dipotong-potong.\n\n"+
          " 'Aku mencium sesuatu!' serup pria itu. 'Aroma seorang gadis muda!' sambungnya.\n\n"+
          " Tiba-tiba ia melihat pintu lemari tempat persembunyiannya terbuka dan terlihat seorang pria petugas kebersihan bersama gru bahasa inggris kembarnya berdiri sambil meneteskan air liur.\n\n"+
          " 'Daging segar!Daging segar!' serunya.\n\n"+
          " Petugas kebersihan mulai menjambak rambut Puri, menariknya keluar, dan menggulingkannya di tanah.Dia mencoba melawannya namun tidak berhasil. Gigi putih yang bengkok dan cacat sudah bersiap untuk menggigitnya.\n\n"+
          " Esok seninnya...\n\n"+
          " Teman-teman sekelas memperhatikan bahwa Puri telah menghilang dari kelas. Tidak ada yang tahu bahwa ketika guru bahasa inggris di hadapan mereka sibuk menjelaskan berbagai kata kerja, mayat Puri telah tergantung di loker daging apartemen dengan tubuh yang sudah terpotong-potong.\n\n"+
          "                                                                                   TAMAT\n\n\n"+
          " Sumber: https://thegorbalsla.com/cerpen-horor/#Cerpen_Horor_Sekolah";
    
      

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Guru Bahasa Inggris"));

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
            Horror hor =  new Horror();
            hor.setVisible(true);
            hor.b2.setEnabled(false);
        }
    }
 
   public static void main(String[] args) {
      guruBahasaInggris frame = new guruBahasaInggris();
    }
}