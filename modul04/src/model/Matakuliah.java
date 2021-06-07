package model;

public class Matakuliah {
    int idMatakuliah;
    String namaMatakuliah;
    String singkatanMatakuliah;
    String namaDosen;
    String kontakDosen;
    Boolean aktif;

    public Matakuliah(int idMatakuliah, String namaMatakuliah, String singkatanMatakuliah, String namaDosen, String kontakDosen, Boolean aktif) {
        this.idMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.singkatanMatakuliah = singkatanMatakuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    public int getIdMatakuliah() {
        return idMatakuliah;
    }

    public void setIdMatakuliah(int idMatakuliah) {
        this.idMatakuliah = idMatakuliah;
    }

    public String getNamaMatakuliah() {
        return namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public String getSingkatanMatakuliah() {
        return singkatanMatakuliah;
    }

    public void setSingkatanMatakuliah(String singkatanMatakuliah) {
        this.singkatanMatakuliah = singkatanMatakuliah;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getKontakDosen() {
        return kontakDosen;
    }

    public void setKontakDosen(String kontakDosen) {
        this.kontakDosen = kontakDosen;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }
}
