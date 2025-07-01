fun main(){
    while(true){
        println("1. Lihat menu \n2. Beli \n3. Keluar")
        println("Pilih: ")
        val input = readLine()?.toInt()?:0

        when(input){
            1 -> println("Menu: Nasi Goreng, Mie Ayam")
            2 -> println("Silakan lakukan pembelian.")
            3 -> {print("Terima kasih!")
                break
            }
            else -> println("Pilihan tidak valid, coba lagi.")
        }
    }
}