import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
 
public class Kunang extends JFrame implements ActionListener{
 
   public JTextArea area1;
   public TitledBorder border;
   public String str1;
   public JScrollPane scrollPane1;
   public JPanel panel,p1;
   JButton btnRate,btnBack;
 
   public Kunang() {
      isiLayout();
   }
   public void isiLayout(){
          str1 = " \n           Kutatap pemandangan indah nan unik yang tersaji di depan mataku. Entah apa lagi kombinasi yang lebih sempurna ketimbang matahari terbenam, suara debur ombak, semilir angin sejuk, dan kawanan kunang-kunang yang "+
                 " mengitari sekelilingku. Ombak membawa sebuah cangkang keong laut berukuran besar ke tepian pantai, menarik perhatianku detik itu juga.\n"+
                 "              ' Cangkang itu berisi suara dari dasar samudera. Dengarlah baik-baik. Siapa tahu, seseorang sedang menceritakan sebuah cerita yang menarik dari suatu tempat. Tempat yang mungkin tidak pernah diraih oleh manusia manapun ',"+
                 " demikian ibuku pernah berkata. Saat itu, aku masih kecil sekali. Mama membawaku ke sini sebagai hadiah ulang tahunku yang kelima."+
                 " Tergoda, kudekatkan cangkang itu pada telingaku. Tapi tentu saja, suara yang terdengar hanyalah gaung ruang kosong bercampur debur ombak.\n"+
                 "              ' Dengarlah baik-baik, Merrick. ' Suara ibuku bergema dalam kepalaku. Kutahan benda itu di samping telingaku. Lucu. Aku seperti sedang menelepon seseorang. Samar-samar, terdengar desah suara tangis yang langsung berganti ."+
                 " menjadi suara tawa. Secara mendadak, terdengar gumaman melodi yang entah di mana pernah kudengar. Suara aneh itu benar-benar mengganggu dan memikat dalam waktu yang sama.' Kalau beruntung, mungkin kamu bisa mendengar seseorang memanggil namamu '. \n"+
                 "              Suara debur ombak yang cukup keras membuyarkan lamunanku. Tanganku tetap tergantung di udara, menekan cangkang itu ke telingaku. Cepat-cepat kukembalikan benda itu ke dalam air. Perlahan, karena Mama selalu mengajariku untuk berperilaku sopan kepada alam."+
                 " Aku duduk di atas pasir, tak memedulikan pakaianku yang langsung terasa berat dan basah. Aku tidak asing dengan lautan. Mama sering sekali membawaku kemari, dan tak sekalipun aku menyesalinya. Laut menjadi tempatku mencurahkan segala perasaanku, beban pikiranku, dan cerita-ceritaku. Sekarang, contohnya.\n"+
                 "              ' Hei, ' bisikku pelan. ' Apakah kau tahu di mana Papa berada? ' Desau angin mulai terdengar, mmebentuk sebuah kata, ' Rin..du..? ',' Sedikit, ' aku meringgis. Kumainkan air di sekelilingku. Orang-orang tua bilang, senja adalah saatnya keajaiban benar-benar terjadi, "+
                 " dan itulah yang terjadi. Keajaiban senja membuatku dapat bercakap-cakap dengan desah angin lautan. Keajaiban yang kutemukan di hari pertama aku menginjakkan kaki di tempat ini, ketika laut memanggil namaku lewat cangkang itu.'Bohong...'"+
                 " Aku tertawa gugup. ' Oke, baiklah, banyak. ' Kugaruk tungkukku yang tidak gatal sama sekali. ' Pergi...senja...berakhir...'\n"+
                 "              Aku mendongak, menatap langit yang menjadi keunguan dengan sedikit sekali semburat oranye. Bintang-bintang mulai terlihat di balik awan, dan kawanan kunang-kunang itu mulai terlihat lebih ramai. Mereka berterbangan dengan lincah mengitariku hingga terlihat seperti percikan api yang menari-nari di udara.\n"+
                 "              Sayup-sayup terdengar suara ibuku dari arah sebuah vila besar tak jauh dari sana, mengajakku masuk ke dalam sebelum suhu yang sejuk ini mulai menggigiti tulang. Kutepuk celanaku untuk membersihkan sebanyak mungkin pasir yang menempel di sana. "+
                 " Aku menyerah ketika ibuku memanggil untuk kedua kalinya dan mulai beranjak meninggalkan pantai, laut, dan kawanan kunang-kunang itu. Aku menoleh sekali lagi, tepat sebelum matahari tenggelam sepenuhnya. Kunang-kunang itu terlihat jauh lebih terang dari sebelumnya. \n" +
                 "              Aku tak pernah menceritakan kepada siapapun tentang hubungan pertemananku dengan laut, bahkan kepada ibuku. Aku tidak merasa malu, tetapi siapalah yang akan memercayai perkataan anak berusia 12 tahun? Usia memang hanyalah angka, dan aku tahu aku tidak seperti anak-anak seusiaku. Tapi yah, orang dewasa ‘kan selalu sok tahu. Mereka akan berpikir kalau aku hanya membual.\n"+
                 "              Keesokan harinya, di waktu yang sama, aku mengunjungi laut. Kali ini, bersama ibuku. Entah mengapa ia tiba-tiba ingin ikut denganku. Selama ini, Mama hanya mengagumi laut dari kejauhan. Aku kebingungan ketika Mama melangkah ke dalam air tanpa keraguan sedikitpun. Aku semakin tidak mengerti ketika Mama terisak ketika kakinya terendam air asin yang hangat."+
                 " ' Ada apa, Ma? ' tanyaku pelan, nyaris berbisik. Ibuku terdiam, terisak tanpa jeda. Isakannya semakin lama semakin memilukan.\n "+
                 "              ' Mama, ada apa? Kenapa Mama menangis? Apa Mama tidak suka dengan laut? ' Kupeluk wanita yang amat kusayangi itu. Wanita yang seorang diri membesarkanku selama ini.' Maaf, Merrick, ' ujarnya dengan suara serak. ' Mama hanya tidak tahan lagi...'"+
                 " Tubuh Mama yang ramping merosot ke bawah, jatuh berlutut di atas pasir yang direndam air setinggi mata kaki. Bahunya tergungang begitu keras, dan air mata mulai menetes ke dalam air laut.\n"+
                 "              Matahari yang sudah berada di penghujung hari membuat angin yang bertiup menjadi sedikit lebih dingin dari sebelumnya. Cepat-cepat kusampirkan jaketku ke bahu Mama sebelum kupeluk erat-erat. ' Mama, tolong ceritalah padaku. Apa yang membuat Mama tidak tahan lagi? ' Aku memohon."+
                 " ' Mama rindu pada papamu, Sayang... rindu sekali... dan hati Mama sangat sakit ketika melihat laut ini...' tutur Mama di sela-sela isakannya. ' Memangnya apa yang salah dengan laut ini, Ma? Apa hubungan antara Papa dengannya? ' \n"+
                 "              Mama mendorong tubuhku pelan, memaksakan seulas senyum yang terlihat begitu menyakitkan. ' Mama tidak mau membuatmu membencinya, Sayang, ' katanya pelan dan bergetar. Sebelah tangannya yang basah meraih wajahku, mengelusku dengan lembut. ' Mama tahu kamu sangat menyukai laut… Mama juga tahu kamu adalah anak yang istimewa bagi laut ini.' "+
                 " Aku terkesiap, namun kupikir, lebih baik aku tidak memikirkannya. ' Tolong ceritakan saja padaku, Ma. Apa yang terjadi pada Papa? ' Aku memelas.\n"+
                 "              Mama mengusap air matanya. Ia menarik tanganku, mengajakku untuk duduk di sebelahnya. Aku terkejut ketika air yang seharusnya mulai mendingin setelah matahari terbenam malah terasa lebih hangat dari biasanya. Kunang-kunang mulai hadir, mengisi kegelapan yang mulai tercipta di sekitar kami. Seolah tak ingin mengganggu Mama, suara debur ombak pun kian memelan.\n"+
                 "              ' Dua belas tahun yang lalu adalah hari yang paling membahagiakan dalam hidup Mama, ' tutur Mama dengan suara yang masih sedikit bergetar. Ia menatapku dengan seulas senyum sendu. ' Saat itu adalah dua bulan setelah Mama menikahi papamu. Ia adalah seorang pria yang sangat, sangat luar biasa. Ia sangat baik, sopan, pandai, berkarisma, dan tentunya, sangat tampan. Kamu sangat mirip dengannya, Sayang. ' Mama merangkulku dan menarikku untuk bersandar padanya.\n"+
                 "              ' Papamu mengajak Mama kemari untuk berbulan madu. Kami menghabiskan waktu yang cukup lama di sini, dan setiap harinya sangatlah indah. Hanya ada kami berdua di dalam vila itu. Kami melakukan segalanya bersama. Itulah saat-saat di mana Mama merasa sangat bahagia dan bersyukur dapat terlahir di dunia ini. Tetapi sepertinya, tidak adil bagi manusia untuk terus-menerus merasakan kebahagiaan. ' Suara Mama mulai terdengar semakin rendah dan pahit.\n"+
                 "              ' Mama ingat sekali, hari itu, saat matahari terbenam, kami duduk di pantai dan mengobrol dengan santai. Papamu berkata, jika Mama melahirkan anak laki-laki, ia akan menamainya ‘Merrick’, karena itu berarti ‘Penguasa Lautan’. Saat itu, papamu tidak tahu bahwa Mama sedang mengandung kamu, dan Mama berniat memberi papamu kejutan."+
                 " Tetapi sebelum Mama bisa memberitahunya, ombak tiba-tiba menjadi ganas. Kunang-kunang mendadak bermunculan dari hutan di belakang vila. Langit menjadi gelap dan angin ribut mengelilingi kami. Papamu berusaha membawa Mama untuk berlindung ke vila, tetapi laut kelihatannya tidak ingin papamu pergi.\n"+
                 "              ' Papamu menyuruh Mama pergi, sendirian. Ia berkata ia harus membayar dosanya. Entah apa maksudnya. Tetapi yang pasti, Mama tahu bahwa dulu, papamu persis seperti dirimu. Ia memiliki hubungan yang kuat dengan laut, bahkan dicintai oleh samudera. Itulah saat terakhir Mama bertemu dengan papamu, sekaligus hari terkelam dalam hidup Mama, '"+
                 " kenang Mama dengan pandangan kosong ke arah lautan. Aku terlompat berdiri. Perasaan terkejut dan amarah bercampur dalam benakku. Jadi selama ini, aku berteman dengan pembunuh ayahku? \n"+
                 "              Tanpa pikir panjang, aku melangkah ke dalam air. Kujejakkan kedua kakiku keras-keras, berharap itu akan menyakitinya. Aku merasa dikhianati. Kuhujamkan tanganku ke segala arah kuat-kuat. Kepuasan menguasaiku ketika kurasakan suhu air yang mulai mendingin dan gelombang ombak yang mulai membesar.' Merrick! Jangan marah padanya! Kembalilah kemari! ' "+
                 " seru Mama khawatir. Ia terlihat ingin mendekat padaku, namun laut melarangnya. Ombak berkali-kali mendorongnya pelan ke belakang, menghalaunya mendekatiku.\n"+
                 "              ' Kamu menipuku, ' suaraku tercekat dalam keterkejutan. ' Kenapa? Apa salahnya? Kenapa kamu merenggut ayahku? Kenapa kamu malah bertindak seolah-olah aku adalah temanmu? '. Seekor kunang-kunang terbang melintas di depanku, membuatku kaget dan terjungkal ke belakang. Aku jatuh ke dalam air. Aku tenggelam, namun anehnya, aku tidak merasa sesak. Rasanya, aku seperti melayang di udara."+
                 " Mataku membelalak ketika kulihat ribuan kunang-kunang muncul di hadapanku, di dalam air.' Ini Papa, Sayang, ' suara berat khas pria dewasa menggema di sekitarku. ' Kenapa kamu begitu marah pada Papa? ',' Pa-papa...?' \n"+
                 "              Perlahan namun pasti, kunang-kunang itu membentuk sesosok pria. Pria berwajah tampan yang mirip sekali denganku, yang sedang tersenyum.' Papa senang sekali kamu tumbuh sehat. Maaf ya, Papa tidak bisa mendampingimu dan Mama. Tolong jaga Mama untuk Papa ya? ' bisiknya dengan suara yang penuh sendu."+
                 " Gelombang air membawaku ke permukaan, mendorongku lembut ke tepian. Mama langsung memelukku dengan cemas, menanyakan apakah aku baik-baik saja.' Aku bertemu Papa,' kataku begitu pulih dari keterkejutanku. Wajah Mama langsung menunjukkan ekspresi kaget bercampur senang. 'Apa?',' Aku bertemu Papa, Ma,' ulangku. Kutunjuk laut dengan ujung jariku. ' Papa ada di dalam sana.'\n"+
                 "              Air mata Mama mengalir, diikuti dengan seulas senyuman yang terlihat bergetar. Matanya tertuju pada laut yang tenang dan kunang-kunang yang berterbangan di atasnya.' Kamu terlihat cantik, Sayang.' Aku mendengar suara Papa yang dibawa oleh angin. Tepat sebelum matahari tenggelam sepenuhnya, aku melihat bayangan Papa."+
                 " Bukan dari kunang-kunang, namun benar-benar bayangannya. Rambutnya cokelat tua, matanya sebiru laut, kulitnya sewarna pasir, dan senyumnya begitu menenangkan. Kunang-kunang terbang mengitarinya, membuatnya terlihat semakin bersinar. Kurasa, Mama juga melihat apa yang kulihat, karena Mama langsung menutup mulutnya. Air matanya mengalir semakin deras.\n"+
                 "              ' Aku akan tetap di sini, Sayang, hingga dunia berakhir. Hiduplah dengan bahagia, dan ceritakanlah padaku segalanya, kapanpun kamu mau, ' suara Papa terdengar begitu lembut. ' Aku senang kamu benar-benar menamai anak kita Merrick. ' Begitu semburat oranye itu benar-benar digantikan oleh warna biru keunguan, bayangan Papa menghilang, meninggalkan kumpulan kunang-kunang yang masih berterbangan dengan riang di atas air."+
                 " Sampai hari ini, aku tidak pernah menyadarinya. Kenapa kunang-kunang bisa muncul di pantai? Kenapa mereka selalu muncul di saat senja menuju malam, ketika aku sedang mengunjungi Papa? Kutemukan jawabannya ketika tak sengaja membaca sebuah artikel di internet, berhari-hari kemudian. Rupanya, sejak awal, Papa selalu menyertaiku.";

      area1 = new JTextArea(str1);
      area1.setLineWrap(true);
      area1.setWrapStyleWord(true);
      area1.setEditable(false);
      area1.setBounds(5, 10, 500, 100);
      area1.setFont(new Font("Arial", 1 , 13));
      scrollPane1 = new JScrollPane(area1);
      scrollPane1.setBorder(new TitledBorder("Fireflies Over The Sea"));

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
            Fantasi fan = new Fantasi();
            fan.setVisible(true);
            fan.b2.setEnabled(false);

        }
    }
 
   public static void main(String[] args) {
      Kunang frame = new Kunang();

   }
}