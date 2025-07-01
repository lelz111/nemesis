fun main(){
    println("Angka A: ")
    val angka1 = readLine()?.toInt()?:0

    println("Angka B: ")
    val angka2 = readLine()?.toInt()?:0

    println("Angka A: $angka1")
    println("Angka B: $angka2")

    if(angka1 > angka2){
        println("Angka lebih besar: $angka1")
    }else{
        println("Angka lebih besar: $angka2")

    }
}