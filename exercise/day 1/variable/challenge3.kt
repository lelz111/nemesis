fun main(){
    val nama = readLine()
    val status:Boolean=readLine()?.toBoolean()?:false
    println("Nama: $nama \nMahasiswa Aktif: $status")
}