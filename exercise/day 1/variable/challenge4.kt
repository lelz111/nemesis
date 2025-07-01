fun main(){
    val barang = readLine()
    val qty = readLine()
    val harga = readLine()
    val total = (harga?.toDouble()?:0.0) * (qty?.toInt()?: 0)

    println("Barang: $barang")
    println("Jumlah: $qty")
    println("Harga Satuan: $harga")
    println("Total: $total")
}