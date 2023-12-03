## Polymorphism

Polimorfisme memungkinkan kita mengakses metode dari kelas induk melalui kelas anak menggunakan overriding. Dengan menggunakan konsep overriding, kelas anak dapat memberikan implementasi yang sesuai dengan metode yang sudah dideklarasikan di kelas induknya. Kemudian, objek dari kelas anak dapat diakses dan digunakan dengan cara yang seragam melalui referensi kelas induk, memanfaatkan polimorfisme.

Polimorfisme memungkinkan kode untuk menjadi lebih fleksibel dan dapat diubah, karena kita dapat menggunakan objek dari kelas-kelas yang berbeda dengan cara yang seragam, asalkan metode yang di-overide memiliki nama, tipe kembalian, dan parameter yang sama persis dengan metode yang dideklarasikan di kelas induk.

Dalam konteks Java, ada dua jenis polimorfisme yaitu polimorfisme compile time (overloading) dan polimorfisme runtime (overriding). Dua jenis ini didukung oleh Java melalui konsep overloading dan overriding.

## Polimorfisme Compile Time (Overloading):

- Overloading terjadi ketika sebuah kelas memiliki dua atau lebih metode dengan nama yang sama, tetapi parameter-parameter metodenya berbeda (jumlah atau tipe parameter).
- Metode yang di-overload harus memiliki nama yang sama, tetapi tipe atau jumlah parameter yang berbeda.
- Tujuan overloading adalah untuk menyediakan fungsionalitas yang berbeda tergantung pada argumen yang diterima oleh metode.
- Overloading tidak melibatkan hubungan pewarisan, dan metode-overload dapat berada dalam kelas yang sama atau dalam kelas yang berbeda.
- Contoh polimorfisme compile time dapat ditemukan dalam konsep overloading Java.

Contoh kode :

```java
public class Main {
  static int plusMethod(int x, int y) {
    return x + y;
  }
  
  static double plusMethod(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
  }
}
```

## Polimorfisme Runtime (Overriding):

Penjelasan mendalam mengenai overriding sebagai berikut :

- Polimorfisme overriding memungkinkan kelas anak (subclass) untuk memberikan implementasi yang berbeda untuk metode yang sudah dideklarasikan di kelas induk (superclass).
- Dengan menggunakan @Override di kelas anak, kita dapat memberikan implementasi yang sesuai dengan kebutuhan kelas anak.
- Polimorfisme overriding terbatas pada metode. Ini memungkinkan kita untuk memanggil metode kelas induk dari kelas anak, tetapi hanya metode yang di-overide.
- Contoh polimorfisme runtime dapat ditemukan dalam konsep overriding di Java.

Contoh kode :

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Memanggil metode makeSound() dari kelas induk
        System.out.println("Dog barks");
    }
}
```

## Super

Kata kunci super dalam Java digunakan untuk merujuk atau mengakses anggota kelas induk (superclass) dalam konteks pewarisan. Dengan menggunakan super, kita dapat mengakses variabel anggota, metode, atau konstruktor dari kelas induk, bahkan jika kelas anak (subclass) memiliki anggota yang sama dengan nama yang sama.

Contoh kode :

```java
class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(super.name); // Mengakses variabel 'name' dari kelas induk
        super.eat(); // Memanggil metode 'eat' dari kelas induk
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}
```

## Kesimpulan 

📌 Jadi, dapat disimpulkan bahwa pada polimorfisme overriding lebih fokus pada metode dan penggantian perilaku metode kelas induk oleh kelas anak. 

📌 Sedangkan pada polimorfisme overloading adalah konsep dalam pemrograman berorientasi objek di mana sebuah kelas dapat memiliki beberapa metode dengan nama yang sama tetapi dengan parameter yang berbeda (jumlah atau tipe).

📌 Penggunaan super tidak hanya terbatas pada metode, tetapi juga dapat digunakan untuk mengakses variabel dan konstruktor dari kelas induk. Ini memungkinkan akses ke berbagai elemen kelas induk, tidak hanya metode.

## Note

Buat contekan aja biar gak lupa.
