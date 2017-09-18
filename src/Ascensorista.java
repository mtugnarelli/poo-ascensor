
public class Ascensorista {

    private Ascensor ascensorDerecho;
    private Ascensor ascensorIzquierdo;
    
    /**
     * pre : 'cantidadDePisos' está en el rango [1,141].
     * post: ascensorista listo para operar con dos Ascensores disponibles
     *       entre planta baja (piso 0) y 'cantidadDePisos'.
     */
    public Ascensorista(int cantidadDePisos) {
        
        ascensorDerecho = new Ascensor(cantidadDePisos);
        ascensorIzquierdo = new Ascensor(cantidadDePisos);
    }
    
    /**
     * post: devuelve el último piso al que puede mover un
     *       ascensor el ascensorista. 
     */
    public int obtenerUltimoPiso() {
        
        return ascensorDerecho.obtenerUltimoPiso();
    }
    
    /**
     * pre : 'pisoDesdeElQueSeLlama' está en el rango [0..'obtenerUltimoPiso()']
     * post: elige al ascensor más cercano a 'pisoDesdeElQueSeLlama', 
     *       lo lleva hasta ese piso y lo devuelve.
     */
    public Ascensor llamarAscensorDesdeElPiso(int pisoDesdeElQueSeLlama) {
        
        Ascensor ascensorElegido;
        
        if (ascensorDerecho.consultarDistanciaAlPiso(pisoDesdeElQueSeLlama) <
            ascensorIzquierdo.consultarDistanciaAlPiso(pisoDesdeElQueSeLlama)) {
            
            ascensorElegido = ascensorDerecho;
            
        } else {
            
            ascensorElegido = ascensorIzquierdo;
        }
        
        ascensorElegido.irAlPiso(pisoDesdeElQueSeLlama);
        
        return ascensorElegido;
    }
}
