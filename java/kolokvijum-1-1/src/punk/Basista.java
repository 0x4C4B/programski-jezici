package punk;

public class Basista extends Muzicar {
    byte brojTonova;

    public Basista(int brojGodina, byte brojTonova) {
        super(brojGodina);
        this.brojTonova = brojTonova;
    }

    public byte getBrojTonova() {
        return brojTonova;
    }

    public void setBrojTonova(byte brojTonova) {
        this.brojTonova = brojTonova;
    }

    @Override
    public String toString() {
        return this.getBrojTonova() + " " + this.getBrojGodina();
    }
}
