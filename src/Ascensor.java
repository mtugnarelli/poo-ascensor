
class Ascensor {

    private int pisoActual;
    private int ultimoPiso;
    private int desplazamientoTotal;
    private int desplazamientoMaximo;
    
    /**
     * pre : 'cantidadDePisos' est� en el rango [1..141]
     * post: el ascensor est� en planta baja (piso 0), con la
     *       posibilidad de moverse entre 0 y 'cantidadDePisos'.
     * 
     */
    public Ascensor(int cantidadDePisos) {
        
        pisoActual = 0;
        
        if (cantidadDePisos > 0 && cantidadDePisos <= 141) {
            
            ultimoPiso = cantidadDePisos;
            
        } else {
        
            ultimoPiso = 141;
        }
        
        desplazamientoTotal = 0;
        desplazamientoMaximo = 0;
    }
    
    /**
     * post: devuelve el n�mero de piso en el que se
     *       encuentra el ascensor, 0 si est� en planta baja.
     */
    public int obtenerPisoActual() {
        
        return pisoActual;
    }
    
    /**
     * post: devuelve el �ltimo piso al que puede moverse
     *       el ascensor.
     */
    public int obtenerUltimoPiso() {
        
        return ultimoPiso;
    }
    
    /**
     * pre : 'pisoAlQueIr' est� en el rango [0, 'obtenerUltimoPiso()'].
     * post: mueve el ascensor al piso indicado y devuelve la cantidad
     *       de pisos por los que se desplaz�.
     */
    public int irAlPiso(int pisoAlQueIr) {
        
        int desplazamiento = 0;
        
        if ((pisoAlQueIr >=0) && (pisoAlQueIr <= ultimoPiso)) {
            
            if (pisoAlQueIr > pisoActual) {
                
                desplazamiento = pisoAlQueIr - pisoActual;

            } else {
                
                desplazamiento = pisoActual - pisoAlQueIr;
            }
            pisoActual = pisoAlQueIr;
            desplazamientoTotal = desplazamientoTotal + desplazamiento;

            if (desplazamiento > desplazamientoMaximo) {
                
                desplazamientoMaximo = desplazamiento;
            }
        }
        
        return desplazamiento;
    }
    
    /**
     * post: devuelve la cantidad total de pisos por las que
     *       se ha desplazado en ascensor hasta el momento.
     */
    public int calcularDesplazamientoTotal() {
        
        return desplazamientoTotal;
    }

    /**
     * post: devuelve el m�ximo desplazamiento sufrido por el 
     *       ascensor hasta el momento.
     */
    public int calcularDesplazamientoMaximo() {
        
        return desplazamientoMaximo;
    }

}
