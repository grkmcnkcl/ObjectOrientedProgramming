
public class Hacim {
        double derinlik;
    double genislik;
    double yukseklik;
    Hacim(int a, int b, int c ) {
      derinlik = a;
      genislik = b;
      yukseklik = c;
   }
    
    Hacim(int a ) {
      derinlik = a;
      genislik = a;
      yukseklik = a;
   }
    
    Hacim(double a, double b, double c ) {
      derinlik = a;
      genislik = b;
      yukseklik = c;
   }
    
    
    public void hacimHesapla() 
    { 
        System.out.println("Hacim: " + (derinlik * genislik * yukseklik)); 
    } 
    
    public static void main(String args[]) {
      Hacim nesne1 = new Hacim( 10 );
      nesne1.hacimHesapla();
      Hacim nesne2 = new Hacim( 3, 5, 4 );
      nesne2.hacimHesapla();
      Hacim nesne3 = new Hacim( 1.2, 1.0, 1.8 );
      nesne3.hacimHesapla();
   }
}
