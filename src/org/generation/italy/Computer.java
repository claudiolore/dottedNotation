package org.generation.italy;

public class Computer {

	private String marca, modello, cpu;
	private int prezzo, ram;
	private boolean stato=false;
	private Monitor monitor;
	
	public Computer(String marca, String modello, String cpu, int prezzo, int ram, Monitor monitor) {
		this.marca = marca;
		this.modello = modello;
		this.cpu = cpu;
		this.prezzo = prezzo;
		this.ram = ram;
		this.monitor = monitor;
	}

	void accendi() {
		stato=true;
		System.out.println("ho acceso il computer");
		monitor.setStato(true);
		System.out.println("ha acceso il monitor di "+ monitor.getPollici() +" pollici");
	}
	
	void spegni() {
		monitor.setStato(false);
		stato=false;
		System.out.println("ha spento il monitor di "+ monitor.getPollici() +" pollici");
	}


	public String getMarca() {			//getter
		return marca;
	}

	public void setMarca(String marca) {		//setter
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		if(prezzo>0)
			this.prezzo = prezzo;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}


}
