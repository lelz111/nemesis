---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`

   Jawaban: C

2. Kata kunci `val` digunakan untuk:

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak
   
   Jawaban: 

3. Apa hasil dari `println(5 + 3 * 2)`?

   - a. 16
   - b. 11
   - c. 13
   - d. 6

   Jawaban: B

4. Fungsi utama program Kotlin adalah:

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`

   Jawaban: B

5. Di Android Studio, layout antarmuka ditulis dengan:

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON

   Jawaban: C

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14

   Jawaban: B

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel

   Jawaban: C

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?

   - a. true
   - b. false
   - c. error
   - d. null

   Jawaban: B

9. Android Studio adalah tools untuk:

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi

   Jawaban: C

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:

- a. Intent
- b. Fragment
- c. TextView
- d. XML

Jawaban: B

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.
Jawaban: val: isi dari val tidak akan bisa diubah saat di declare lagi, jika pertama kali sudah di decalre seperti val x = 7, jika di declare lagi x = 10 hasilnya akan error. Sedangkan kalau var bisa diubah.

12. Sebutkan dua tipe data numerik dalam Kotlin.
Jawaban: Int dan Double

13. Apa kegunaan fungsi `println()`?
Jawaban: untuk menampilkan value/hasil dalam ()

14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
Jawaban: menggunakan .toIntOrNull() | angka = 'inputan'.toIntOrNull()

15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
Jawaban: Linear Layout

16. Apa itu `Intent` dalam Android?
Jawaban: fungsi yang digunakan untuk melakukan launching suatu activity

17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
Jawaban: menggunakan <Textview>

18. Apa arti dari null safety dalam Kotlin?
Jawaban: fungsi/fitur untuk mencegah terjadinya error saat mengkases variable yang memiliki nilai null

19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
Jawaban: toInt() hanya langsung me return result, sedangkan toIntOrNull() me return null apabila number/value yang di return tidak valid

20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
Jawaban: dalam membuat sebuah entity, java memerlukan banyak line mulai dari constructor, stter getter,dll. Kotlin hanya memerlukan 1 baris saja.

21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
Jawaban: folder kotlin+java

22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
Jawaban: ada nama class, constructornya, dan diawali dengan lifecycle onCreate()

23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
Jawaban: fitur/fungsi yang digunakan untuk menyisipkan value String kedalam String lain menggunakan $

24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
Jawaban: ?. untuk null safety, jika suatu variable null, returnnya akan null dan tidak aka terjadi error nullException. ?: memberikan nilai default berupa value di sebelah kanan tanda ':' jika nilai dari seuatu variable adalah null

25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?
Jawaban: bisa dengan ?. tadi untuk menghindari error null exception atau dengan try catch block


---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}
```
Jawaban:
fun main() {
    val umur = readLine()?.toIntOrNull() ?: 0
    println("Umur anda adalah: ${umur + 5} ")
}


---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")
```

Jawaban:
val nama: "lelz"
println("Halo: $nama")


---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}
```
Jawaban:
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: $umur tahun")
}

---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)
```
Jawaban: 
val angka = "20"
val hasil = angka.toInt + 5
println(hasil)

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}
```
Jawaban:
fun main() {
  val tinggi = readLine().toDoubleOrNull()
  println("Tinggi kamu adalah: $tinggi")
}
---
