public class Uczen extends Osoba{
    private int numer;
    private static int liczbaUczniow = 0;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);
        liczbaUczniow+=1;
        numer = liczbaUczniow;
    }

    public static int getLiczbaUczniow() {
        return liczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        Uczen.liczbaUczniow = liczbaUczniow;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
    @Override
    public String toString() {
        return "Uczeń: " +
                "imie = '" + getImie() + '\'' +
                ", wiek = " + getWiek() +
                ", numer = " + numer;
    }

}
