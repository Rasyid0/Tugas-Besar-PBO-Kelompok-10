import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class mimpiSangDara extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnRate,btnBack;
 
   public mimpiSangDara() {
      isiLayout();
   }
   public void isiLayout(){
          str1 = " \n            Pagi menjelang saat seorang gadis yang biasa dipanggil dengan nama Dara mulai menjerang air untuk membuat segelas teh panas." + 
             " Dara, ialah gadis yang hidup dengan sejuta mimpi di dalam sebuah rumah berdinding tinggi." +
             " Dara merupakan gadis yang tumbuh di dalam keluarga berkecukupan, bahkan bisa dibilang sangat kaya." +
             " Namun sayangnya Dara tidak bisa menopang tubuhnya sendiri tanpa menggunakan bantuan kursi roda, sehingga merasa diacuhkan bahkan saat berada di istana mewah tersebut. \n\n" +
             "              Kedua orang tua Dara selalu mengacuhkannya karena merasa tidak ada yang bisa diharapkan dari gadis dengan kursi roda tersebut. " +
             " Sementara kakaknya mungkin saja malu mempunyai adik dengan kondisi seperti Dara." + 
             " Setiap hari Dara hanya menghabiskan waktunya di dalam kamar dan sesekali mengarahkan kursi rodanya menuju arah taman.  Gadis yang berusia 17 tahun tersebut sangat senang untuk menggambar di taman guna menghilangkan pikiran buruknya yang menyesali keadaannya. \n\n" +
             "              Suatu pagi Dara jatuh dari kursi rodanya, namun tidak ada seorangpun di dalam rumah tersebut mendekat untuk menolongnya. " +
             " Rasa kecewanya terhadap hal tersebut membuat Dara memiliki kekuatan untuk menggerakan kursi rodanya ke arah taman kompleks, berniat menenangkan diri. \n\n" +
             "              Saat sedang terisak di taman, tiba-tiba Dara dihampiri oleh seorang gadis seusianya dengan kondisi yang sama. Gadis tersebut mengulurkan tangan untuk Dara dan mulai menyebutkan namanya, yaitu Hana."+
             " Mereka berdua mudah sekali akrab, mungkin karena keduanya saling mengerti kondisi masing-masing. Tiba-tiba Hana Berkata, "+
			 " 'Dara, ingatlah bahwa tidak ada seorangpun di dunia ini yang terlahir sia-sia. Mungkin kita tidak bisa berdiri tegak layaknya manusia lain.Tapi, kita masih punya hak untuk merasakan bahagia. Cobalah untuk menerima dirimu sendiri, Dara' lalu, akhirnya gadis itu berpamitan pada Dara. \n\n"+
             "              Semenjak pertemuannya di taman dengan Hana, Dara mulai merenungi kata-kata yang diucapkan oleh gadis tersebut. Dara berpikir bagaimana ia bisa seutuhnya menerima dirinya ketika orang di dekatnya tidak mendukungnya sama sekali."+
             " Dara mencoba mencerna perkataan dari Hana secara perlahan, meskipun seringkali ia menangis ketika teringat kenyataan bahwa ia hanyalah seorang gadis yang diacuhkan. Hal yang dipikirkan oleh Dara adalah bagaimana ia bisa mewujudkan mimpinya dengan kondisi tersebut. \n\n"+
             "              Mimpi Dara adalah menjadi seorang pelukis yang karyanya bisa dipajang di dalam pameran besar. Hal yang dilakukan Dara untuk memulainya adalah rajin membuat lukisan. Kesibukan tersebut juga dilakukan Dara untuk tidak memikirkan mengenai dirinya yang selalu diacuhkan dan mulai memahami perkataan Hana."+
             " Perlahan mimpi sang Dara mulai terwujud saat diam-diam ia sering memposting lukisannya melalui media sosial. Hingga suatu hari ada seseorang datang ke rumah Dara untuk menemui gadis itu guna mengajaknya untuk bergabung di dalam sebuah pameran lukisan. \n\n " +
             "              Kedua orang tua Dara terperangah mendengar ucapan pria tersebut, sebab tidak menyangka bahwa Dara si gadis kursi roda bisa menghasilkan karya lukisan yang indah. Dara hanya tersenyum melihat respon kedua orang tuanya dan memilih menerima tawaran pameran tersebut."+ 
             " Berbagai lukisan indah dipajang dalam pameran yang diberi tema Mimpi Sang Dara. Orang tua Dara menghadiri pameran tersebut dan merasa terharu atas pencapaian putri yang selama ini diacuhkannya. Sementara Dara merasa lega bisa menerima keadaan fisiknya dan memanfaatkan apa yang dimiliki.\n\n\n" +
             "                                                                                   TAMAT";
    
      

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Mimpi Sang Dara"));

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
            Romance roman =  new Romance();
            roman.setVisible(true);
            roman.b2.setEnabled(false);

        }
    }
 
   public static void main(String[] args) {
      mimpiSangDara frame = new mimpiSangDara();

   }
}