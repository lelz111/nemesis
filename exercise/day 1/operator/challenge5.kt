fun main(){
    println("Input Umur: ")
    val umur = readLine()?.toInt()?:0

    println("Status Member: ")
    val member:Boolean=readLine()?.toBoolean()?:false

    if(umur > 21 && member == true){
        println("Umur: $umur \nMember: $member \nStatus: Boleh masuk")
    }else {
        println("Umur: $umur \nMember: $member \nStatus: Tidak boleh masuk")
    }
}