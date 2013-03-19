public class Memur extends Kisi{
private long sicilNo;
private String bolum;
public long getSicilNo() {
return sicilNo;
}
public void setSicilNo(long sicilNo) {
this.sicilNo = sicilNo;
}
public String getBolum() {
return bolum;
}
public void setBolum(String bolum) {
this.bolum = bolum;
}
public Memur(long tC, String ad, String soyad, String dogTarih,
long sicilNo, String bolum) {
super(tC, ad, soyad, dogTarih);
this.sicilNo = sicilNo;
this.bolum = bolum;
}

public void evrakGotur(){
System.out.println("Evrak Götürüyorum..");
}

public void evrakGetir(){
System.out.println("Evrak Getiriyorum.");
}
}