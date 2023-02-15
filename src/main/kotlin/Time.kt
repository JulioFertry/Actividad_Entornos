class Time (hours: Int, minutes: Int, seconds: Int) {
    /*Controlamos los posibles valores de los atributos Horas, Minutos y Segundos en el constructor primario,
    * de esta manera nos aseguramos que los valores sean correctos al crear un objeto en el Main mediante
    * cualquiera de los constructores ya sea primario o secundario */
    private var hours: Int = if (hours in 0..23) hours else 0
    private var minutes: Int = if (minutes in 0..60) minutes else 0
    private var seconds: Int = if (seconds in 0..60) seconds else 0

    //Permite crear objetos "Time" sin minutos ni segundos declarados
    constructor(hours: Int): this(hours= hours, 0, 0)

    //Permite crear objetos "Time" sin segundos declarados
    constructor(hours: Int, minutes: Int): this(hours= hours, minutes= minutes, 0)

    //Metodos getter y setter
    fun gethours(): Int{
        return hours }
    fun sethours(newHours: Int){
        if (newHours in 0..23)
            this.hours = newHours }

    fun getminutes(): Int{
        return minutes }
    fun setminutes(newMinutes: Int){
        if (newMinutes in 0..60)
            this.minutes = newMinutes }

    fun getseconds(): Int{
        return seconds }
    fun setseconds(newSeconds: Int){
        if (newSeconds in 0..60)
            this.seconds = newSeconds }

    //Funcion toString para obtener la informacion en forma de cadena, se le aplica un formato
    override fun toString(): String {
        return "${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}"
    }

}