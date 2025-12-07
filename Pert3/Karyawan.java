package Responsi2PBO.Pert3;

public class Karyawan {
    protected String nama;
    protected double gajiPokok;

    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}
