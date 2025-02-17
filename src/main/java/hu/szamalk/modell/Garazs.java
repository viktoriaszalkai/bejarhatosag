package hu.szamalk.modell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Garazs implements Iterable {
    private LinkedList<Auto> autok;

    public Garazs() {
        autok = new LinkedList<>(); // elfedtem a listra reprezentációját? valamilyen lista-> sokkal rugalmasabb
        autok.add(new Auto("abc123"));
        autok.add(new Auto("def456"));
        autok.add(new Auto("ghi789"));
        autok.add(new Auto("jkl101"));
        autok.add(new Auto("mno102"));

    }

    @Override
    public String toString() {
        return "Garazs{" +
                "autok=" + autok +
                '}';
    }

    public List<Auto> getAutok() {
        return new ArrayList<>(autok);
    }

    @Override
    public Iterator<Auto> iterator() {
        return autok.iterator();
    } // iteratorral lehet bejárás közben törölni/hozzáadni/módosítani
}
