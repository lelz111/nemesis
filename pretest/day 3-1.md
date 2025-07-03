---

## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

```
1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   A. Button
   B. EditText
   C. TextView
   D. ImageView
   Jawaban: C

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   A. Button
   B. TextView
   C. EditText
   D. Spinner
   Jawaban: C

3. Untuk menampilkan gambar, kita menggunakan komponen:
   A. WebView
   B. ImageView
   C. RecyclerView
   D. VideoView
   Jawaban: B

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   A. LinearLayout
   B. RelativeLayout
   C. ConstraintLayout
   D. FrameLayout
   Jawaban: B

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   A. ListView
   B. GridView
   C. RecyclerView
   D. TextView
   Jawaban: B

```
---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal.
Jawaban: F

7. `Button` bisa digunakan untuk menampilkan gambar.
Jawaban: T

8. `ScrollView` hanya dapat memiliki satu child langsung.
Jawaban: T

9. `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna.
Jawaban: F
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML.
Jawaban: T

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?
Jawaban: ConstraintLayout

12. Sebutkan dua komponen UI untuk input pilihan pengguna!
Jawaban: Checkbox, RadioButton

13. Fungsi dari `TextInputLayout` adalah untuk...?
Jawaban: Sebagai Tempat dimana view layout untuk text input seperti editText dapat dibuat/ditampung

14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?
Jawaban:menggunakan findViewById untuk meng get id dari TextView

15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?
Jawaban: sebagai penyambung untuk RecyclerView dan data/komponen lainnya

16. Apa perbedaan utama antara `TextView` dan `EditText`?
Jawaban: TextView itu hanya untuk menampilkan text, sedangkan editText dipakai untuk mengedit text dalam sebuah view, biasanya dipakai untuk input

17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?
Jawaban:textview dan toast

18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!
Jawaban: Linear layout hanya 1 arah jadi hanya bisa memuat layout secara horizontal saja atau vertikal saja. RelativeLayout bisa menyusun posisi secara relatif, tidak terikat secara horizontal saja/vertikal saja.

19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?
Jawaban:EditText

20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?
Jawaban:Button/Image

---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```
Jawaban: gnti width jadi wrap_content / match_parent
```xml
<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:text="Hello" />
```

22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text("Click Me")
```
Jawaban:

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text = ("Click Me")
```

23.

```xml
<LinearLayout
    android:orientation="vertikal"
    ...>
```
Jawaban:

```xml
<LinearLayout
    android:orientation="vertical"
    ...>
```

24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.setText = "Hi"
```
Jawaban: 

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"
```

25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```
Jawaban:tidak bisa langsung ambil png, hrs lewat drawable

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="@drawable/(nama file)" />
```

26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString
```
Jawaban:tambahkan () pada string

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString()
```
27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething()" />
```
Jawaban: onClick tidak dapat menerima parameter ()

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />
```

28.

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```
Jawaban:Length_long harus didefinisikan antara secara manual import Toast.LENGTH_LONG, atau menambahkan toast. sebelum length long

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```

29.

```xml
<EditText
    android:hintText="Enter name"
    ... />
```
Jawaban:cukup hint saja
```xml
<EditText
    android:hint="Enter name"
    ... />
```

30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContent(layout)
```
Jawaban: seharusnya setcontentview

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)
```

---
