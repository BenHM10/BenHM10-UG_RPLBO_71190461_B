package om.ug11.kalkulasipersentase;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String args[]) {
        String s = "Saham #BBRI naik sebanyak 4.25% disusul dengan saham #BBCA yang naik sebanyak 1.25%";
        ArrayList<Float> f = new ArrayList<Float>();
        Pattern pat = Pattern.compile("[-]?[0-9]*\\.?[0-9]+");
        Matcher m = pat.matcher(s);
        while (m.find()) {
            f.add(Float.parseFloat(m.group()));
        }
        System.out.println("Rincian perhitungan: ");
        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.get(i));
        }
    }
}
