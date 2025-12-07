package Responsi2PBO.Pert3;

public class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok); // memanggil constructor parent
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama
                + " | Gaji Pokok: Rp " + gajiPokok
                + " | Tunjangan: Rp " + tunjangan);
        double total = gajiPokok + tunjangan;
        System.out.println("Total Pendapatan: Rp " + total);
    }
}
