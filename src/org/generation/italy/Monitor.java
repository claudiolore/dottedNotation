package org.generation.italy;

public class Monitor {

	private int pollici;
	private String colore;
	private boolean stato;
	
	public Monitor(int pollici, String colore) {
		super();
		this.pollici = pollici;
		this.colore = colore;
		stato=false;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

	void accendi() {
		stato=true;
	}
	
	void spegni() {
		stato=true;
	}
	
}
