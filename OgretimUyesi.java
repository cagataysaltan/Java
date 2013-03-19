public class OgretimUyesi extends Hoca{
private String unvan;

public String getUnvan() {
return unvan;
}

public void setUnvan(String unvan) {
this.unvan = unvan;
}

public OgretimUyesi(long tC, String ad, String soyad, String dogTarih,
long sicilNo, String bolum, String unvan) {
super(tC, ad, soyad, dogTarih, sicilNo, bolum);
this.unvan = unvan;
}

}