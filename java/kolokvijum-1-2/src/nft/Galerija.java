package nft;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Galerija <T extends NFT> {
    /*―――――――――――――――――――――――――――――――――――――――*
     * Nije moguce implentirati obican array koji je genericnog tipa.
     *             ❖ Treba proveriti kod asistenta ❖
     *―――――――――――――――――――――――――――――――――――――――*/
    private ArrayList<T> tokeni;

    public void Dodaj(T token) {
        try {
            /*―――――――――――――――――――――――――――――――――――――――*
             * Nije moguce pristupiti metodi getCena() zato je kod <T> dodato
             * <T extends NFT>. Ova solucija ogranicava klasu galerija da
             * radi samo sa klasama koje su izvedene iz osnovne klase NFT.
             *             ❖ Treba proveriti kod asistenta ❖
             *―――――――――――――――――――――――――――――――――――――――*/
            if (token.getCena() == 0) {
                throw new BesplatanNFT("Cena je 0");
            }

            if (this.tokeni == null) {
                this.tokeni = new ArrayList<T>();
            }

            this.tokeni.add(token);
        } catch (BesplatanNFT exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void dajNajveci() {
        this.tokeni.sort(null);

        System.out.println(this.tokeni.get(this.tokeni.size() - 1).toString());

        try {
            var fileStream = new FileOutputStream("16932.bin");
            BufferedOutputStream stream = new BufferedOutputStream(fileStream);
            stream.write(this.tokeni.get(this.tokeni.size() - 1).getCena());
            stream.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    /*―――――――――――――――――――――――――――――――――――――――*
     * Nije moguce implentirati custom exception BesplatanNFT
     * kao podklasu genericke klase. Zato se implementacija nalazi
     * u fajlu BesplatanNFT.java.
     *―――――――――――――――――――――――――――――――――――――――*/
}

