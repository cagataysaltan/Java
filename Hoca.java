public class Hoca extends Kisi {
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
public Hoca(long tC, String ad, String soyad, String dogTarih,
long sicilNo, String bolum) {
super(tC, ad, soyad, dogTarih);
this.sicilNo = sicilNo;
this.bolum = bolum;
}
public void derseGit(){
System.out.println("Selam �ocuklar.");
}

public void s�navYap() {
System.out.println("S�nav ba�lad�.");
}

}