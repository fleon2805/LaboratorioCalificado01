package com.leon.fabrizio.laboratoriocalificado01

import org.junit.Test
import org.junit.Assert.*  // Importamos las funciones de JUnit para realizar las pruebas

class Ejercicio01Kotlin {

    // Función que verifica si dos palabras son anagramas
    fun sonAnagramas(palabra1: String, palabra2: String): Boolean {
        // Si las longitudes de las palabras son diferentes, no pueden ser anagramas
        if (palabra1.length != palabra2.length) return false

        // Convertimos ambas palabras en listas de caracteres, las ordenamos y las comparamos
        return palabra1.toCharArray().sorted() == palabra2.toCharArray().sorted()
    }

    @Test
    fun testAnagramas() {
        // Probamos la función con "listen" y "silent"
        val palabra1 = "listen"
        val palabra2 = "silent"

        // Llamamos a la función sonAnagramas y verificamos si el resultado es true
        val resultado = sonAnagramas(palabra1, palabra2)

        // Usamos assertTrue para verificar que el resultado sea true
        assertTrue(resultado)

        // Imprimimos el resultado final como lo pide la salida
        println("\"$palabra1\" y \"$palabra2\" son anagramas: $resultado")
    }

    @Test
    fun testNoAnagramas() {
        // Probamos la función con "hello" y "world", que no son anagramas
        val palabra1 = "hello"
        val palabra2 = "world"

        // Llamamos a la función sonAnagramas y verificamos si el resultado es false
        val resultado = sonAnagramas(palabra1, palabra2)

        // Usamos assertFalse para verificar que el resultado sea false
        assertFalse(resultado)

        // Imprimimos el resultado para saber si funcionó correctamente
        println("\"$palabra1\" y \"$palabra2\" son anagramas: $resultado")
    }
}

