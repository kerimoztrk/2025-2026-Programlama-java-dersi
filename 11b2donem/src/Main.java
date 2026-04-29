import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import java.util.TreeMap;
import javax.swing.*;
import java.awt.*;
interface  Ucan{
    void uc();
}

class Kus implements Ucan{
    public void uc() {

    }
}

abstract class Hayvan2{
    abstract void sesCikar();
}

class Kedi2 extends Hayvan2{
    void sesCikar(){
        System.out.println("Miyav");
    }
}

class Kopek2 extends Hayvan2{
    void sesCikar(){
        System.out.println("Hav Hav");
    }
}

class Kullanici{

    //ALANLAR (fields)

    private String kullaniciAdi; //normal özellik

    private String sifre;  //Sadece yazılabilir özellik

    private String tcKimlik;    //Sadece okunabilir özellik


    //Constructor (ilk değeri atamak için)  Yapıcı metod olarak geçer.
    public Kullanici(String tc){
        this.tcKimlik=tc;
    }

    //Kullanıcı adı için hem yazılabilir hemde okunabilir old için get ve set metodu yazılır.

    public void setKullaniciAdi(String ad){
        this.kullaniciAdi=ad;
    }

    public String getKullaniiciAdi(){
        return kullaniciAdi;
    }

    //sadece yazılabilen özellik (sifre)
    public void setSifre(String sifre){
        this.sifre=sifre;
    }

    //Sadece okunabilir özellik(tc)
    public String getTcKimlik(){
        return tcKimlik;
    }

}

class Ogrenci{

    String ad;
    int yas;

    public Ogrenci(String ad,int yas){
        this.ad=ad;
        this.yas=yas;
    }

    void bilgileriYaz(){
        System.out.println(ad+ " ----- "+yas);

    }
}

class Araba{
    String marka;
    int yil;

    public Araba(String marka){
        this.marka=marka;
    }

    public Araba( String marka,int yil){
        this.marka=marka;
        this.yil=yil;
    }
}

// metot tanımlama

public static int Topla(int a,int b){
    return a+b;
}

//Varsayın parametreli methodlar

public static void SelamVer(){
    SelamVer("Misafir");
}

public  static void SelamVer(String isim){
    System.out.println("Merhaba , "+ isim);
}


public static void bilgiYaz(String ad,int yas){
    System.out.println(ad+" - "+yas);
}


public static int Topla2(int ... sayilar){
    int toplam=0;

    for( int s : sayilar){
        toplam += s;
    }
    return toplam;
}



public  static void kontrol(int sayi){
    if (sayi<0)
        return;
    System.out.println("pozitif sayi");

}

public static int Topla3(int a,int b){
    return a+b;
}

public static int Topla3(int a,int b, int c){
    return a+b+c;
}

public static double Topla3(double a,double b){
    return a+b;
}




// KALITIM KONU BAŞLANGICI

class Insan{
    void konus(){
        System.out.println("İnsan konuşuyor");
    }
}

class  Ogrenci2 extends Insan{

}


class Sekil{
    void ciz(){
        System.out.println("Şekil Çiziliyor");
    }
}

class Daire extends Sekil{

}

class Kare extends Sekil{

}

// METOT GÖLGELEMEE OVERRİDE
class Hayvan {
    void sesCikar(){
        System.out.println("Hayvan sesi");
    }
}

class Kedi extends Hayvan{

    @Override
    void sesCikar() {
        System.out.println("Miyav");
    }
}

class Kopek extends  Hayvan{
    @Override
    void sesCikar() {
        System.out.println("Hav");
    }
}






void main() {

//nesne tanımlama

//    Kullanici k1 =new Kullanici("12345678901");
//
//
//    // değer atama
//
//    k1.setKullaniciAdi("Efe Berk");
//    k1.setSifre("5252");
//
//    // Ekrana yazdırma
//
//    System.out.println("Sistemde var olan kullanıcı adı:"+k1.getKullaniiciAdi());
//    System.out.println("Sistemde var olan TC KİMLİK No"+k1.getTcKimlik());


//    int sonuc=Topla(2,3);
//
//    System.out.println("Sonuc "+ sonuc);

//
//    SelamVer();
//    SelamVer("Berra");

//    bilgiYaz("Kerim ", 25);
//
//    System.out.println(Topla2(1,2,3,4,5));
//
//    System.out.println(Topla2(10,20,30,60,12));

//
//    kontrol(-5);
//    kontrol(10);

//    System.out.println(Topla3(2,3));
//    System.out.println(Topla3(2,3,4));
//    System.out.println(Topla3(2.3,3.5));


//    Ogrenci ogrenci1= new Ogrenci("Eyüp",17);
//    ogrenci1.bilgileriYaz();

//int a =10;
//int b=a;
//
//b=20;
//
//System.out.println(a); //10
//
//
//    int[]dizi1={1,2,3};
//    int[]dizi2=dizi1;
//    dizi2[0]=99;
//
//    System.out.println(dizi1[0]); //99


//Ogrenci2 berra =new Ogrenci2();
//berra.konus();
//
//Daire d=new Daire();
//Kare k=new Kare();
//
//d.ciz();
//k.ciz();

//
//    Kedi k = new Kedi();
//    k.sesCikar();
//
//    Kopek d=new Kopek();
//    d.sesCikar();


// String[] isimler= {"Ahmet","mehmet","aybar","caglar"};
//
// //foreach döngüsü mantıgıyla eleman yazdırma
//
//    for( String isim : isimler){
//        System.out.println(isim);
//    }
//
//
//    Arrays.sort(isimler);
//    System.out.println(Arrays.toString(isimler));
//

    //çok boyutlu dizi tasarımı
//
//    int [][] cokBoyutluDizi= {
//            {12,22,33,43},
//            {42,522,62,41}
//    };
//
//
//    for ( int i=0; i<cokBoyutluDizi.length;i++){
//        for(int j=0; j<cokBoyutluDizi[i].length;j++){
//            System.out.println(cokBoyutluDizi[i][j]+ " ");
//        }
//        System.out.println();
//    }



//    int [][] cokBoyutluDiziToplama = {
//            {123,123,12,12},
//            {424,121,6546,7655}
//    };
//
//
//    int toplam = 0 ;
//
//    for( int i =0; i<cokBoyutluDiziToplama.length;i++){
//        for (int j =0 ; j<cokBoyutluDiziToplama[i].length;j++){
//            toplam += cokBoyutluDiziToplama[i][j];
//        }
//    }
//
//    System.out.println("Dizinin içindeki tolam elemean değerleri = "+toplam);


//
//    int [] sayilar= {12,5,7,88};
//    System.out.println("Orjinal dizi");
//    for (int s:sayilar){
//        System.out.println(s+ " ");
//    }
//
//    //sıralama
//
//    Arrays.sort(sayilar);
//    System.out.println("\n Sıralamanmış dizi:");
//    System.out.println(Arrays.toString(sayilar));
//
//    //2 boyurlu dizi
//
//    int  [][] dizi={
//            {1,2},
//            {3,4}
//    };
//
//    int toplam2 = 0 ;
//
//    for( int i =0; i<dizi.length;i++){
//        for (int j =0 ; j<dizi[i].length;j++){
//         toplam2 += dizi[i][j];
//      }
//  }
//
//    System.out.println("Dizinin içindeki tolam elemean değerleri = "+toplam2);
//

//     int sayi=5;
//
//     //Boxing (kutulama)
//
//    Integer nesne= sayi;
//
//    //ubboxing
//
//    int tekrar= nesne;
//
//
//    System.out.println("ilkel: "+ sayi);
//    System.out.println("Nesne: "+nesne);
//    System.out.println("Tekrar ilkel: "+tekrar);

//Arraylist tanımlama örneği
//    ArrayList<Integer> sayilar= new ArrayList<>();
//
//    sayilar.add(10);
//    sayilar.add(20);
//    sayilar.add(30);
//
//    System.out.println("Eleman sayısı : "+sayilar.size());
//    System.out.println("İlk eleman : "+ sayilar.get(0));

//    ArrayList<String> isimler= new ArrayList<>();
//
//    isimler.add("Ali");
//    isimler.add("Veli");
//    isimler.add("Ayşe");
//
//    for (String isim: isimler){
//        System.out.println(isim);
//    }



//    ArrayList<String> meyveler= new ArrayList<>();
//
//    meyveler.add("Elma");
//    meyveler.add("Armut");
//    meyveler.add("Muz");
//    //eleman düzenleme
//    meyveler.set(1,"Portakal");
//    //eleman silme
//    meyveler.remove(0);
//
//    System.out.println(meyveler);


    //list oluşturma orneği
//    List <Integer> sayilar2=new ArrayList<>();
//
//    sayilar2.add(5);
//    sayilar2.add(14);
//    sayilar2.add(20);
//
//    for (int s: sayilar2){
//        System.out.println(s);
//    }
//

//öğrenci notları
//
//    List <Integer> notlar=new ArrayList<>();
//
//    notlar.add(70);
//    notlar.add(89);
//    notlar.add(77);
//    notlar.add(90);
//
//    int toplam= 0;
//
//    System.out.println("Notlar: ");
//
//    for (int n: notlar){
//        System.out.println(n);
//        toplam+=n;
//    }
//
//    double ortalama= (double)toplam / notlar.size();
//
//    System.out.println("ORtalama: "+ ortalama);
//
//
//    if (ortalama>=70){
//        System.out.println("Geöti");
//    }else{
//        System.out.println("Kaldı");
//    }

    //queue kuyruk konu anlatımı

//    Queue <String> kuyruk= new LinkedList<>();
//
//    kuyruk.add("Ayşe");
//    kuyruk.add("ali");
//    kuyruk.add("Mehmet");
//
//    System.out.println("işl çıkan: "+ kuyruk.poll());
//    System.out.println("Sıradaki eleman: "+kuyruk.peek());
//
    //Stack yıgın yapısı konu anlatımı
//
//    Stack<Integer> yigin =new Stack<>();
//
//    yigin.push(10);
//    yigin.push(20);
//    yigin.push(30);
//
//    System.out.println("Çıkan eleman: "+ yigin.pop());
//    System.out.println("Üstteki eleman "+ yigin.peek());
//
//
//    Map<String,Integer> notlar=new HashMap<>();
//
//    notlar.put("Ali",60);
//    notlar.put("Ayse",50);
//    notlar.put("Alihan",70);
//
//
//    System.out.println("Alinin notu = "+ notlar.get("Ali"));
//
//    Hashtable<Integer,String> tablo= new Hashtable<>();
//
//    tablo.put(1,"Elma");
//    tablo.put(2,"Armut");
//
//    System.out.println("1 numaralı elaman  "+tablo.get(1));
//
//
//    TreeMap<Integer,String> liste=new TreeMap<>();
//
//    liste.put(3,"C");
//    liste.put(1,"A");
//    liste.put(2,"B");
//
//    System.out.println(liste);
//
//
//    //queue yapısı müşteri sırası
//    Queue <String> musteriSirasi= new LinkedList<>();
//    musteriSirasi.add("Ali");
//    musteriSirasi.add("Ayşe");
//    musteriSirasi.add("Mehmet");
//
//    //Stack işlem geçmisi
//
//    Stack<String> gecmis = new Stack<>();
//
//    // Map = müşteri bakiyesi
//    Map<String,Integer> bakiye=new HashMap<>();
//    bakiye.put("ALi",100);
//    bakiye.put("Ayşe",200);
//    bakiye.put("Mehmet",150);
//
//    // ilem başlat
//    String siradaki=musteriSirasi.poll();
//    System.out.println("işlem yapılan müşteri : "+siradaki);
//
//    //bakiye görüntüleme
//    System.out.println("Bakiye "+ bakiye.get(siradaki));
//
//    //geçmişe ekle
//    gecmis.push(siradaki);
//
//    //son işlem kimdi
//    System.out.println("So işlem yapan: "+ gecmis.peek());

//    JFrame frame = new JFrame("İlk Form");
//    frame.setSize(400,300);
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setVisible(true);

//
//    JFrame frame2=new JFrame("Kontroller");
//    frame2.setSize(400,300);
//    frame2.setLayout(null);
//    JLabel label= new JLabel("Ad:");
//    label.setBounds(50,50,100,30);
//
//    JTextField text =new JTextField();
//    text.setBounds(150,50,120,30);
//
//    JButton button=new JButton("Gönder");
//    button.setBounds(150,100,100,30);
//
//    frame2.add(label);
//    frame2.add(text);
//    frame2.add(button);
//
//    frame2.setVisible(true);


//    JFrame frame3= new JFrame("Panel");
//    frame3.setSize(400,300);
//
//    JPanel panel = new JPanel();
//
//    panel.add(new JButton("Buton1"));
//    panel.add(new JButton("Buton1"));
//
//    frame3.add(panel);
//    frame3.setVisible(true);

//
//    JFrame frame4= new JFrame("Menü");
//    frame4.setSize(400,300);
//
//    JMenuBar bar = new JMenuBar();
//    JMenu menu=new JMenu("Dosya");
//
//    JMenuItem ac=new JMenuItem("Aç");
//    JMenuItem cikis=new JMenuItem("Çıkış");
//
//    menu.add(ac);
//    menu.add(cikis);
//    bar.add(menu);
//
//    frame4.setJMenuBar(bar);
//    frame4.setVisible(true);

//
//
//    JFrame frame5=new JFrame("Popup");
//    frame5.setSize(400,300);
//
//    JPopupMenu popup= new JPopupMenu();
//    popup.add(new JMenuItem("sil"));
//
//    JTextArea area= new JTextArea();
//    area.setComponentPopupMenu(popup);
//
//    frame5.add(area);
//    frame5.setVisible(true);
//
//
//    JOptionPane.showMessageDialog(null,"MErhaba");

//
//JFileChooser secici=new JFileChooser();
//secici.showOpenDialog(null);
//secici.showSaveDialog(null);

//    JFrame frame6= new JFrame();
//    frame6.setSize(400,300);
//
//    JLabel label2=new JLabel("Merhaba");
//    label2.setFont(new Font("Arial",Font.BOLD,25));
//
//    frame6.add(label2);
//    frame6.setVisible(true);


//    Color renk =JColorChooser.showDialog(null,"Renk Seç ",Color.RED);
//    System.out.println(renk);

    JFrame frame = new JFrame("Uygulama");
  frame.setSize(400,300);
  frame.setLayout(null);

  JTextArea area2= new JTextArea();
  area2.setBounds(50,50,300,150);

  JButton btn= new JButton("Göster");
  btn.setBounds(50,220,100,30);

  btn.addActionListener(e ->
          JOptionPane.showMessageDialog(null, area2.getText())
    );

  JButton renkBtn=new JButton("Renk");
  renkBtn.setBounds(170,220,100,30);

  renkBtn.addActionListener(e->{
          Color c=JColorChooser.showDialog(null,"Seç",Color.WHITE);
  area2.setBackground(c);
  });

  JMenuBar bar = new JMenuBar();
  JMenu menu= new JMenu("Dosya");
    JMenuItem cikis= new JMenu("Çıkış");

    cikis.addActionListener(e->
            System.exit(0));


    menu.add(cikis);
    bar.add(menu);


    frame.setJMenuBar(bar);

    JPopupMenu popup=new JPopupMenu();
    JMenuItem temizle= new JMenuItem("Temizle");
    popup.add(temizle);

    temizle.addActionListener(e->
            area2.setText(" "));

    area2.setComponentPopupMenu(popup);

    frame.add(area2);
    frame.add(btn);
    frame.add(renkBtn);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);




}


