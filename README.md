UNTreF - Algoritmos y Programación 1

# Práctica de Encapsulamiento - Ascensor

## Ejercicio 1

### Enunciado

![Ascensor][ascensor]

Implementar la clase `Ascensor` con las siguientes operaciones:

* Inicializarlo recibiendo como parámetro la cantidad de pisos por los que se mueve (sin considerar la planta baja).

* Devolver el número de piso en el que se encuentra, considerando 0 como la planta baja.

* Ir a un piso. Debe moverlo y devolver la cantidad de pisos que el ascensor se movió para llegar al piso indicado. 

* Devolver el último piso al que puede ir el ascensor.


### Solución

[`Ascensor`](../punto-01/src/Ascensor.java)


## Ejercicio 2

### Enunciado

Agregar al `Ascensor` un método que devuelva la cantidad total de pisos desplazados. 

### Solución

[`Ascensor`](../punto-02/src/Ascensor.java)

## Ejercicio 3

### Enunciado

Agregar al `Ascensor` un método que devuelva el máximo desplazamiento realizado. 

### Solución

[`Ascensor`](../punto-03/src/Ascensor.java)

### Mejora

Modularización de la implementación, llevando la actualización del máximo desplazamiento al método privado 'void actualizarDesplazamientoMaximo(int)'.

[`Ascensor`](../punto-03-b/src/Ascensor.java)

## Ejercicio 4

### Enunciado

Agregar al `Ascensor` un método que devuelva el mínimo desplazamiento realizado. 

### Solución

[`Ascensor`](../punto-04/src/Ascensor.java)

[ascensor]: https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/Feature_elevators.svg/200px-Feature_elevators.svg.png "Ascensor"