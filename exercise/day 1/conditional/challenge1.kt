fun main(){
    val nilai = readLine()?.toInt()?:0

    if(nilai >= 85 && nilai <= 100){
        println("Nilai: $nilai \nPredikat: A")
    }
    else if(nilai >= 70 && nilai <= 84){
        println("Nilai: $nilai \nPredikat: B")
    }
    else if(nilai >= 60 && nilai <= 69){
        println("Nilai: $nilai \nPredikat: C")
    }
    else if(nilai >= 50 && nilai <= 59){
        println("Nilai: $nilai \nPredikat: D")
    }
    else if(nilai < 50){
        println("Nilai: $nilai \nPredikat: E")
    }
}