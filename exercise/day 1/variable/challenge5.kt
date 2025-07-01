fun main(){
    val nilai = readLine()?.toInt()?:0
    val skala = nilai / 25.0

    val hasil = String.format("Nilai: %d -> skala 4.0 = %.2f", nilai, skala)
    println(hasil)
}