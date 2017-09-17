UNTreF - Algoritmos y Programaci�n 1

# Pr�ctica de Encapsulamiento - Ascensor

## Ejercicio 1

### Enunciado

![Ascensor][ascensor]

Implementar la clase `Ascensor` con las siguientes operaciones:

* Inicializarlo recibiendo como par�metro la cantidad de pisos por los que se mueve (sin considerar la planta baja).

* Devolver el n�mero de piso en el que se encuentra, considerando 0 como la planta baja.

* Ir a un piso. Debe moverlo y devolver la cantidad de pisos que el ascensor se movi� para llegar al piso indicado. 

* Devolver el �ltimo piso al que puede ir el ascensor.


### Soluci�n

[`Ascensor`](../punto-01/src/Ascensor.java)


## Ejercicio 2

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva la cantidad total de pisos desplazados. 

### Soluci�n

[`Ascensor`](../punto-02/src/Ascensor.java)

## Ejercicio 3

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva el m�ximo desplazamiento realizado. 

### Soluci�n

[`Ascensor`](../punto-03/src/Ascensor.java)

### Mejora

Modularizaci�n de la implementaci�n, llevando la actualizaci�n del m�ximo desplazamiento al m�todo privado 'void actualizarDesplazamientoMaximo(int)'.

[`Ascensor`](../punto-03-b/src/Ascensor.java)

## Ejercicio 4

### Enunciado

Agregar al `Ascensor` un m�todo que devuelva el m�nimo desplazamiento realizado. 

### Soluci�n

[`Ascensor`](../punto-04/src/Ascensor.java)

[ascensor]: https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Feature_elevators.svg/200px-Feature_elevators.svg.png "Ascensor"