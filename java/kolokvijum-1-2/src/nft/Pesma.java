package nft;

public class Pesma extends NFT {
    private int trajanje;
    private int glasnoca;
    private String tekst;

    public Pesma(int trajanje, int glasnoca, String tekst, int cena) {
        super(cena);
        this.trajanje = trajanje;
        this.glasnoca = glasnoca;
        this.tekst = tekst;
    }

    public int getGlasnoca() {
        return glasnoca;
    }

    public void setGlasnoca(int glasnoca) {
        this.glasnoca = glasnoca;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public String toString() {
        return this.getCena() + " " + this.getGlasnoca() + " " + this.getTrajanje() + " " + this.getTekst();
    }
}
