import java.util.Scanner; // Kullanıcıdan veri almak için gerekli kütüphane

       class DatePrinterInput {

    public static void main(String[] args) {
        // Scanner nesnesini oluşturuyoruz
        Scanner input = new Scanner(System.in);

        // 1. Kullanıcıdan Günü (Day) isteme
        System.out.print("Lütfen günü giriniz (Örnek: persembe): ");
        String day = input.nextLine();

        // 2. Kullanıcıdan Ayı (Month) isteme
        System.out.print("Lütfen ayı giriniz (Örnek: AralıK): ");
        String month = input.nextLine();

        // 3. Kullanıcıdan Ayın Gününü (Date) isteme
        System.out.print("Lütfen ayın gününü giriniz (Örnek: 16): ");
        int date = input.nextInt();

        // 4. Kullanıcıdan Yılı (Year) isteme
        System.out.print("Lütfen yılı giriniz (Örnek: 2005): ");
        int year = input.nextInt();

        System.out.println("Amerikan Formatı:");
        printAmerican(day, date, month, year);

        // Avrupa formatında yazdırma
        System.out.println("Avrupa Formatı:");
        printEuropean(day, date, month, year);

        // Scanner'ı kapat
        input.close();
    }

    // Amerikan Formatı: Day, Month Date, Year
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formatı: Date Month Year, Day
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }
}
