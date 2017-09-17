
class Ascensor {

    private int pisoActual;
    private int ultimoPiso;
    private int desplazamientoTotal;
    private int desplazamientoMaximo;
    private int desplazamientoMinimo;
    
    /**
     * pre : 'cantidadDePisos' está en el rango [1..141]
     * post: el ascensor está en planta baja (piso 0), con la
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
     * post: devuelve el número de piso en el que se
     *       encuentra el ascensor, 0 si está en planta baja.
     */
    public int obtenerPisoActual() {
        
        return pisoActual;
    }
    
    /**
     * post: devuelve el último piso al que puede moverse
     *       el ascensor.
     */
    public int obtenerUltimoPiso() {
        
        return ultimoPiso;
    }
    
    /**
     * pre : 'pisoAlQueIr' está en el rango [0, 'obtenerUltimoPiso()'].
     * post: mueve el ascensor al piso indicado y devuelve la cantidad
     *       de pisos por los que se desplazó.
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
            actualizarDesplazamientoMaximo(desplazamiento);
            actualizarDesplazamientoMinimo(desplazamiento);
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
     * post: devuelve el máximo desplazamiento sufrido por el 
     *       ascensor hasta el momento.
     */
    public int calcularDesplazamientoMaximo() {
        
        return desplazamientoMaximo;
    }
    
    public int calcularDesplazamientoMinimo() {
        
        return desplazamientoMinimo;
    }

    /**
     * pre : el ascensor se acaba de mover.
     * post: actualiza el desplazamiento máximo si corresponde.
     */
    private void actualizarDesplazamientoMaximo(int desplazamientoActual) {
        
        if (desplazamientoActual > desplazamientoMaximo) {
            
            desplazamientoMaximo = desplazamientoActual;
        }
    }
    
    /**
     * pre : el ascensor se acaba de mover.
     * post: actualiza el desplazamiento mínimo si corresponde.
     */
    private void actualizarDesplazamientoMinimo(int desplazamientoActual) {
        
        /* cuando desplazamientoMinimo es 0, se trata del primer desplazamiento */
        if ((desplazamientoMinimo == 0) || 
            ((desplazamientoActual > 0) && (desplazamientoActual < desplazamientoMinimo))) {
                
            desplazamientoMinimo = desplazamientoActual;
        }
    }
    
}
