public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

       // 1) Donus degerini kullanmayin -> ne oluyor?
        // getNumber() cagrilir fakat donus degeri (42) kullanilmadigi icin sadece yok sayilir.
        // Program normal calisir, hata vermez.

        getNumber();

       // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // sayHello() void oldugu icin ifade icinde kullanilamaz.
        // System.out.println(sayHello() + 7); yazilirsa derleme hatasi olur:
        // "void cannot be dereferenced"

        // Cevaplarinizi yorum olarak ekleyin.
        
    }
}
