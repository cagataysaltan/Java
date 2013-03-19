import java.util.Scanner;

public class Sayilar {
private int liste[] = new int[10];
private int buyuk;
private int kucuk;
private int ortalama;
private int toplam;
private int hold;

public void sayiAl(){
for(int i=0; i<10; i++){
Scanner input = new Scanner(System.in);
System.out.println("sayý giriniz:");
int sayi = input.nextInt();
liste[i] = sayi;
}
}

public void enBuyuk(){
buyuk = liste[0];
for(int i=0; i<10; i++){
if (buyuk < liste[i]){
buyuk = liste[i];
}
}
System.out.println("Listenin en büyük elemaný:" + buyuk);
}

public void enKucuk(){
kucuk = liste[0];
for(int i=0; i<10; i++){
if(liste[i] < kucuk){
kucuk = liste[i];
}
}
System.out.println("Listenin en küçük elemaný:" + kucuk);
}

public void ortalama(){
for(int i=0; i<10; i++){
toplam = toplam + liste[i];
}
ortalama = toplam / 10;
System.out.println("Sayýlarýn ortalamasý:" + ortalama);
}

public void buyuktenKucuge(){
for(int i=0; i<10; i++){
for(int j=0; j<9; j++){
if(liste[j] < liste[j+1]){
hold = liste[j];
liste[j] = liste[j+1];
liste[j+1] = hold;
}
}
}
System.out.println("büyükten küçüðe sýralama:");
for(int i=0;i<10;i++){
System.out.print(" " + liste[i]);
}
System.out.println("\n");
}

public void kucuktenBuyuge(){
for(int i=0; i<10; i++){
for(int j=0; j<9; j++){
if(liste[j] > liste[j+1]){
hold = liste[j];
liste[j] = liste[j+1];
liste[j+1] = hold;
}
}
}
System.out.println("küçükten büyüðe sýralama:");
for(int i=0;i<10;i++){
System.out.print(" " + liste[i]);
}
}
}