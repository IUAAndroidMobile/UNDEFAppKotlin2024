package com.example.helloworld.utils
/**
class InferredTypes {

    init {
        inferTypes()
    }

    fun inferTypes() {

        val nombre = "Juan"  // El compilador infiere que el tipo es String
        val edad = 25        // El compilador infiere que el tipo es Int
        val esEstudiante = true  // El compilador infiere que el tipo es Boolean

        val apellido : String = "Perez"
        val legajo : Long = 987654
        val promedio : Double = 9.5
        val esActivo : Boolean = true

        println("Nombre: $nombre, Edad: $edad, EsEstudiante: $esEstudiante")
        println("Apellido: $apellido, Legajo: $legajo, Promedio: $promedio, EsActivo: $esActivo")


        crearUsuario("Ana")  // Imprime "Nombre: Ana, Edad: 18, País: Desconocido"
        crearUsuario("Pedro", 25)  // Imprime "Nombre: Pedro, Edad: 25, País: Desconocido"
        crearUsuario("Luis", pais = "España")  // Imprime "Nombre: Luis, Edad: 18, País: España"
        crearUsuario(edad = 30, nombre = "Maria", pais = "Argentina")  // Imprime "Nombre: Maria, Edad: 30, País: Argentina"

        realizarOperacion(5) { resultado ->
            println("El resultado de la operación es: $resultado")
        }

    }

    fun Saludar(nombre: String = "Inivitado", edad: Int): String {
        return "Hola $nombre, edad $edad"
    }

    fun crearUsuario(nombre: String, edad: Int = 18, pais: String = "Desconocido") {
        println("Nombre: $nombre, Edad: $edad, País: $pais")
    }

    fun realizarOperacion(numero: Int, callback: (resultado: Int) -> Unit) {
        val resultado = numero * 2
        callback(resultado)
    }

    var nombre: String? = null
    var apellido: String? = null

    var nombreCompleto = nombreCompleto("Nicolas", "Fanin")

    fun nombreCompleto(nombre: String?, apellido: String?): String {
        return nombre?.let {
            apellido?.let {
                return "$nombre $apellido"
            }
        } ?: run {
            "Sin datos"
        }
    }

    fun getNombre(): String {
        nombreCompleto
        apellido
        return nombre ?: "Inivitado"
    }

    var nullable: String? = null

    fun nullTest() {
        nullable?.let {
            println("La variable no es nula")
        } ?: run {
            println("La variable es nula")
        }
    }



}
        **/