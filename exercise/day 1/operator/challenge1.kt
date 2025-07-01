fun main(){
    print("Masukkan angka pertama: ")
    val angka1 = readLine()?.toDouble()?:0.0

    print("Masukkan operator (+, -, *, /): ")
    val operator:String = readLine()?:""

    print("Masukkan angka kedua: ")
    val angka2 = readLine()?.toDouble()?:0.0

    val hasil:String = 

    when(operator){
        "+" -> "Hasil: ${angka1 + angka2}"
        "-" -> "Hasil: ${angka1 - angka2}"
        "*" -> "Hasil: ${angka1 * angka2}"
        "/" -> "Hasil: ${angka1 / angka2}"
        else -> "Tolong pilih (+, -, *, /)"
    }
    println("Masukkan angka pertama: $angka1")
    println("Operator: $operator")
    println("Masukkan angka kedua: $angka2")
    println(hasil)
}