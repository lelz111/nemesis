fun main(){
    println("harga Belanja: ")
    val harga = readLine()?.toDouble()?:0.0

    if(harga > 100000){
        val diskon = harga * 0.1
        val bayar = harga-diskon

        println("Total Belanja: ${harga.toInt()}")
        println("Diskon: ${diskon.toInt()}")
        println("Total Bayar: ${bayar.toInt()}")
    }else{
        val diskon = 0
        val bayar = harga - diskon

        println("Total Belanja: ${harga.toInt()}")
        println("Diskon: ${diskon.toInt()}")
        println("Total Bayar: ${bayar.toInt()}")
    }
}