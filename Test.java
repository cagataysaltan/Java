public class Test {

public static void main(String[] args) {

Kisi K1 = new Kisi(65413135163L, "Çaðatay", "Saltan", "16 Nisan 1991");

System.out.println("***Kisi Sýnýfýnýn Deðiþkenleri***\n");
System.out.println("TC: " + K1.getTC());
System.out.println("Adý: " + K1.getAd());
System.out.println("Soyadý: " + K1.getSoyad());
System.out.println("Doðum Tar: " + K1.getDogTarih());

System.out.println("\n*Fonksiyonlarý*\n");
K1.gezer();
K1.uyur();

Ogrenci O1 = new Ogrenci(45648641315L, "Çaðatay", "Saltan", "1991", 1213, "Bil Müh", "3. sýnýf", "Çorum");

System.out.println("\n***Ogrenci Sýnýfýnýn Deðiþkenleri***\n");
System.out.println("TC: " + O1.getTC());
System.out.println("Adý: " + O1.getAd());
System.out.println("Soyadý: " + O1.getSoyad());
System.out.println("Doðum Tar: " + O1.getDogTarih());
System.out.println("Öðrenci no: " + O1.getOgrenciNo());
System.out.println("Bölüm adý: " + O1.getBolumAd());
System.out.println("Sýnýfý: " + O1.getSýnýfBilgi());
System.out.println("Memleketi: " + O1.getMemleket());

System.out.println("\n*Fonksiyonlarý*\n");
O1.derseGit();
O1.gezer();
O1.kantineGit();

Hoca H1 = new Hoca(45648641315L, "Çaðatay", "Saltan", "1991", 123456789, "Bil Müh");

System.out.println("\n***Hoca Sýnýfýnýn Deðiþkenleri***\n");
System.out.println("TC: " + H1.getTC());
System.out.println("Adý: " + H1.getAd());
System.out.println("Soyadý: " + H1.getSoyad());
System.out.println("Doðum Tar: " + H1.getDogTarih());
System.out.println("Sicil no: " + H1.getSicilNo());
System.out.println("Bölümü " + H1.getBolum());

System.out.println("\n*Fonksiyonlarý*\n");
H1.derseGit();
H1.gezer();
H1.sýnavYap();

OgretimUyesi Ou = new OgretimUyesi(123456789L, "Mehmet", "Karacan", "1968", 445643743L, "Bilgisayar", "Yar.Doc.");

System.out.println("\n***OgretimUyesi Sýnýfýnýn Deðiþkenleri***\n");
System.out.println("TC: " + Ou.getTC());
System.out.println("Adý: " + Ou.getAd());
System.out.println("Soyadý: " + Ou.getSoyad());
System.out.println("Doðum Tar: " + Ou.getDogTarih());
System.out.println("Sicil no: " + Ou.getSicilNo());
System.out.println("Bölümü " + Ou.getBolum());
System.out.println("Ünvaný: " + Ou.getUnvan());

Memur M = new Memur(1236547896L, "Ahmet", "Saat", "1988", 457654452, "Öðrenci iþleri");

System.out.println("\n***Memur Sýnýfýnýn Deðiþkenleri***\n");
System.out.println("TC: " + M.getTC());
System.out.println("Adý: " + M.getAd());
System.out.println("Soyadý: " + M.getSoyad());
System.out.println("Doðum Tar: " + M.getDogTarih());
System.out.println("Sicil no: " + M.getSicilNo());
System.out.println("Bölümü " + M.getBolum());

System.out.println("\n*Fonksiyonlarý*\n");
M.evrakGetir();
M.evrakGotur();

}

}