fun main(){
    val dataNilai: MutableMap<String, MutableList<Int>> = mutableMapOf()
    var rr = 0

    while(true){
        println("=== MENU NILAI SISWA === \n1. Tambah Nilai Siswa \n2. Lihat Semua Data \n3. Cari Nilai Tertinggi \n4. Siswa yang Lulus \n5. Keluar")
        
        val pilih = readLine()?.toInt()?:0
        println("Pilih Menu: ")

        when(pilih){
            1 -> {
                println("Input Nama Siswa: ")
                val nama = readLine()?:""

                println("Masukan Nilai (pisahkan dengan spasi) : ")
                val nilai = readLine().orEmpty()
                val nilaiList = nilai.split(" ").mapNotNull { it.toIntOrNull()}.toMutableList()

                if(nilaiList.isEmpty() ){
                    println("Nilai Tidak Ada!")
                }else{
                    dataNilai[nama] = nilaiList
                    println("Data Berhasil Disimpan!")
                }
            }
            2 -> {
                if(dataNilai.isEmpty()){
                    println("Tidak ada data nilai")
                }else{
                    for ((nama, nilaiList) in dataNilai){
                        val rata2 = hitungRataRata(nilaiList)

                        println("Nama: $nama")
                        println("Nilai: $nilaiList")
                        println("Rata-rata Nilai: $rata2")
                    }
                }
            }
            3 -> {
                println("ini menu 3")
            }
            4 -> {
                println("ini menu 4")
            }
            5 -> {
                println("Program akan berhenti")
                break
            }
        }
    }
}

fun hitungRataRata(nilai: List<Int>): Double {
    return if (nilai.isNotEmpty()) nilai.average() else 0.0
}
