package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "16630511";
        mahasiswa.nama = "Ahmad Zaini";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("07-03-2001");

        System.out.println("Nama  \t\t\t : " + mahasiswa.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " + mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19630001";
        mahasiswa2.nama = "Galung";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("05-02-2000");

        System.out.println("Nama  \t\t\t : " + mahasiswa2.nama);
        System.out.println("NPM \t\t\t : " + mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
    }
}
