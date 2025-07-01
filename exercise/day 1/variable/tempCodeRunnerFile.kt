fun main() {
    val tLahir = readLine()?.toInt()?:0
    val tIni = readLine()?.toInt()?:0
    val usia = (tLahir - tIni).toInt()
    println("============================")
    println("Tahun Lahir: $tLahir \nTahun Sekarang: $tIni \nUsia: $usia")
}