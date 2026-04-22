import javax.annotation.processing.SupportedSourceVersion;
import javax.sql.rowset.spi.SyncResolver;
import java.util.*;


class Matematik{

    static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
}

class HesapMakinesi{
    static int kareAl(int sayi){
        return sayi*sayi;
    }
}

interface Ucan {
    void  ucmak();
}

class Kus implements Ucan{

    public void ucmak(){
       System.out.println("Uçuyosun");
    }
}


class Arac {
    void calistir(){
        System.out.println("Araç çalışıyor");
    }
}

class Araba2 extends Arac{
    @Override
    void calistir() {
        System.out.println("Araba çalşıt");
    }
}

class  Motosiklet extends Arac{
    @Override
    void calistir() {
        System.out.println("Motosiklet Çalıştı");
    }
}




abstract class Hayvan2{
    abstract void sescikar();
}

class Kedi2 extends Hayvan2{
    @Override
    void sescikar() {
        System.out.println("Miyav");
    }
}

class Kopek2 extends Hayvan2{
    @Override
    void sescikar() {
        System.out.println("HAv Hav");
    }
}





class Kisi{
    int yas;
}
class Kullanici{

    //alan tanımlama (fields)

    private String kullaniciAdi;    //normal özellik
    private String Sifre;           //sadece yazılabilir
    private String tcKimlik;        //sadece okunabilir öözellik


    //Constructor ( ilk değeri atamak için)

    public Kullanici(String tc){
        this.tcKimlik=tc;
    }


    // Kullancı adı hem okunulabilir hem de yazılabilir old. için get ve set metodu yazılır.

    public void setKullaniciAdi(String ad){
        this.kullaniciAdi=ad;
    }

    public String getKullaniciAdi(){
        return kullaniciAdi;
    }

    //sadece yazıalbilir bir özellik
    public void setSifre(String sifre){
        this.Sifre=sifre;
    }

    public String getTcKimlik(){
        return tcKimlik;
    }

}


class Ogrenci{
    String ad;
    int yas;


    //constructor oluşturma örneği
    public Ogrenci(String ad,int yas){
        this.ad=ad;
        this.yas=yas;
    }

    void bilgileriYaz(){
        System.out.println(ad+"-----"+yas);
    }




}


class Araba{
    String marka;
    int yil;

    public Araba(String marka){
        this.marka=marka;
    }
}


//kalıtım örneği

class Insan {
    void konus(){
        System.out.println("insan konuştu");
    }
}

class Ogrenci2 extends Insan{

}

class  Sekil{
    void ciz(){
        System.out.println("Şekil çiziliyor");
    }
}

class Daire extends Sekil{

}
class  Kare extends  Sekil{

}


class Hayvan{
    void sesCikar(){
        System.out.println("Hayvan sesi");
    }
}


class Kedi extends Hayvan{
    @Override
    void sesCikar() {

     System.out.println("miyav");
    }
}

class Kopek extends Hayvan{
    @Override
    void sesCikar() {
        System.out.println("HAv Hav");
    }
}
public class Main {

    // METOT TANIMI

    public static int Topla(int a,int b){
        return a+b;
    }

    //varsayılan değerli parametreler

    public static void selamVer(){
        selamVer(" üyw");
    }

    public static void selamVer(String isim){
        System.out.println(("merhaba "+isim));
    }




    public static void bilgiYaz(String ad,int yas){
        System.out.println(ad+" - "+yas);
    }



    public static  int Topla2(int ... sayilar){
        int toplam=0;

        for (int s: sayilar){
            toplam+=s;
        }

        return toplam;
    }



    public static  void kontrol(int sayi){
        if (sayi<0){
            return;
        }
        System.out.println("Pozitif SAyı");
    }



    public static int MatematikselToplama(int a, int b){
        return a+b;
    }

    public static int MatematikselToplama(int a, int b,int c){
        return a+b+c;
    }

    public static double MatematikselToplama(double a, double b){
        return a+b;
    }


public static void degistir(int x){
        x=50;
}
    public static void degistir(Kisi k){
        k.yas=30;
    }


    public static void main(String[] args) {
        //System.out.println("KErim");
        //System.out.print("öztürk");
        //System.out.print("11B dersi Çğretmeni");
        //System.out.print("'dir");
        //System.out.println("merhaba");
        //System.out.print("gencler");


        // System.out.println("-------- Yemek Çeşitleri ---------");
        // System.out.println();
        // System.out.println("1- Ana Yemek");
        // System.out.println("2- Çorbalar");
        // System.out.println("3-  Tatlılar");
        // System.out.println("4- Salatalar");
        // System.out.println("5- İçecekler");
        // System.out.println();
        // System.out.println("-------- Yemek Çeşitleri ---------");


        //Snake Case => degisken_turu_ornegi
        //Camel Case => degiskenTuruOrnegi
        //Pascal Case => DegiskenTuruOrnegi
        // Hungarian Case=> strDegiskenTuruOrnegi
        // Keabab Caee => degisken-turu-ornegi

        //String yolcuAdi="Nazmi";
        //String YolcuSoyAdı="Şen";
        //String yolcueposta="nazmisen@hotmail.com";
        //String yolcutelefonnumara="12321312";
        //String yolcuLokasyon= "Gaziosmanpaşa";
        //String yolcuSehir="istanbul";

        //System.out.println("----------Rezervasyon KArtı--------");
        //System.out.println();
        //System.out.println("Müşteri Adı: "+ yolcuAdi    );
        //System.out.println("Müşteri Soyadı: "+ YolcuSoyAdı);
        //System.out.println("Müşteri Epostası: "+ yolcueposta);
        //System.out.println("Müşteri Telefon no: "+ yolcutelefonnumara);
        //System.out.println("Müşteri'nin Yaşadığı yer:  "+ yolcuLokasyon);
        //System.out.println("Adres: "+ yolcuSehir+ "/"+ yolcuLokasyon);
        //System.out.println();
        //System.out.println("----------Rezervasyon KArtı--------");


       /* int hamburgerFiyarı=300;
        int KolaFiyatı=80;
        int suFiyatı=10;
        int PatatesKızartmasıFiyatı=100;
        int LimonataFiyatı=100;

        int hamburgerSayisi=2;
        int kolaSAyisi=2;
        int suSayisi=2;
        int PatatesKızartması=2;
        int LimonataSayisi=1;

        int toplamHamburgerFiyatı= hamburgerFiyarı*hamburgerSayisi;
        int toplamKolaFiyatı=kolaSAyisi*KolaFiyatı;
        int toplamSusFiyatı=suFiyatı*suSayisi;
        int toplamPatatesKızartmasıFiyatı=PatatesKızartmasıFiyatı*PatatesKızartması;
        int toplamLimonataFiyatı=LimonataFiyatı*LimonataSayisi;


        System.out.println("************ Sipariş Özeti **********");
        System.out.println();
        System.out.println("Hamburger: "+ toplamHamburgerFiyatı +" TL");
        System.out.println("Kola :"+toplamKolaFiyatı +" TL");
        System.out.println("Su: "+toplamSusFiyatı +" TL");
        System.out.println("Patates Kızartma: "+toplamPatatesKızartmasıFiyatı +" TL");
        System.out.println("Limonata Fiyatı: "+toplamLimonataFiyatı +" TL");


        double portakalFiyati=12.43;
        double elmaFiyatı=23.51;
        double muzFiyatı=100.99;
        double uzumFiyatı=130.2;
        double cilekFiyatı=7.42;

        System.out.println("------------ Fiyat Listesi ***********");
        System.out.println();
        System.out.println(" Portakal : "+ portakalFiyati +" TL");
        System.out.println(" Muz : "+muzFiyatı+" TL");
        System.out.println(" Üzüm Fiyatı : "+uzumFiyatı+ " TL");
        System.out.println(" Çilek Fiyatı : "+cilekFiyatı+" TL");

*/
/*

        double portakalFiyati=12.43;
        double elmaFiyatı=23.51;
        double muzFiyatı=100.99;
        double uzumFiyatı=130.2;
        double cilekFiyatı=7.42;


        int portakalKg=1;
        int elmaKG=2;
        int muzKg=3;
        int uzumKG=4;
        int cilekKg=5;

        double toplamPortakalFiyati=portakalFiyati*portakalKg;
        double toplamElmaFiyatı=elmaFiyatı*elmaKG;
        double toplamMuzFiyatı=muzFiyatı*muzKg;
        double toplamUZumFiyatı=uzumFiyatı*uzumKG;
        double toplamCilekFiyatı=cilekFiyatı*cilekKg;

        System.out.println("------------ Fiyat Listesi ***********");
        System.out.println();
        System.out.println(" Portakal : "+ toplamPortakalFiyati +" TL");
        System.out.println(" Muz : "+toplamMuzFiyatı+" TL");
        System.out.println(" Üzüm Fiyatı : "+toplamUZumFiyatı+ " TL");
        System.out.println("Elma Fiyatı: "+toplamElmaFiyatı+" TL");
        System.out.println(" Çilek Fiyatı : "+toplamCilekFiyatı+" TL");


*/

        Scanner input = new Scanner(System.in);

        /*System.out.println("Lütfen Şifrreyi giriniz:");
        String sifre=input.nextLine();

        if (sifre.equals("abcd")||sifre.equals("ABCD")){
            System.out.println("Girilen Şifre Doğrıdur.Sisteme Giriş yapılıryor.");
        }
        else {
            System.out.println("Girilen şifre veya kullanıcı adi hatalı.");

        }*/

       /* System.out.println("Başkenti giriniz: ");
        String baskent=input.nextLine();
        System.out.println("Ülke giriniz:");
        String ulke=input.nextLine();

        if (baskent.equals("Ankara") && ulke.equals("Türkiye")){
            System.out.println("Veriler doğrudur.");
        }else {
            System.out.println("Veriler yanlıştır");
        }

*/
/*

        System.out.println("Bir sayı giriniz: ");
        int sayi= input.nextInt();

        if(sayi==4){
            System.out.println("SAyı dpğru tahmin edildi.");
        }else {
            System.out.println("Sayı yanlış tahmin edildi.");
        }


*/

        /*System.out.println("1. Sınav notunu giriniz:");
        double sinav1= input.nextDouble();
        System.out.println("2. Sınav notunugiriniz");
        double sinav2= input.nextDouble();
        System.out.println("3. Sınab notunu giriniz:");
        double sinav3= input.nextDouble();

        double ortalama =(sinav1+sinav2+sinav3)/3;

        String sonuc="";

        if (ortalama>0 && ortalama<50){
            sonuc="Sonuc Rezalet";

        }
        if (ortalama>=50 && ortalama<70){
            sonuc="Sonuç ortalama";
        }
        if (ortalama>70 && ortalama<=84){
            sonuc="Sonuç İYi";
        }
        if (ortalama>84 ){
            sonuc="Sonuç mükkemmel";
        }

        System.out.println("Ortalama : "+ortalama+ "=====> "+ sonuc);


        System.out.println("Lütfen şehir giriniz");
        String sehir=input.nextLine();

        if (sehir.equals("Trabzon") || sehir.equals("Ordu") || sehir.equals("Giresun")){
            System.out.println("Sehir karadeniz bölgesindedir");
        }
        else {
            System.out.println("Girilen şehir karadenizde değildir.");
        }

        System.out.println("Takım sembolünü giriniz:");
        char TakimSembol= input.next().charAt(0);

        if (TakimSembol== 'g' || TakimSembol=='G'){
        System.out.println("Galatasaray");
        }
        if (TakimSembol== 'f' || TakimSembol=='F'){
            System.out.println("Fenerbahce");
        }
        if (TakimSembol== 'b' || TakimSembol=='B'){
            System.out.println("Besiktaş");
        }*/

     /*   System.out.println("11-a Eğtim Restoranı");
        System.out.println("-------------------");

    System.out.println("1 - Ana yemek");
    System.out.println("2 - Çorbalar");
    System.out.println("3 - Pizzalar");
    System.out.println("4 - İçecekler");
    System.out.println("5 - Tatlılar");

        System.out.println("-------------------");

        input.nextLine();

        System.out.println("Menü numarası seçiniz");
        String menuSecim=input.nextLine();

        if (menuSecim.equals("1")){
           System.out.println("Köri Soslu tavuk, Tavuk pilav, Fasulye pilav");
        }
        else if (menuSecim.equals("2")){
            System.out.println("mervimek çorbası, kelle paça, işkembe, tarhana");
        }
        else if (menuSecim.equals("3")){
            System.out.println("Kuşbaşı Pizza, Ton balıklı pizza, karısık pizza ,pepperoni pizza");
        }
        else if (menuSecim.equals("4")){
            System.out.println("Kola,fanta,gazoz,çay,sprite");
        }
        else if (menuSecim.equals("5")){
            System.out.println("soğuk baklaca ,halka,kemalpaşa,baklava,künefe");
        }*/

/*
        System.out.println("Başkenti giriniz:");
        String baskent=input.nextLine();
        System.out.println("Ülke giriniz");
        String ulke = input.nextLine();

        if (baskent.equals("Ankara") && ulke.equals("Türkiye")){
            System.out.println("Veriler Doğru girildi");
        }else {
            System.out.println("Veriler Yanlış Girildi.");

        }
        */
       /* System.out.println("Bir sayı saçiniz");
        int sayi=input.nextInt();

        if (sayi==4){
            System.out.println("Tahminibiz doğru");
        }else{
            System.out.println("Tahmin yanlıştır.");
        }*/

      /*  System.out.println("1.sınav notunu giriniz");
        double sinav1=input.nextDouble();
        System.out.println("2.sınav notunu giriniz");
        double sinav2=input.nextDouble();

        System.out.println("3.sınav notunu giriniz");
        double sinav3=input.nextDouble();

        double ortalama= (sinav1+sinav2+sinav3)/3;

        String sonucMesaji="";

        if (ortalama>0 && ortalama<50){
            sonucMesaji="Sonuc Rezalet";
        }
        if (ortalama>50 && ortalama<70){
            sonucMesaji="Sonuc Ortalama";
        }
        if (ortalama>70 && ortalama<=84){
            sonucMesaji="Sonuç İyi";
        }
        if (ortalama>84){
            sonucMesaji="Sonuc Mükemmel";
        }

System.out.println("Ortalam = "+ ortalama + "==>  "+ sonucMesaji);
*/

/*


        System.out.println("Lütfen şehir giriniz:");
        String sehir=input.nextLine();

        if (sehir.equals("Trabzon") || sehir.equals("Ordu") || sehir.equals("Giresun")||sehir.equals("Samsun")){
            System.out.println("Girilen şehir karadeniz bolgesinde yer alır");
        }else{
            System.out.println("Girilen şehir karadenizde değilidr.");
        }
*/

        //%25 indirm örneği

      /*  System.out.println("1.ürün fiyatını girini");
        double urun1=input.nextDouble();
        System.out.println("2. ürün giyatını giriniz");
        double urun2=input.nextDouble();

        double toplam=urun1+urun2;
        double odenecekTutar=toplam;

        if (toplam>=200){
            double indirim =urun2*25/100;
            odenecekTutar -=indirim;
        }
        System.out.println("Ödenecek Tutar =  "+ odenecekTutar+ " TL");
*/

/*
        System.out.println("Yılın kaçıncı ayı: ");
        int kacinciAy= input.nextInt();


        switch (kacinciAy){
            case 1: System.out.println("Ocak"); break;
            case 2: System.out.println("Şubat");break;
            case 3: System.out.println("Mart");break;
            case 4: System.out.println("Nisan");break;
            case 5: System.out.println("Mayıs");break;
            case 6: System.out.println("Haziran");break;
            case 7: System.out.println("Temmuz");break;
            case 8: System.out.println("Ağustos");break;
            case 9: System.out.println("Eylül");break;
            case 10: System.out.println("Ekim");break;
            case 11: System.out.println("Kasım");break;
            case 12: System.out.println("Aralık");break;
            default: System.out.println("Hatalı Giriş");break;
        }*/


      /*  System.out.println("1. sayıyı giriniz:");
        int s1=input.nextInt();
        System.out.println("2.SAyıyı giriniz");
        int s2=input.nextInt();

        System.out.println("İşlem sembolünü seçiniz: (+ - * / %");
        char sembol= input.next().charAt(0);
        int sonuc2=0;

        switch (sembol){
            case '+' : sonuc2=s1+s2;break;
            case '-' : sonuc2=s1-s2;break;
            case '*' : sonuc2=s1*s2;break;
            case '/' : sonuc2=s1/s2;break;
            case '%' : sonuc2=s1%s2;break;
            default: System.out.println("Hatalı Operatör !");break;
        }
        System.out.println("Sonuc = "+ sonuc2);
*/

      /*  System.out.println("Akşam yemiği mi yoksa Kahvaltı mı?");
        String cevap=input.nextLine().toUpperCase(); // Yazılan cevabu büyük harflere çevirir  akşam yemeği ==> AKŞAM YEMEĞİ

        System.out.println("Kaç Kişi ?");
        int kisiSayisi=input.nextInt();

        String fiyat= "";



        switch (cevap) {
            case "AKŞAM YEMEĞİ":
                if(kisiSayisi==1){
                fiyat="100";
            } else if (kisiSayisi==2){
                fiyat="200";
            }break;

            case "KAHVALTI":
                if (kisiSayisi==1){
                    fiyat="180";
                } else if (kisiSayisi==2) {
                    fiyat="360";
                }break;

        }

        System.out.println("Ödenecek Tutar : "+ fiyat+ " TL");
*/

/*
        System.out.println("---------- ÜYELİK DOĞRULMAA SİSTEMİ ------------");

        System.out.println("Yaşınızı giriniz:");
        int yas=input.nextInt();
        System.out.println("Kimliğiniz var mı ? ( true/false)");
        boolean kimlikVar=input.nextBoolean();

        System.out.println("Üyelik Aktif mi? (true/false)");
        boolean uyelikAktif=input.nextBoolean();

        System.out.println("Ceza aldınız mı? (true/false)");
        boolean cezaVar=input.nextBoolean();

        System.out.println("\n ----- Sistem kontrolü başladı!!----");
        //AND (&&) ÖRNEĞİ -TÜM ŞARTLAR DOĞRU OLMALI

        if (yas>=18 && kimlikVar && uyelikAktif){
            System.out.println("Üyelik şartları sağlanıyor...");

        }else {
            System.out.println(("Üyelik için gerekli şartlar sağlanmıyor"));
        }

        // OR (||) ÖRNEĞİ- TEK BİR ŞARTIN DPĞRU OLMASININ YETERLİ OLDUGU OPERATÖR

        if ((yas>=18 || uyelikAktif)){
            System.out.println("Sisteme sınırlı erişim sağlanabilir");

        }else {
            System.out.println("Sisteme hiçbir erişim verilemez.");
        }


        //NOT(!) örneği- Değeri tam tersine çevirdiğiniz operatör

        if (!cezaVar){
            System.out.println("Kullanıcının ceza kaydı yok");
        }else {
            System.out.println("Kullanıcın ceza kaydı var");
        }


        // KOMBİNE EDİLMŞ ÖRNEK ÇÖZÜMÜ ( ÖNCELİK SIRALAMASI)

        if ((yas>=18 && kimlikVar)||(!cezaVar&&uyelikAktif)){
            System.out.println("Tüm değerlendirmeler sonucunda kullanıcı onaylandı.");
        }else {
            System.out.println("Kullanıcı reddedildi.");
        }*/


        // for (x;y;z)
        // x= başlangıç
        //y = koşulu - bitişi
        // z= artış / azalış

        /*for (int i =1 ; i<=5;i++){
            System.out.println("11 B sınıfı");
        }

        for (int i=5; i>=1 ; i--){
            System.out.println("deneme 11 b");
        }

        for (int i =3; i<=51; i+=3){
            System.out.println(i);
        }*/

/*
        // 1den 100 e kadar sayıların arasından 5 e tam bölğnen sayıları veren kod

        for (int i=1; i<=100 ; i++){
            if (i%5==0){
                System.out.println(i);
            }
        }

        // 1 den 20 ye kadar olan ardışık sayıların toplamını veren kod

        int toplam=0;
        for (int i=1;i<=20;i++){
            toplam = toplam + i ;
        }
        System.out.println(toplam);

        */

     /*   int i =1 ;

        while (i<=10){
            System.out.println("11-a Sınıfı ");
            i++;
        }

        //1den 10 a kadar sayıların arasından 3 e tam bölünen sayıları yadıran  porgram

        int sayac = 10;

        while(sayac>=1){
            if(sayac%3==0){
                System.out.println(sayac);

            }
            sayac--;
        }


        //ardısık sayı toplamı

        int sayac2=1;

        int toplam2=0;

        while(sayac2<=10){
            toplam2=toplam2+sayac2;
            sayac2++;
        }
        System.out.println(toplam2);
*/

        //kullanıcı 0 girene kadar toplama işlemi yapan program
/*
        int sayi;

        int toplam=0;

        System.out.println("Sayı girin ve bitirmek için 0 yazın");

        sayi= input.nextInt();

        while (sayi !=0){
            toplam=toplam+sayi;
            sayi= input.nextInt();
        }
        System.out.println("Toplama işlemi sonlandı : "+toplam);
    }*/


        // Faktöriyel Hesabı while döngüsü

        /*int n =5;

        int sonuc=1;


        while(n>0){
            sonuc=sonuc*n;
            n--;
        }
        System.out.println("Faktmriyel hsabı: "+sonuc);

        */

        // 3 basamaklı sayının rakamaları toplamı

//        System.out.println("3 Basamaklı sayıyı giriniz.:");
//
//        int sayi = input.nextInt();
//
//        int birler = sayi % 10;
//
//        int onlar = (sayi % 100) / 10;
//
//        int yuzler = sayi / 100;
//
//        int toplam = birler + onlar + yuzler;
//
//        System.out.println(toplam);
//
//        // her saaatte bir artan bakteri üremesi hesabı
//
//        int bakteri = 1;
//
//        for (int i=1 ; i <=24 ; i++){
//            bakteri = bakteri *2;
//            int dakika= i*60;
//            System.out.println(i+ ".  Saat sonunda :" + bakteri);
//            System.out.println(dakika+ ".  Dakika sonunda :" + bakteri);

//        }


//        int sonuc= Topla(5,3);
//        System.out.println("Sonucç: "+ sonuc);

//        selamVer();
//        selamVer("Ahmet");

//        bilgiYaz("Aybar",18);

//System.out.println(Topla2(1,2,3,4));
//System.out.println(Topla2(1,2,3,4,5,6,7,8));

//        kontrol(-5);
//        kontrol(10);

//        System.out.println(MatematikselToplama(2,3));
//        System.out.println(MatematikselToplama(2,3,4));
//        System.out.println(MatematikselToplama(2.5,3.2));


//
//        Ogrenci ogr1=new Ogrenci("Kayra",16);
//        ogr1.bilgileriYaz();

        //Değer Tipler (Primitive Types)
//        int a=10;
//        int b = a;
//        b=20;
//        System.out.println(a);


        //Referans Tipler

//        int[] dizi1={1,2,3};
//        int[] dizi2=dizi1;
//
//        dizi2[0]=99;
//
//        System.out.println(dizi1[0]);

//        int sayi=10;
//        degistir(sayi);
//        System.out.println(sayi);
//
//Kisi kisi1=new Kisi();
//kisi1.yas=20;
//
//degistir(kisi1);
//
//System.out.println(kisi1.yas);

//        Ogrenci2 murat= new Ogrenci2();
//        murat.konus();

//        Daire d =new Daire();
//        Kare k =new Kare();
//
//        d.ciz();
//        k.ciz();
//
//
//        Kedi k= new Kedi();
//        k.sesCikar();
//
//        Hayvan h=new Kopek();
//        h.sesCikar();

//        Arac a1=new Araba2();
//        Arac a2=new Motosiklet();
//
//        a1.calistir();
//        a2.calistir();

//        int sonuc= Matematik.topla(5,2);
//        System.out.println(sonuc);
//
//        int sonuc2=HesapMakinesi.kareAl(12);
//        System.out.println(sonuc2);

//
//        String[] isimler= {"Kayra","Ali","Ayşe","Mehmet"};
//
//        //foreach dongüsü mantıgı ile eleman yazdırma
//        for (String isim : isimler){
//            System.out.println(isim);
//        }
//
//        Arrays.sort(isimler);
//        System.out.println(Arrays.toString(isimler));
//        int [] sayilar = {40,10,30,20};
//
//        Arrays.sort(sayilar);
//
//        System.out.println(Arrays.toString(sayilar));

//        int [][] matris = {
//                {1,2,3,4},
//                {4,5,6,4}
//        };
//
//        for( int i=0; i<matris.length; i++){
//            for (int j=0;j<matris[i].length;j++){
//                System.out.println(matris[i][j]+ " ");
//            }
//            System.out.println();
//        }

//        int [][] matris2 = {
//                {12,22,33,43},
//                {42,522,62,41}
//        };
//
//        int toplam=0;
//        for( int i=0; i<matris2.length; i++){
//            for (int j=0;j<matris2[i].length;j++){
//                toplam += matris2[i][j];
//            }
//
//        }
//        System.out.println("Toplam:  "+ toplam);


        //boxing - unboxing örbeği

//        int sayi =10;
//
//        //boxing
//
//        Integer nesne=sayi;
//
//        // unboxing
//        int tekrar= nesne;
//
//        System.out.println(("İlkel; "+sayi));
//        System.out.println("Nene:  "+nesne);
//        System.out.println("Tekrar İlkek:  "+ tekrar);


//        ArrayList <Integer> sayiler = new ArrayList<>();
//
//        sayiler.add(10);
//        sayiler.add(20);
//        sayiler.add(30);
//
//        System.out.println("Eleman sayisi: "+sayiler.size());
//        System.out.println("İlk Elemanı: "+sayiler.get(0));

//        ArrayList <String> isimler = new ArrayList<>();
//        isimler.add("Ali");
//        isimler.add("Ayşe");
//        isimler.add("Mehmet");
//
//        for (String isim:isimler){
//            System.out.println(isim);
//        }
//
//        ArrayList<String>meyveler=new ArrayList<>();
//
//        meyveler.add("Elma");
//        meyveler.add("Armut");
//        meyveler.add("Muz");
//
//        //Güncelleme
//
//        meyveler.set(1,"Portakal");
//
//        //silme
//        meyveler.remove(0);
//
//        System.out.println(meyveler);

//        List<Integer> sayilar2=new ArrayList<>();
//
//        sayilar2.add(5);
//        sayilar2.add(10);
//        sayilar2.add(25);
//
//        for (int s : sayilar2){
//            System.out.println(s);
//        }


        //öğrenci notları hesabı

//        List<Integer> notlar = new ArrayList<>();
//
//        notlar.add(70);
//        notlar.add(64);
//        notlar.add(90);
//        notlar.add(60);
//
//        int toplam=0;
//
//        System.out.println("Notlar:  ");
//
//
//        for (int n : notlar){
//            System.out.println(n);
//            toplam +=n;
//        }
//
//        double  ortalama= (double) toplam/notlar.size();
//
//        System.out.println("Ortalama: "+ortalama);
//
//
//        if (ortalama>=70){
//            System.out.println("Geçti");
//        }else {
//            System.out.println("Kaldı");
//        }

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

        Stack<Integer> yigin =new Stack<>();

        yigin.push(10);
        yigin.push(20);
        yigin.push(30);

        System.out.println("Çıkan eleman: "+ yigin.pop());
        System.out.println("Üstteki eleman "+ yigin.peek());


        Map<String,Integer> notlar=new HashMap<>();

        notlar.put("Ali",60);
        notlar.put("Ayse",50);
        notlar.put("Alihan",70);


        System.out.println("Alinin notu = "+ notlar.get("Ali"));

        Hashtable<Integer,String> tablo= new Hashtable<>();

        tablo.put(1,"Elma");
        tablo.put(2,"Armut");

        System.out.println("1 numaralı elaman  "+tablo.get(1));


        TreeMap<Integer,String> liste=new TreeMap<>();

        liste.put(3,"C");
        liste.put(1,"A");
        liste.put(2,"B");

        System.out.println(liste);


        //queue yapısı müşteri sırası
        Queue <String> musteriSirasi= new LinkedList<>();
        musteriSirasi.add("Ali");
        musteriSirasi.add("Ayşe");
        musteriSirasi.add("Mehmet");

        //Stack işlem geçmisi

        Stack<String> gecmis = new Stack<>();

        // Map = müşteri bakiyesi
        Map<String,Integer> bakiye=new HashMap<>();
        bakiye.put("ALi",100);
        bakiye.put("Ayşe",200);
        bakiye.put("Mehmet",150);

        // ilem başlat
        String siradaki=musteriSirasi.poll();
        System.out.println("işlem yapılan müşteri : "+siradaki);

        //bakiye görüntüleme
        System.out.println("Bakiye "+ bakiye.get(siradaki));

        //geçmişe ekle
        gecmis.push(siradaki);

        //son işlem kimdi
        System.out.println("So işlem yapan: "+ gecmis.peek());
    }
}