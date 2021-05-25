import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namaDepan = "Ahmad";
        String namaBelakang = " Zaini";
        int usia = 20;
        int tergetTahunKuliah = 4;
        double ipk = 3.999999;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println("Input Nama depan : " );
        namaDepan = scanner.nextLine();
		
        System.out.println("Input Usia : ");
        usia = scanner.nextInt();
        System.out.println("Input IPK : ");
        ipk = scanner.nextDouble();
        System.out.println("Input Nilai Abjad : ");
        nilaiAbjad = scanner.next().charAt(0);
        System.out.println("Tampan ? : ");
        tampan = scanner.nextBoolean();

        System.out.println("=============OUTPUT===============");
        System.out.println("Nama depan : " + namaDepan);
		System.out.println("Nama Belakang : " + namaBelakang);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Terget Kuliah : " + tergetTahunKuliah + " Tahun");
        System.out.println("IPK : " + ipk );
        System.out.println("Nilai PBO : " + nilaiAbjad);
        System.out.println("Tampan : " + tampan);
		
		
        JOptionPane.showConfirmDialog(null,"hai " + namaDepan + namaBelakang) ;
		
    }
}