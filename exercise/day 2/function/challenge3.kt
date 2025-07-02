fun main(){
    val suhu = String.format("Suhu dalam Fahrenheit = %.2f", konversiSuhu(35.0))
    println(suhu)
}

fun konversiSuhu(celcius: Double): Double{
    return (celcius * 9/5) + 32
}