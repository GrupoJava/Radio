public class Radio implements InterfazRadio{
	int frecuencia; //1 es AM, 0 es FM
	double emisora;
	double[] EmiAM = new double[12];
	double[] EmiFM = new double[12];
	int Volumen;
	boolean Encendido;
	
	public Radio(){
			Encendido = false;
			emisora = MIN_AM;
			frecuencia = 1;
	}
	
	public void encenderApagar(){
		if(Encendido){
			Encendido = false;
		}else{
			Encendido= true;
		}
	}
	
	public void cambiarFrec(){
	
		if (frecuencia != 0){
			frecuencia= 0;
			emisora= MIN_FM;
		}else{
			frecuencia=1;
			emisora=MIN_AM;
		}
	
	}
	
	public void cargarEmisora(double emisora){
		
	}

	public void adelantarEmisora(){
		//Cambio de emisora AM
		if (frecuencia == 1){
			if (emisora == MAX_AM)
				emisora = MIN_AM;
			else
				emisora = emisora + CONST_CAMBIO_AM; 
		}
		//Cambio de emisora FM
		else{
			if (emisora == MAX_FM)
				emisora = MIN_FM;
			else
				emisora = emisora +CONST_CAMBIO_FM; 
		}
			
	}
	
	public void atrasarEmisora(){
		if (frecuencia == 1){
			if (emisora == MIN_AM)
				emisora = MAX_AM;
			else
				emisora = emisora - CONST_CAMBIO_AM; 
		}
		//Cambio de emisora FM
		else{
			if (emisora == MIN_FM)
				emisora = MAX_FM;
			else
				emisora = emisora - CONST_CAMBIO_FM;
		}
	}
	
	public void guardarEmisora(double emisora, int posicion){
		if (frecuencia == 1){
			EmiAM[posicion] = emisora;
		}
		else
			EmiFM[posicion] = emisora;
	}
	
	public void subirVolumen(){
		Volumen = Volumen + 1;
	}
	
	public void bajarVolumen(){
		Volumen = Volumen - 1;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public double getEmisora() {
		return emisora;
	}

	public void setEmisora(double emisora) {
		this.emisora = emisora;
	}

	public double[] getEmiAM() {
		return EmiAM;
	}

	public void setEmiAM(double[] emiAM) {
		EmiAM = emiAM;
	}

	public double[] getEmiFM() {
		return EmiFM;
	}

	public void setEmiFM(double[] emiFM) {
		EmiFM = emiFM;
	}

	public int getVolumen() {
		return Volumen;
	}

	public void setVolumen(int volumen) {
		Volumen = volumen;
	}

	public boolean isEncendido() {
		return Encendido;
	}

	public void setEncendido(boolean encendido) {
		Encendido = encendido;
	}
	
}
