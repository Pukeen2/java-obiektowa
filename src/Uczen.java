public class Uczen extends Osoba{
    private int numer;
    private static int liczbaUczniow = 0;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow+=1;
        this.numer = liczbaUczniow;
    }

}
