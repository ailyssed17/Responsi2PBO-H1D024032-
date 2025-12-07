package Responsi2PBO.Pert5;

import java.util.Arrays;

class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] mesin = new defaultMesin[5];

        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        for (defaultMesin m : mesin) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        System.out.println("=== SUARA MESIN ===");
        for (defaultMesin m : mesin) {
            if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            } else if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin terbaik = mesin[0];
        for (defaultMesin m : mesin) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());


        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        Arrays.sort(mesin, (a, b) -> Double.compare(b.nilaiPerforma(), a.nilaiPerforma()));

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + mesin[i].namaMesin + " → " + mesin[i].nilaiPerforma());
        }
    }
}