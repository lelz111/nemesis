fun main(){
    print("Input sisi: ")
    val sisi = readLine()?.toInt()?:0
    val luas = (luasPersegi(sisi))

    println("Luas Persegi: $luas")
}


fun luasPersegi(sisi: Int): Int{
    return sisi * sisi
}