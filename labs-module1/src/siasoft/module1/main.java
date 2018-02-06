package siasoft.module1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		automobile auto = new automobile("wolswaguen", "rouge", 320);
		auto.toString();
		filtre f = new filtre(" voiture fiat","bleu",220,"ga620","m605","z213");
		/* surcharge*/
		System.out.println(f.affiche());
		System.out.println(f.affiche(" misfat"));
		
	}
	

}
