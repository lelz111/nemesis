fun main(){
    println("1. Nasi Goreng \n2.Mie Ayam \n3.Ayam Geprek")

    val pilihan = readLine()?.toInt()?:0
    val menu:String = 

    when(pilihan){
        1 -> "Kamu Memilih: Nasi Goreng"
        2 -> "Kamu Memilih: Mie Ayam"
        3 -> "Kamu Memilih: Ayam Geprek"
        else -> "Tolong pilih 1-3"
    }
    println("Pilihan: $pilihan")
    println(menu)
}