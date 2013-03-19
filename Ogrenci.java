public class Ogrenci extends Kisi {
private int ogrenciNo;
private String bolumAd;
private String sýnýfBilgi;
private String memleket;

public int getOgrenciNo() {
return ogrenciNo;
}
public void setOgrenciNo(int ogrenciNo) {
this.ogrenciNo = ogrenciNo;
}
public String getBolumAd() {
return bolumAd;
}
public void setBolumAd(String bolumAd) {
this.bolumAd = bolumAd;
}
public String getSýnýfBilgi() {
return sýnýfBilgi;
}
public void setSýnýfBilgi(String sýnýfBilgi) {
this.sýnýfBilgi = sýnýfBilgi;
}
public String getMemleket() {
return memleket;
}
public void setMemleket(String memleket) {
this.memleket = memleket;
}
public Ogrenci(long tC, String ad, String soyad, String dogTarih,
int ogrenciNo, String bolumAd, String sýnýfBilgi, String memleket) {
super(tC, ad, soyad, dogTarih);
this.ogrenciNo = ogrenciNo;
this.bolumAd = bolumAd;
this.sýnýfBilgi = sýnýfBilgi;
this.memleket = memleket;
}

public void derseGit(){
System.out.println("Derse gidiyorum.");
}

public void kantineGit(){
System.out.println("Kantine gidiyorum.");
}
}