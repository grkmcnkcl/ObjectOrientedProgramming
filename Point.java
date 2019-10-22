import java.util.Scanner;
import java.lang.*;

public class Point{
	public int x1, y1, x2, y2, x3, y3, x4, y4;
	
	Point(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		
	}
	
	public static void main(String []args) {
	  System.out.print("Kare/Dikdortgen/Yamuk/Paralelkenar ??"); 
	  String sekil;
	  Scanner sc = new Scanner(System.in);
	  sekil = sc.nextLine();
      switch (sekil) {
	  case "Kare":
		Kare kareTest = new Kare();
		kareTest.alan(kareTest.nokta);
		break;
	  case "Dikdortgen":
		Dikdortgen dikdortgenTest = new Dikdortgen();
		dikdortgenTest.alan(dikdortgenTest.nokta);
		break;
	  case "Yamuk":
		Yamuk yamukTest = new Yamuk();
		break;
	  case "Paralelkenar":
		Paralelkenar paralelkenarTest = new Paralelkenar();
		break;
	   }
	}
}

class Dortgen{
	public int[] koordinat = new int[8];
	public Point nokta;
	Dortgen(){
		
		System.out.print("Koordinatlari giriniz: ");
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 8; ++i) {
			koordinat[i] = input.nextInt();
		}
		
		Point nokta1 = new Point(koordinat[0], koordinat[1], koordinat[2], koordinat[3], koordinat[4], koordinat[5], koordinat[6], koordinat[7]);
		this.nokta = nokta1;
		
	}
	
	
	public void alan(Point n){
		System.out.println((((n.x2-n.x1) + (n.x4-n.x3)) / 2) * (n.y3-n.y1));
	}
}

class Kare extends Dortgen{
}

class Dikdortgen extends Dortgen{
	
}

class Yamuk extends Dortgen{
	
}

class Paralelkenar extends Dortgen{
	
}
