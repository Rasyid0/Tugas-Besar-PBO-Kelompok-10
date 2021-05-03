import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class Maaf extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnRate,btnBack;
 
   public Maaf() {
      isiLayout();
   }
   public void isiLayout(){
          str1 = " \n Engkau mengetuk. \n Namun aku tak membuka pintu. \n Kau berteriak. \n Aku pun berteriak. \n Aku tahu kau berdiri di luar sana menunggu kubukakan pintu, tapi aku sudah terlanjur benci dan kesal padamu gara-gara apa yang kau lakukan beberapa hari yang lalu.\n " +
                 " 'kakak tahu dari mana?', wajahmu memerah kaget karena aku tahu apa yang kau lakukan. 'kau tak perlu tahu aku tahu dari mana, yang pasti mulai detik ini aku tak mau lagi melihatmu' tukasku tegas saat itu. \n"+
                 "              Beberapa hari berlalu, dan sepertinya kau sangat tak nyaman dengan apa yang aku ketahui. Sudah kukatakan padamu untuk menjauh dari Bima, lelaki itu adalah pembunuh berdarah dingin, dan anggota mafia." +
                 " Aku memang sangat akrab dengan dunia hitam itu, kebetulan Bima dulunya adalah mantan rekananku yang sama-sama merintis karir ke-mafiaan dari nol. Tetapi aku mengundurkan diri dari kelompok bernama 'KEBO GARONG' itu semenjak bertahun-tahun lalu karena praktik yang mereka lakukan sangat kejam. \n"+
                 "              Misi terakhir yang aku lakukan dengan Bima adalah ketika kami disuruh menyemb*lih dan memut*lasi seorang kandidat bupati ketika pemilihan tahun 1999 lalu. Karena itulah aku mulai merasa bahwa dunia Mafia itu tak pantas untuk dimasuki, apalagi oleh anak muda kemarin sore sepertimu. "+
                 " Aku juga tak habis pikir, kau rela membunuh bi Mini dan om Ache, yang merupakan bapak dan ibumu sendiri atas perintah si 'BOS BESAR' Bima." +
                 " Dan sekarang, akulah yang menjadi sasaran utama Bima. Dia menyuruhmu membunuhku karena memberikan keterangan yang memeberatkannya ke polisi. Parang yang kau genggam itu akan kau gunakan untuk apa kalau bukan memenggal kepalaku?. \n" +
                 "              'kak.. buka pintunya', suaramu itu aku tahu, pura-pura dilembutkan. 'aku hanya ingin memotong daging, jangan sampai daging yang kupotong itu malah dagingmu sendiri kak. Kasihan aku, nanti tak punya teman'. Keluhmu. 'baik, sebelum itu aku ingin bertanya, kau dijanjikan apa oleh Bima jika mampu membunuhku?'. "+
                 " Tanyaku sambil meraih senapan di atas meja. 'katanya aku akan dijadikan panglima besar di Kebo Garong dan akan menguasai Sumbawa bagian selatan'... Dasar anak tak berpendidikan, mau-maunya saja dibohongi, jika saja Bima mampu membunuhku, maka pertama namanya akan aman karena tak ada saksi atas pembantaian seratus orang di Kafe Limau, " +
                 " kedua dia akan menciptakan perang antar-gang dan membanjiri kota ini dengan darah, yang ketiga, dia akan menguasai kursi sebagai ketua Dewan Kehormatan. Yang paling aku khawatirkan adalah yang ke dua, bukan anggota Mafia saja yang akan terbunuh, tetapi juga warga sipil. \n" +
                 "              'baiklah, sebelum kau membunuhku, aku ingin mendengar ceritamu. Bagaimana kau bisa masuk halaman rumahku dan membunuh sepuluh penjaga?'. Kau langsung menjawabnya dengan santai 'itu mudah, aku membunuh mereka dari belakang tanpa suara. Bahkan salah satu dari mereka kepalanya kubawa sebagai oleh-oleh untukmu'. "+ 
                 " Setidaknya dari keteranganmu itu aku tahu, bahwa kau datang sendirian. 'baik… akan kubukakan pintu ini dan silahkan kau langsung bunuh aku'. \n"+
                 "              Aku langsung menekan tombol merah di dinding, pintu baja itu terbuka perlahan. Aku mewanti-wanti kalau-kalau kau telah bersiap-siap dengan parang yang kau genggam. Pintu telah terbuka sepenuhnya, tapi aku tak melihat wajahmu di depan sana. "+
                 " Kuperhatikan sekeliling, tak ada apapun kecuali mayat yang bergelimpangan dan darah berserakan dimana-mana. \n"+
                 "              'Didit, kau dimana?' teriakanku sepertinya cukup keras hingga membuat burung gereja berterbangan. Tetapi tak ada jawaban. Aku segera berbalik ketika mendengar suara dari balik semak-semak, parahnya sebelum sempat berbalik kau telah menikam perutku dengan pisau dapur. 'akhhh…' aku menatap kedua bola matamu, tak terlihat belas kasihan di dalamnya."+
                 " Kau malah tersenyum. Aku tak bisa membayangkan hal lain selain kematian. Bahkan aku bisa merasakan tulang belakangku tergores pisau.\n "+
                 "              Kau mencabut pisau itu perlahan-lahan, dan justru semakin menambah sakitnya berkali-kali lipat. Sekarang, sekujur tubuhku mulai kejang dan dingin, tetapi mengeluarkan keringat. Sakit yang tak kunjung hilang ditambah mual membuatku memuntahkan seluruh isi perut ke atas rumput."+
                 " Aku sudah terbaring saat pengelihatanku mulai kabur, samar-samar aku melihatmu menjauh 'ini tak akan lama kak, tunggu di sini, aku akan mengambil kapak agar kau bisa pergi dengan cepat'. Dada yang sesak, membuatku kesulitan bernafas. Aku tak tahu bagaimana nasib bekas tusukan tadi, tapi rasanya darah tak berhenti mengalir. Jika saja saat ini ada air, karena aku sangat haus. \n " +
                 "              Kini kau kembali dengan kapak yang kau janjikan. 'kak, maafkan aku. Aku harus melakukan ini. Jika tidak, maka aku yang akan dibunuh'. Cukup jelas terlihat matamu mulai memerah dan mengeluarkan air mata. 'tolong… jangan lakukan ini. Ingat apa yang pernah kita lakukan dulu berdua. Apa kau ingat ketika kita bermain di sungai, ketika kau terbawa arus karena banjir?. " +
                 " Aku yang menyelamatkanmu, apakah sekarang kau akan membunuhku?' aku berusaha meyakinkanmu. Sebelum sempat kulanjutkan perkataanku kau langsung memotong dengan berkata bahwa semuanya sudah tak berarti lagi, dan setelah ini kaupun akan bunuh diri.\n"+
                 "              Tiba-tiba, aku langsung teringat pistol yang tadi kumasukkan ke saku celana. Segera kutarik pistol itu tanpa kau ketahui dan sedikitnya aku mulai mengulur waktu agar kau tak fokus dan lupa. Ketika kau mulai mengeluarkan air mata dengan cerita masa lalu yang kuungkit seketika itu juga kutodongkan pistol tepat ke wajahmu."+
                 " 'Didit, maafkan aku, karena tak mampu menjagamu dengan baik'. Dorrrrrr… suara senapan meletup memenuhi langit dan bumi di bawah sinar rembulan yang kini tampak mencekam. Darah kembali memenuhi pakaianku. Tubuhmu kini menggelepar di atas rumput jepang di halaman rumahku. Aku tidak tahu apa lagi yang akan terjadi setelah ini. Tapi jika aku hidup, maka Bima tak akan hidup lama.";

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Maaf Aku Tak Menjagamu Dengan Baik"));

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
            Aksi ak = new Aksi();
            ak.setVisible(true);
            ak.b2.setEnabled(false);

        }
    }
 
   public static void main(String[] args) {
      Maaf frame = new Maaf();

   }
}