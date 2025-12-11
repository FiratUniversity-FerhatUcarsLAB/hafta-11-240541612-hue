public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
/*
STACK DIAGRAM (ping() ilk çağrıldığında):

------------------------
|      ping()          |
------------------------
|      baffle()        |
------------------------
|      zoop()          |
------------------------
|      main()          |
------------------------

PROGRAM OUTPUT:

No, I wug.
You wugga wug.
I wug.
*/
