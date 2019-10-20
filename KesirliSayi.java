public class KesirliSayi{
	
	private int pay, payda;
	
	KesirliSayi(int a, int b){
		
		pay = a;
		payda = b;

		int obeb = obeb(pay, payda);
		pay = pay / obeb;
		payda = payda / obeb;
		
		
	}
	
	/*public void atama(int a, int b){
		this.pay = a;
		this.payda = b;
	}*/
	
	public int getPay(){
		return pay;
	}
	public int getPayda(){
		return payda;
	}
	
	public int obeb(int sayi1, int sayi2){
		if(sayi2 == 0)
			return sayi1;
		else{
			return obeb(sayi2, (sayi1 % sayi2));
		}
	}
	
	public static void toplama(KesirliSayi kesirliSayi1, KesirliSayi kesirliSayi2){
		
		KesirliSayi geciciSayi1 = new KesirliSayi((kesirliSayi1.getPay() * kesirliSayi2.getPayda()), (kesirliSayi1.getPayda() * kesirliSayi2.getPayda()));
		KesirliSayi geciciSayi2 = new KesirliSayi((kesirliSayi2.getPay() * kesirliSayi1.getPayda()), (kesirliSayi2.getPayda() * kesirliSayi1.getPayda()));
		
		KesirliSayi toplam = new KesirliSayi((geciciSayi1.getPay() + geciciSayi2.getPay()), geciciSayi1.getPayda());
		System.out.println(toplam.getPay() + "/" + toplam.getPayda());
		
		
	}
	
	public static void carpma(KesirliSayi kesirliSayi1, KesirliSayi kesirliSayi2){
		KesirliSayi carpim = new KesirliSayi((kesirliSayi1.getPay() * kesirliSayi2.getPay()), (kesirliSayi1.getPayda() * kesirliSayi2.getPayda()));
		System.out.println(carpim.getPay() + "/" + carpim.getPayda());
	}
	
	public static void main(String []args){
		KesirliSayi sayi1 = new KesirliSayi(3, 6);
		KesirliSayi sayi2 = new KesirliSayi(4, 8);
		
		//System.out.println(sayi1.getPay());
		
		toplama(sayi1, sayi2);
		carpma(sayi1, sayi2);
		
	}
}