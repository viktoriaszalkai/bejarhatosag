package hu.szamalk.modell;

public class Auto {
    private String rsz;

    public Auto(String rsz) {
        this.rsz = rsz;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rsz='" + rsz + '\'' +
                '}';
    }
}
