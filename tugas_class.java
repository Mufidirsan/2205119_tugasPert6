package tugas.pkgclass;
public class tugas_class {
    
public static void main(String[] args) {
        segitiga segitiga1 = new segitiga();
        System.out.println("Segitiga 1:");
        System.out.println("Luas = " + segitiga1.getLuas());
        System.out.println("Keliling = " + segitiga1.getKeliling());

        segitiga segitiga2 = new segitiga();
        segitiga2.setAlas(30);
        segitiga2.setTinggi(10);
        segitiga2.setSisi(90);
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas = " + segitiga2.getLuas());
        System.out.println("Keliling = " + segitiga2.getKeliling());

        segitiga segitiga3 = new segitiga();
        segitiga3.setAlas(20);
        segitiga3.setTinggi(30);
        segitiga3.setSisi(60);
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas = " + segitiga3.getLuas());
        System.out.println("Keliling = " + segitiga3.getKeliling());
    }
}
