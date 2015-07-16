public class Radio implements InterfazRadio{
	String frecuencia; //1 es AM, 0 es FM
	double emisora;
	double[] EmiAM = {MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM};
	double[] EmiFM = {MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM};
	int Volumen;
	boolean Encendido;
	
	public Radio(){
			Encendido = false;
			emisora = MIN_AM;
			frecuencia = "AM";
			Volumen=50;
			
	}
	
	public void encenderApagar(){
		if(Encendido){
			Encendido = false;
		}else{
			Encendido= true;
		}
	}
	
	public void cambiarFrec(){
	
		if (frecuencia.equals("AM")){
			frecuencia= "FM";
			emisora= MIN_FM;
		}else{
			frecuencia="AM";
			emisora=MIN_AM;
		}
	
	}

	public void adelantarEmisora(){
		//Cambio de emisora AM
		if (frecuencia.equals("AM")){
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
		if (frecuencia.equals("AM")){
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
		if (frecuencia.equals("AM")){
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

	@Override
	public void cargarEmisora(int posicion) {
		if(frecuencia.equals("AM")){
			emisora= EmiAM[posicion];
		}else{
			emisora= EmiFM[posicion];
		}
			
	}

	@Override
	public double getEmisora() {
		return emisora;
	}

	@Override
	public boolean getEncendido() {
		return Encendido;
	}


	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return Volumen;
	}

	@Override
	public String getFrec() {
		return frecuencia;
	}


}
