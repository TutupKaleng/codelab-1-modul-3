public class BangunRuang {
    private String name;

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("Menginput nilai untuk bangun " + name);
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun "+ name);
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
