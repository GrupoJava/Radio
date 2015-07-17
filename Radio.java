/**
 * @author Rudy Garrido 14366, Yosemite Melendez 14, Delbert Custodio 14246
 * Esta clase es la encargada de implementar a la InterfazRadio que se acordo en clase
 */

//Seccion 10 de Estructura de Datos
public class Radio implements InterfazRadio{
	String frecuencia; //1 es AM, 0 es FM
	double emisora;
	double[] EmiAM = {MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM,MIN_AM};
	double[] EmiFM = {MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM,MIN_FM};
	int Volumen;
	boolean Encendido;
	

	/**
	 * 
	 */
	public Radio(){
			Encendido = false;
			emisora = MIN_AM;
			frecuencia = "AM";
			Volumen=50;
			
	}
	
	/* (non-Javadoc)
	 * @see InterfazRadio#encenderApagar()
	 */
	public void encenderApagar(){
		if(Encendido){
			Encendido = false;
		}else{
			Encendido= true;
		}
	}
	
	/* (non-Javadoc)
	 * @see InterfazRadio#cambiarFrec()
	 */
	public void cambiarFrec(){
	
		if (frecuencia.equals("AM")){
			frecuencia= "FM";
			emisora= MIN_FM;
		}else{
			frecuencia="AM";
			emisora=MIN_AM;
		}
	
	}

	/* (non-Javadoc)
	 * @see InterfazRadio#adelantarEmisora()
	 */
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
	
	/* (non-Javadoc)
	 * @see InterfazRadio#atrasarEmisora()
	 */
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
	
	/* (non-Javadoc)
	 * @see InterfazRadio#guardarEmisora(double, int)
	 */
	public void guardarEmisora(double emisora, int posicion){
		if (frecuencia.equals("AM")){
			EmiAM[posicion] = emisora;
		}
		else
			EmiFM[posicion] = emisora;
	}
	
	/* (non-Javadoc)
	 * @see InterfazRadio#subirVolumen()
	 */
	public void subirVolumen(){
		Volumen = Volumen + 1;
	}
	
	/* (non-Javadoc)
	 * @see InterfazRadio#bajarVolumen()
	 */
	public void bajarVolumen(){
		Volumen = Volumen - 1;
	}

	/* (non-Javadoc)
	 * @see InterfazRadio#cargarEmisora(int)
	 */
	@Override
	public void cargarEmisora(int posicion) {
		if(frecuencia.equals("AM")){
			emisora= EmiAM[posicion];
		}else{
			emisora= EmiFM[posicion];
		}
			
	}

	/* (non-Javadoc)
	 * @see InterfazRadio#getEmisora()
	 */
	@Override
	public double getEmisora() {
		return emisora;
	}

	/* (non-Javadoc)
	 * @see InterfazRadio#getEncendido()
	 */
	@Override
	public boolean getEncendido() {
		return Encendido;
	}


	/* (non-Javadoc)
	 * @see InterfazRadio#getVolumen()
	 */
	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return Volumen;
	}

	/* (non-Javadoc)
	 * @see InterfazRadio#getFrec()
	 */
	@Override
	public String getFrec() {
		return frecuencia;
	}


}
