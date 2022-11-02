package j24_AccessModifier.farkliPackage;

import j24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier{

        private String privateTeamLead = "Hakan Aydin";
        String defaultName = "Cebrail Bey";
        protected String protectedName= "Dilek Hanim";
        public String publicName = "Gamze Baki";

    public static void main(String[] args) {
        C01_AccessModifier obj1 = new C01_AccessModifier(24,35);
        System.out.println("obj1.publicYas = " + obj1.publicYas);
      //  obj1.protectedMethod()
        // package disi protected method veya deger call edilemez

    }
}
