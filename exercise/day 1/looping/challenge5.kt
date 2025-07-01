fun main(){
    print("Input: ")
    val text = readLine()?: 0

    print("Jumlah: ")
    val input = readLine()?.toInt() ?: 0
    
    for (i in 1..input) {
       println(text)
    }
}