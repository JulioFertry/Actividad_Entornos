class Menu {
    private var exitCommand = -1 //Esta variable va a permitir navegar por el menu y salir del bucle

    fun displayMenu(){
        while (exitCommand != 0){
            println("Pulsa 1 para introducir Horas")
            println("Pulsa 2 para introducir Horas y Minutos")
            println("Pulsa 3 para introducir Horas, Minutos y Segundos")
            println("Pulsa 0 para salir")

            println(exitCommand)
            exitCommand = readln().toInt() //El usuario introduce el numero de la opcion deseada

            when (exitCommand){
                1 -> {
                    println("Introduce el numero de horas: ")
                    val hour = readln().toInt()

                    val time = Time(hour, 0, 0)
                    println(time.toString())
                }

                //Esta mierda la tengo que repasar porque no entiendo el uso del "it"
                2 -> {
                    println("Introduce el numero de horas: ")
                    val hour = readln().toInt()

                    println("Introduce el numero de minutos: ")
                    val minute = readln().toInt()

                    val time = Time(hour, minute, 0)
                    println(time.toString())
                }

                //Si el usuario introduce 3, se pedirán los segundos, los minutos y las horas
                3 -> {
                    println("Introduce el numero de horas: ")
                    val hour = readln().toInt()

                    println("Introduce el numero de minutos: ")
                    val minute = readln().toInt()

                    println("Introduce el numero de segundos: ")
                    val second = readln().toInt()

                    val time = Time(hour, minute, second)
                    println(time.toString())
                }
                0 -> {
                    println("Adios, nos vemos churra")
                }
                else -> {
                    println("ESA OPCION NO EXISTE")
                }
            }


        }
    }

}