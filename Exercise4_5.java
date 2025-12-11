/*
240541612
Amr Mohammed 
11.12.2025
 */
public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
/*
1) zoop metodu ikinci kez çağrıldığında Stack Diagram:

------------------------------
|   zoop("breakfast ", 4)    |
------------------------------
|        clink(4)            |
------------------------------
|        main()              |
------------------------------


2) Programın ürettiği tam çıktı:

just for
any not more 
It's breakfast 
!

*/
