public class Bubnjar extends Muzicar {
    int telesnaMasa;
    long kolicinaAlkohola;

    public Bubnjar(int telesnaMasa, long kolicinaAlkohola, int brojGodina) {
        super(brojGodina);
        this.telesnaMasa = telesnaMasa;
        this.kolicinaAlkohola = kolicinaAlkohola;
    }

    public int getTelesnaMasa() {
        return telesnaMasa;
    }

    public void setTelesnaMasa(int telesnaMasa) {
        this.telesnaMasa = telesnaMasa;
    }

    public long getKolicinaAlkohola() {
        return kolicinaAlkohola;
    }

    public void setKolicinaAlkohola(long kolicinaAlkohola) {
        this.kolicinaAlkohola = kolicinaAlkohola;
    }

    @Override
    public String toString() {
        return this.getKolicinaAlkohola() + " " + this.getTelesnaMasa() + " " + this.getBrojGodina();
    }
}
