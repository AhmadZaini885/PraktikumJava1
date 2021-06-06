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

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usia : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 = new Mahasiswa("19610511", "amat", "08-08-2000");
        mahasiswa2.tampilkanAtribut();

    }
}
