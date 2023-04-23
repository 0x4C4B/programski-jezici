public abstract class Muzicar implements Comparable<Muzicar> {
    private int brojGodina;

    public Muzicar(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public int getBrojGodina() {
        return this.brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    @Override
    public int compareTo(Muzicar other) {
        return this.brojGodina - other.brojGodina;
    }
}
