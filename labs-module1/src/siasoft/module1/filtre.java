package siasoft.module1;

public class filtre extends automobile {
	private String gas;
	public filtre() { 
		super();
		this.gas="aucun ";
	}
	public filtre(String cons,String color,int comp,String fair,String fgasoil,String fhuile ) {
		super(cons, color, comp);
		this.gas=fgasoil;
		System.out.println(cons+" filtre a air :"+fair+" , filtre a huile : "+fhuile);
		
	}
	public String affiche() {
		String str =super.toString()+ "-- filtre a gasoil:"+this.gas+".";
			return str;
	}
	public String affiche(String b) {
		String str = "merci "+b+" pour le filtre :"+this.gas;
		return str;
	}
	

}
