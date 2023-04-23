import punk.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PunkBand band = new PunkBand();

        try {
            FileReader fileReader = new FileReader("punk.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            Basista basista = new Basista(Integer.parseInt(reader.readLine()), (byte) Integer.parseInt(reader.readLine()));
            Gitarista gitarista = new Gitarista(reader.readLine(), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
            Pevac pevac = new Pevac(reader.readLine(), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
            Bubnjar bubnjar = new Bubnjar(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));

            band.evidentiraj(basista);
            band.evidentiraj(gitarista);
            band.evidentiraj(pevac);
            band.evidentiraj(bubnjar);

            band.vodjaBenda();

            reader.close();
        } catch(IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
