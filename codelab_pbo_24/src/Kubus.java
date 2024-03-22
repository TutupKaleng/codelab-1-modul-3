import java.util.Scanner;

public class Kubus extends BangunRuang {
    private Scanner scanner = new Scanner(System.in);
    private double sisi; // Mengganti nama variabel tinggi menjadi sisi sesuai dengan kubus

    Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Masukkan panjang sisi " + getName() + " (cm): ");
        sisi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan " + getName() + " (cm^2): " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume " + getName() + " (cm^3): " + hasil);
    }
}
