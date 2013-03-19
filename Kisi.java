
	public class Kisi {
		private long TC;
		private String ad;
		private String soyad;
		private String dogTarih;


		public Kisi(long tC, String ad, String soyad, String dogTarih) {
		super();
		TC = tC;
		this.ad = ad;
		this.soyad = soyad;
		this.dogTarih = dogTarih;
		}

		public long getTC() {
		return TC;
		}

		public void setTC(long tC) {
		TC = tC;
		}

		public String getAd() {
		return ad;
		}

		public void setAd(String ad) {
		this.ad = ad;
		}

		public String getSoyad() {
		return soyad;
		}

		public void setSoyad(String soyad) {
		this.soyad = soyad;
		}

		public String getDogTarih() {
		return dogTarih;
		}

		public void setDogTarih(String dogTarih) {
		this.dogTarih = dogTarih;
		}

		public void uyur() {
		System.out.println("Hýrrr... Hýrrr..");
		}

		public void gezer() {
		System.out.println("Yürümeyi seviyorum :)");
		}
		}
