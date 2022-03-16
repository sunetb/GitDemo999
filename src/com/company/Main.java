package com.company;

public class Main {

    public static void main(String[] args) {

        String hemmeligtOrd = "Sune";
        String brugteBogstaver = "";

        String brugerensGæt = gæt();

        boolean findes = hemmeligtOrd.contains(brugerensGæt);
        int index = hemmeligtOrd.indexOf("k");
        brugteBogstaver += brugerensGæt;
        System.out.println(index);

        int antal = antalForekomster(hemmeligtOrd, "k");
        System.out.println(antal);
    }

    private static String gæt() {
        return "ø";
    }

    //Demo: indexOf
    static int antalForekomster (String ord, String bogstav){
        int ix = 0;
        int antal = 0;
        while ((ix = ord.indexOf(bogstav, ix)) != -1) {//Tildeling OG sammenligning på én gang!
            antal++;
            ix++;
            System.out.println("hop "+ix);
        }
        System.out.println("Antal "+bogstav + "'er: "+antal);
        return antal;
    }


}
