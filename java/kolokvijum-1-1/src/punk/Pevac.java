package punk;

public class Pevac extends Muzicar {
    int rasponGlasa;
    int koeficijentAktivnosti;
    String scenskoIme;

    public Pevac(String scenskoIme, int brojGodina, int rasponGlasa, int koeficijentAktivnosti) {
        super(brojGodina);
        this.rasponGlasa = rasponGlasa;
        this.koeficijentAktivnosti = koeficijentAktivnosti;
        this.scenskoIme = scenskoIme;
    }

    public int getRasponGlasa() {
        return this.rasponGlasa;
    }

    public void setRasponGlasa(int rasponGlasa) {
        this.rasponGlasa = rasponGlasa;
    }

    public int getKoeficijentAktivnosti() {
        return this.koeficijentAktivnosti;
    }

    public void setKoeficijentAktivnosti(int koeficijentAktivnosti) {
        this.koeficijentAktivnosti = koeficijentAktivnosti;
    }

    public String getScenskoIme() {
        return this.scenskoIme;
    }

    public void setScenskoIme(String scenskoIme) {
        this.scenskoIme = scenskoIme;
    }

    @Override
    public String toString() {
        return this.getScenskoIme() + " " + this.getRasponGlasa() + " " + this.getKoeficijentAktivnosti() + " " + this.getBrojGodina();
    }
}
