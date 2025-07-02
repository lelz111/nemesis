fun main(){
    print("Masukan Angka 1: ")
    val num1 = readLine()?.toInt()?:0

    print("Masukan Angka 2: ")
    val num2 = readLine()?.toInt()?:0

    print("Pilih Operasi: ")
    val op = readLine()?:""

    when(op){
        "+" -> tambah(num1,num2)
        "-" -> kurang(num1,num2)
        "*" -> kali(num1,num2)
        "/" -> bagi(num1,num2)
    }
}

fun tambah(a:Int, b: Int){
    println("Hasil: ${a + b}")
}
fun kurang(a:Int, b: Int){
    println("Hasil: ${a - b}")
}
fun kali(a:Int, b: Int){
    println("Hasil: ${a * b}")
}
fun bagi(a:Int, b: Int){
    println("Hasil: ${a / b}")
}