
fun main(){
    val angka = mutableListOf<Int>()
    var total = 0.0

    for (i in 1..5) {
        print("Masukkan nilai ke-$i: ")
        val input = readLine()?.toInt() ?: 0
        angka.add(input)
        total += input
    }
    println("Total: $total")
    println("Rata-rata: ${total / 5}")
}