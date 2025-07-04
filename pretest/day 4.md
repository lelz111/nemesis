```

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: 
   A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar
   Jawaban: C

2. Kelas dasar untuk membuat fragment adalah: 
   A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`
   Jawaban: C

3. Metode untuk menambahkan fragment ke activity adalah: 
   A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`
   Jawaban: B

4. Untuk mengelola fragment, kita menggunakan: 
   A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`
   Jawaban: C

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`
   Jawaban: C

```

---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity.
Jawaban: F

7. Satu activity bisa menampilkan lebih dari satu fragment.
Jawaban: T

8. Kita tidak bisa mengganti fragment yang sedang ditampilkan.
Jawaban: F

9. Fragment bisa mengakses komponen UI dari activity langsung.
Jawaban: T

10. Fragment tidak bisa hidup tanpa activity.
Jawaban: T

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?
Jawaban: untuk mengelola fragment

12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?
Jawaban: onCreateView()

13. Sebutkan dua metode lifecycle penting pada fragment!
Jawaban: onCreateView(), onStart()

14. Bagaimana cara mengirim data dari activity ke fragment?
Jawaban: menggunakan setArguments(Bundle)

15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
Jawaban: karena fragment bisanya hanya menggunakan 1 frame saja dan tidak mengambil seluruh tampilan UI

16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
Jawaban: replace() akan menggantikan fragment(dihapus) yang sedang ditampilan ke fragment baru, sedangkan add() menambahkan fragment ke fragment yang sedang berjalan(tidak dihapus)

17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
Jawaban:tidak, karena fragment butuh trigger untuk menampilkan isinya

18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
Jawaban: menggunakan addToBackStack(null)

19. Apa tujuan dari `setArguments(Bundle)` di fragment?
Jawaban: untuk mengirim data dari activity ke fragment

20. Sebutkan alasan menggunakan fragment dibanding activity!
Jawaban: lebih efisien, karena fragment bisa digunakan berulang kali

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```
Jawaban: tambahkan ()

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```
Jawaban: menambahkan ()
```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```
Jawaban: height typo

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```
Jawaban: value bukan string

```kotlin
val bundle = Bundle()
bundle.putString("key", value)
fragment.arguments(bundle)
```

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```
Jawaban: harusnya ada null

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit()
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```
Jawaban: kalau view mau null pakai?, jika tidak bikin View view = return....

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```


27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```

Jawaban: buat set/ngirim data pakai arguments harusnya

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments(args)
```
28.

```kotlin
supportFragmentManager.pop()
```
Jawaban: tdak ada function pop()

```kotlin
supportFragmentManager.popBackStack()
```

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```
Jawaban:cukup commit saja

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commit()
```

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```
Jawaban:
```kotlin
val view = inflater.inflate(R.layout.fragment_home, container, false)
```

---
