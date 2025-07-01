fun main(){
    println("Nomor Kursi: ")
    val angka = readLine()?.toInt()?:0

    if(angka % 2 == 0){
        println("Nomor Kursi: $angka")
        println("Status: Genap")
    }else if(angka % 2 == 1){
        println("Nomor Kursi: $angka")
        println("Status: Ganjil")
    }
}