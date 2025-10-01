package pekan4;
import java.util.Scanner;
public class NamaBulan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka bulan (1 - 12): ");
		int bulan = scanner.nextInt();
		switch (bulan) {
		case 1:
			System.out.println("Januari");
			break;
		case 2:
			System.out.println("Februari");
		case 3:
			System.out.println("Maret");
		case 4:
			System.out.println("April");
		case 5:
			System.out.println("Mei");
		case 6:
			System.out.println("Juni");
		case 7:
			System.out.println("Juli");
		case 8:
			System.out.println("Agustus");
		case 9:
			System.out.println("September");
		case 10:
			System.out.println("Oktober");
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("Desember");
			break;
		default:
			System.out.println("Angka tidak valid");
	}
		scanner.close();
		
	}

}
