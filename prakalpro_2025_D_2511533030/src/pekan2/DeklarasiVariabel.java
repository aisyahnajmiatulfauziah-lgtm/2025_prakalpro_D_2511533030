package pekan2;

public class DeklarasiVariabel {
	/* Program java
	 * latihan 
	 * tentang pendeklarasian variabel 
	 */
	static int umur=25;   /* variabel dapat langsung diinisasi */
	public static void main (String[] args)  {
		int kode;
		boolean isDibawahUmur;  /* perhatikan penulisan nama variabel */
		kode = 1234; /* pengisian variabel (assigment)*/
		double gaji; /* deklarasi variabel dapat dimana saja*/
		gaji = 5500000.23;
		isDibawahUmur = true;
		System.out.println("Status: "+isDibawahUmur);
		System.out.println("kode:"+kode);
		System.out.println("Umur:"+umur);
		System.out.println("Gaji:"+gaji);
		
	}

}
