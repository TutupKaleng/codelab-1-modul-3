import java.util.Scanner;
import java.text.DecimalFormat;

public class Tabung extends BangunRuang {
    private Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    Tabung(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        super.inputNilai(); // Menyesuaikan dengan kelas induk
        System.out.print("Masukkan tinggi " + getName() + " (cm): ");
        tinggi = scanner.nextDouble();
        System.out.print("Masukkan jari-jari " + getName() + " (cm): ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        DecimalFormat df = new DecimalFormat("#.##");
        String hasilFormatted = df.format(hasil);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan " + getName() + " (cm^2): " + hasilFormatted);
    }

    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        DecimalFormat df = new DecimalFormat("#.##");
        String hasilFormatted = df.format(hasil);
        super.volume();
        System.out.println("Hasil volume " + getName() + " (cm^3): " + hasilFormatted);
    }
}
