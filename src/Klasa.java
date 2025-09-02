import java.sql.Array;
import java.util.ArrayList;

public class Klasa {
    public Nauczyciel wychowawca;
    public ArrayList<Uczen> uczniowie;

    public Klasa(Nauczyciel wychowawca) {
        this.wychowawca = wychowawca;
        this.uczniowie = new ArrayList<Uczen>();
    }
    public void addStudent(Uczen uczen) {
        uczniowie.add(uczen);
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
