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

int a =10;
int b=a;

b=20;

System.out.println(a); //10


    int[]dizi1={1,2,3};
    int[]dizi2=dizi1;
    dizi2[0]=99;

    System.out.println(dizi1[0]); //99






}