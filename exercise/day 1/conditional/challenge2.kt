fun main(){
    val umur = readLine()?.toInt()?:0

    if(umur < 13){
        println("Umur: $umur \nKategori: Anak-anak")
    }
    else if(umur >= 13 && umur <=19){
        println("Umur: $umur \nKategori: Remaja")
    }
    else if(umur >= 20 && umur <=59){
        println("Umur: $umur \nKategori: Dewasa")
    }
    else if(umur >= 60){
        println("Umur: $umur \nKategori: Lansia")
    }
}