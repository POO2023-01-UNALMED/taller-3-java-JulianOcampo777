package taller3.televisores;

public class TV{
    Marca marca ;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
    static int numTV = 0;
    
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        TV.numTV += 1;
    }

    public Control getControl() {
    	return control;
    }
    
    public void setControl(Control control) {
    	this.control = control;
    	
    }

	public boolean getEstado(){
		return estado;
	}	

	public void setEstado(boolean estado){
		this.estado = estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if(estado && canal >= 1 && canal <=120) {
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(estado && volumen >= 0 && volumen <=7) {
			this.volumen = volumen;
		}
	}
	
	public static int getNumTV() {
		return numTV;
		
	}

	public static void setNumTV(int numTV){
		TV.numTV = numTV;
	}

     
	public void turnOn() {
		this.estado  = true;
		
	}
	
	public void turnOff() {
		this.estado  = false;
		
	}
	
	public void canalUp() {
		if(canal < 120 && estado == true) {		
			canal++;
		}
	}
	
	public void canalDown() {
		if(canal > 1 && estado == true) {		
			canal--;
		}
	}
	
	public void volumenUp() {
		if(volumen < 7 && estado == true) {		
			volumen++;
		}
	}
	
	public void volumenDown() {
		if(volumen > 0 && estado == true) {		
			volumen--;
		}
	}
}