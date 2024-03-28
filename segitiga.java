
package tugas.pkgclass;

public class segitiga {
    double alas;
    double tinggi;
    double sisi;   


public segitiga(){
    alas = 1;
    tinggi = 1;
    sisi = 1;
    }

public segitiga(double alasnew, double tingginew, double sisinew) {
     alas = alasnew;
     tinggi = tingginew;
     sisi = sisinew;
    }
   
public double getLuas() {
     return 0.5 * alas * tinggi;
    }

public double getKeliling() {
     return alas + tinggi + sisi;
    }

public void setAlas(double alasnew) {
     alas = alasnew;
    }

public void setTinggi(double tingginew) {
      tinggi = tingginew;
    }

public void setSisi(double sisinew) {
      sisi = sisinew;
   }
}

