package taller3.televisores;

public class TV {
	public static int numTV=0;
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	
	public TV(Marca marca,boolean estado) {
		numTV++;
		canal=1;
		volumen=1;
		precio=500;
		this.marca=marca;
		this.estado=estado;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public void setVolumen(int volumen) {
		if ((volumen>=0)&&(volumen<=7)&&(estado==true)) {
			this.volumen=volumen;
		}
	}
	
	public void setCanal(int canal) {
		if ((canal>=1)&&(canal<=120)&&(estado==true)) {
			this.canal=canal;
		}
	}
	
	public static void setNumTV(int numero) {
		numTV=numero;
	}
	
	public void turnOn() {
		if (estado==false) {
			estado=true;
		}
	}
	
	public void turnOff() {
		if (estado==true) {
			estado=false;
		}
	}
	
	public void canalUp() {
		if ((canal>=1)&&(canal<120)&&(estado==true)) {
			canal++;
		}
	}
	
	public void canalDown() {
		if ((canal>1)&&(canal<=120)&&(estado==true)) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if ((volumen>=0)&&(volumen<7)&&(estado==true)) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if ((volumen>0)&&(volumen<=7)&&(estado==true)) {
			volumen--;
		}
	}
}
