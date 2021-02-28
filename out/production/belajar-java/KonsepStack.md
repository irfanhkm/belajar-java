kumpulan objek dengan prinsip LIFO (last in first out)
data yang terakhir kali dimasukkan akan pertama kali keluar
### operasi yang bisa digunakan
- push >> memasukkan data
- pop >> menghapuskan data
- peek >> melihat item paling atas
- empty >> boolean cek isi stack ada isinya atau tidak

Contoh stack
```
5 (top)
28
7
13 (bottom)
```
- cara masuknya dari atas ke bawah
- cara keluarnya dari bawah ke atas

```
stack
push(1)
1

push(2)
1,2

push(5)
1,2,5

pop()
1,2

peek()
2

pop()
1

peek()
1
```
