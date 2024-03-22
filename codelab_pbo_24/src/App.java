public class App {
    public static void main(String[] args) {
        BangunRuang tabung = new Tabung("Tabung");
        BangunRuang kubus = new Kubus("Kubus");
        BangunRuang balok = new Balok("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
        System.out.println("\n");

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();
        System.out.println("\n");

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}
