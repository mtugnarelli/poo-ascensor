UNTreF - Algoritmos y Programaci�n 1

# Pr�ctica de Encapsulamiento - Ascensor

![Ascensor][ascensor]

## Ejercicio 1

### Enunciado

Implementar la clase `Ascensor` con las siguientes operaciones:

* Inicializarlo recibiendo como par�metro la cantidad de pisos por los que se mueve (sin considerar la planta baja).

* Devolver el n�mero de piso en el que se encuentra, considerando 0 como la planta baja.

* Ir a un piso. Debe moverlo y devolver la cantidad de pisos que el ascensor se movi� para llegar al piso indicado. 

* Devolver el �ltimo piso al que puede ir el ascensor.


### Soluci�n

* clase [`Ascensor`](../punto-01/src/Ascensor.java)


## Ejercicio 2

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva la cantidad total de pisos desplazados. 

### Soluci�n

* clase [`Ascensor`](../punto-02/src/Ascensor.java)

## Ejercicio 3

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva el m�ximo desplazamiento realizado. 

### Soluci�n

* clase [`Ascensor`](../punto-03/src/Ascensor.java)

### Mejora

Modularizaci�n de la implementaci�n, llevando la actualizaci�n del m�ximo desplazamiento al m�todo privado `void actualizarDesplazamientoMaximo(int)`.

* clase [`Ascensor`](../punto-03-b/src/Ascensor.java)

## Ejercicio 4

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva el m�nimo desplazamiento realizado. 

### Soluci�n

* clase [`Ascensor`](../punto-04/src/Ascensor.java)

## Ejercicio 5

### Enunciado

Implementar la clase `Ascensorista`, tal que cuente con dos `Ascensores` (derecho e izquierdo) y que exponga las siguientes operaciones:

* Inicializarlo recibiendo como par�metro la cantidad de pisos del edificio por los que se mover�n sus `Ascensores`.

* Llamar a un `Ascensor` desde un piso dado, moviendo aquel que se encuentre m�s cercano y devolvi�ndolo.

```java

    public Ascensor llamarAscensorDesdeElPiso(int pisoDesdeElQueSeLlama)

```

### Soluci�n

* clase [`Ascensor`](../punto-05/src/Ascensor.java)

* clase [`Ascensorista`](../punto-05/src/Ascensorista.java)


### Ejemplo de uso

```java

    Ascensorista luis = new Ascensorista(14)
    
    Ascensor primerAscensorPedido = luis.llamarAscensorDesdeElPiso(5)
    
    primerAscensorPedido.obtenerPisoActual()
    > 5
    
    primerAscensorPedido.irAlPiso(9)
    > 4
    
    Ascensor segundoAscesorPedido = luis.llamarAscensorDesdeElPiso(1)
    
    segundoAscesorPedido.obtenerPisoActual()
    > 1
    
    primerAscensorPedido.obtenerPisoActual()
    > 9

    Ascensor tercerAscensorPedido = luis.llamarAscensorDesdeElPiso(11)

    tercerAscensorPedido.obtenerPisoActual()
    > 11

    primerAscensorPedido.obtenerPisoActual()
    > 11
    

```



[ascensor]: https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Feature_elevators.svg/200px-Feature_elevators.svg.png "Ascensor"