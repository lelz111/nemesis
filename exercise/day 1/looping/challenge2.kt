fun main() {
    var attempts = 0
    var tebak: Int? = null

    while (tebak != 7) {
        print("Tebak angka: ")
        tebak = readLine()?.toIntOrNull()

        attempts++
    }

    println("Tebakan Anda benar! Jumlah percobaan: $attempts")
}
