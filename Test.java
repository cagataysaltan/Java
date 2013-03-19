public class Test {

public static void main(String[] args) {

Kisi K1 = new Kisi(65413135163L, "�a�atay", "Saltan", "16 Nisan 1991");

System.out.println("***Kisi S�n�f�n�n De�i�kenleri***\n");
System.out.println("TC: " + K1.getTC());
System.out.println("Ad�: " + K1.getAd());
System.out.println("Soyad�: " + K1.getSoyad());
System.out.println("Do�um Tar: " + K1.getDogTarih());

System.out.println("\n*Fonksiyonlar�*\n");
K1.gezer();
K1.uyur();

Ogrenci O1 = new Ogrenci(45648641315L, "�a�atay", "Saltan", "1991", 1213, "Bil M�h", "3. s�n�f", "�orum");

System.out.println("\n***Ogrenci S�n�f�n�n De�i�kenleri***\n");
System.out.println("TC: " + O1.getTC());
System.out.println("Ad�: " + O1.getAd());
System.out.println("Soyad�: " + O1.getSoyad());
System.out.println("Do�um Tar: " + O1.getDogTarih());
System.out.println("��renci no: " + O1.getOgrenciNo());
System.out.println("B�l�m ad�: " + O1.getBolumAd());
System.out.println("S�n�f�: " + O1.getS�n�fBilgi());
System.out.println("Memleketi: " + O1.getMemleket());

System.out.println("\n*Fonksiyonlar�*\n");
O1.derseGit();
O1.gezer();
O1.kantineGit();

Hoca H1 = new Hoca(45648641315L, "�a�atay", "Saltan", "1991", 123456789, "Bil M�h");

System.out.println("\n***Hoca S�n�f�n�n De�i�kenleri***\n");
System.out.println("TC: " + H1.getTC());
System.out.println("Ad�: " + H1.getAd());
System.out.println("Soyad�: " + H1.getSoyad());
System.out.println("Do�um Tar: " + H1.getDogTarih());
System.out.println("Sicil no: " + H1.getSicilNo());
System.out.println("B�l�m� " + H1.getBolum());

System.out.println("\n*Fonksiyonlar�*\n");
H1.derseGit();
H1.gezer();
H1.s�navYap();

OgretimUyesi Ou = new OgretimUyesi(123456789L, "Mehmet", "Karacan", "1968", 445643743L, "Bilgisayar", "Yar.Doc.");

System.out.println("\n***OgretimUyesi S�n�f�n�n De�i�kenleri***\n");
System.out.println("TC: " + Ou.getTC());
System.out.println("Ad�: " + Ou.getAd());
System.out.println("Soyad�: " + Ou.getSoyad());
System.out.println("Do�um Tar: " + Ou.getDogTarih());
System.out.println("Sicil no: " + Ou.getSicilNo());
System.out.println("B�l�m� " + Ou.getBolum());
System.out.println("�nvan�: " + Ou.getUnvan());

Memur M = new Memur(1236547896L, "Ahmet", "Saat", "1988", 457654452, "��renci i�leri");

System.out.println("\n***Memur S�n�f�n�n De�i�kenleri***\n");
System.out.println("TC: " + M.getTC());
System.out.println("Ad�: " + M.getAd());
System.out.println("Soyad�: " + M.getSoyad());
System.out.println("Do�um Tar: " + M.getDogTarih());
System.out.println("Sicil no: " + M.getSicilNo());
System.out.println("B�l�m� " + M.getBolum());

System.out.println("\n*Fonksiyonlar�*\n");
M.evrakGetir();
M.evrakGotur();

}

}