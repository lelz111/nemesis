## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`
   Jawaban: B

2. Method `onPause()` biasanya dipanggil ketika...
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_
      Jawaban: C

3. Method `onDestroy()` akan selalu dipanggil jika...
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil
      Jawaban: C

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`
      Jawaban: C

5. Lifecycle `onRestart()` akan dipanggil saat...
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`
      Jawaban: B

6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`
      Jawaban: B

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`
      Jawaban: C

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`
      Jawaban: C

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`
      Jawaban: C

10. Fungsi dari `onResume()` adalah...
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup
       Jawaban: B

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity.
Jawaban: F

12. `onPause()` dipanggil sebelum `onStop()`.
Jawaban: T

13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain.
Jawaban: F

14. Rotasi layar akan memanggil kembali `onCreate()`.
Jawaban: T

15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif.
Jawaban: T

16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi.
Jawaban: F

17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian.
Jawaban: F

18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total.
Jawaban:T

19. `onCreate()` hanya digunakan untuk menampilkan layout.
Jawaban: F

20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.
Jawaban: F

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.
Jawaban: OnCreate(), OnStart(), OnResume()

22. Apa fungsi utama dari method `onSaveInstanceState()`?
Jawaban: Untuk menyimpan data sementara sebelum Activity di-_recreate_

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?
Jawaban: onPause() dipanggil saat activity lain dipanggil, tetapi activity utama masih terlihat. onPause() dipanggil saat activity lain dipanggil, dan activity utama sudah tidak terlihat

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?
Jawaban: Activity akan otomatis meng-recreate

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.
Jawaban: Saat aplikasi masih nyala dan hanya berpinadh activity(tidak secara langsung menutup activity)

---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```
Jawaban: metode oncreate harus ada savedInstanceState: Bundle nya

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
}
```

27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
```
Jawaban: onStop tidak perlu lagi memerlukan bundle

```kotlin
override fun onStop() {
  super.onStop()
  Log.d("LIFECYCLE", "Stopped")
}
```

28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}
```
Jawaban:harus nya resume dulu baru set view

```kotlin
override fun onResume() {
   super.onResume()
   setContentView(R.layout.activity_main)
}
```
29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}
```
Jawaban: onCreate harus ada super nya

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   Log.d("LIFECYCLE", "Created")
}
```
30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```
Jawaban: super harus diinput setelah override

```kotlin
override fun onSaveInstanceState() {
   super.onSaveInstanceState(outState)
   outState.putString("username", "admin")
}
```
---
