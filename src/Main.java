public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Maciej", 18);
        System.out.println(uczen1.toString());
        System.out.println(Uczen.getLiczbaUczniow());
        Uczen uczen2 = new Uczen("Wojciech", 18);
        System.out.println(uczen2.toString());
        System.out.println(Uczen.getLiczbaUczniow());
        Uczen uczen3 = new Uczen("Igor", 15);
        System.out.println(uczen3.toString());
        System.out.println(Uczen.getLiczbaUczniow());
    }
}