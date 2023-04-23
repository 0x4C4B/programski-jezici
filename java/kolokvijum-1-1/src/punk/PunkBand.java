package punk;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PunkBand {
    private ArrayList<Muzicar> muzicari;

    public PunkBand() {
        muzicari = new ArrayList<Muzicar>();
    }

    public void evidentiraj(Muzicar muzicar) {
        try {
            if (muzicar.getBrojGodina() < 0) {
                throw new Antimaterija("Negativan broj godina");
            }
            muzicari.add(muzicar);
        } catch (Antimaterija exception) {
            System.out.println(exception.toString());
        }
    }

    public void vodjaBenda() {
        muzicari.sort(null);
        Muzicar target = muzicari.get(muzicari.size() - 1);
        System.out.println(target.toString());

        try {
            FileOutputStream fileStream = new FileOutputStream("16932.bin");
            BufferedOutputStream stream = new BufferedOutputStream(fileStream);
            stream.write(target.getBrojGodina());
            stream.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static class Antimaterija extends Exception {
        public Antimaterija(String info) {
            super(info);
        }
    }
}
