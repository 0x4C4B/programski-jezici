import nft.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Galerija<NFT> galerija = new Galerija<NFT>();

        try {
            FileReader fileReader = new FileReader("nft.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            Fajl fajl = new Fajl(Integer.parseInt(reader.readLine()), reader.readLine(), reader.readLine(), Integer.parseInt(reader.readLine()));
            Slika slika = new Slika(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), reader.readLine());
            Pesma pesma = new Pesma(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), reader.readLine(), Integer.parseInt(reader.readLine()));

            galerija.Dodaj(fajl);
            galerija.Dodaj(slika);
            galerija.Dodaj(pesma);

            galerija.dajNajveci();
            reader.close();
        } catch(IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
