public class Ogrenci extends Kisi {
private int ogrenciNo;
private String bolumAd;
private String s�n�fBilgi;
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
public String getS�n�fBilgi() {
return s�n�fBilgi;
}
public void setS�n�fBilgi(String s�n�fBilgi) {
this.s�n�fBilgi = s�n�fBilgi;
}
public String getMemleket() {
return memleket;
}
public void setMemleket(String memleket) {
this.memleket = memleket;
}
public Ogrenci(long tC, String ad, String soyad, String dogTarih,
int ogrenciNo, String bolumAd, String s�n�fBilgi, String memleket) {
super(tC, ad, soyad, dogTarih);
this.ogrenciNo = ogrenciNo;
this.bolumAd = bolumAd;
this.s�n�fBilgi = s�n�fBilgi;
this.memleket = memleket;
}

public void derseGit(){
System.out.println("Derse gidiyorum.");
}

public void kantineGit(){
System.out.println("Kantine gidiyorum.");
}
}