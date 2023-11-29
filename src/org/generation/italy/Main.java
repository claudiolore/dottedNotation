package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		
		Computer c=new Computer("asus", "predator", "I7", 16, 700, new Monitor(17,"nero"));
	
		 c.setPrezzo(500);
		
		Negozio negozio=new Negozio();
		
		negozio.nome="PC futura 2000";
		negozio.indirizzo="Via verdi 27";
		negozio.elencoComputer.get(0).setMarca("acer");
		negozio.elencoComputer.get(0).getMonitor().setColore("rosso");

	}
}
