fun main(){
    val umur = readLine()?.toInt()?:0
    val vip:Boolean=readLine()?.toBoolean()?:false

    if(umur > 18 && vip == true){
        println("Umur: $umur \nMember VIP: $vip \nStatus: Diperbolehkan masuk")
    }else {
        println("Umur: $umur \nMember VIP: $vip \nStatus: Tidak diperbolehkan masuk")
    }
}