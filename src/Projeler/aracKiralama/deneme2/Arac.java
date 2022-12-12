package Projeler.aracKiralama.deneme2;

public enum Arac {

        ID1001 ("PEUGEOT_301","ekonomik", "dizel", "manuel", 5, 600, 2500, 207.68),
        ID1002("CITROEN_C_ELYSEE","ekonomik", "dizel", "manuel", 5, 600, 2500, 200.35),
        ID1003("FORD_TOURNEO","ekonomik", "dizel", "manuel", 5, 1500, 2500, 205.66),
        ID1004 ("FIAT_LINEA","ekonomik", "dizel", "manuel", 5, 1200, 2500, 251.68),
        ID1005("RENAULT_CLIO_HB","ekonomik", "benzin", "manuel", 5, 1500, 2500, 182.00),
        ID1006("FIAT_FIERINO","ekonomik", "benzin", " Manuel", 5, 600, 2500, 198.35),
        ID1007 ("FORD_TOURNEO_COURİER","ekonomik", "benzin", " Manuel", 5, 600, 2500, 193.02),
        ID1008("FIAT_LINEAEKO","ekonomik", "benzin", " Manuel", 5, 600, 2500, 193.02),
        ID1009 ("PEUGEOT_2008","luks", "benzin", "otomatik", 5, 1500, 1500, 454.87),
        ID1010 (" HUNDAI_TUSCON","luks", "benzin", "otomatik", 5, 900, 1500, 683.20),
        ID1011(" NISSAN_QASHQAI","luks", "benzin", "otomatik", 5, 1500, 3000, 1155.00),
        ID1012("PEUGEOT_3008","luks", "dizel", "otomatik", 5, 1500, 999, 780.00),
        ID1013("PEUGEOT_EXPERT","minibus", "dizel", "otomatik", 5, 3000, 1200, 1505.92);
        String model;
        String sinif;
        String yakit;
        String vites;
        int koltuk;
        int hizSiniri;
        int depozito;
        double gunlukUcret;
       // Sinif kategori;

        Arac(String model, String sinif, String yakit, String vites, int koltuk, int hizSiniri, int depozito, double gunlukUcret) {
            this.model= model;
            this.sinif = sinif;
            this.yakit = yakit;
            this.vites = vites;
            this.koltuk = koltuk;
            this.hizSiniri = hizSiniri;
            this.depozito = depozito;
            this.gunlukUcret = gunlukUcret;
        }

        @Override
        public String toString() {
            return "Arac{" +
                    "model='" + model + '\'' +
                    ", sinif='" + sinif + '\'' +
                    ", yakit='" + yakit + '\'' +
                    ", vites='" + vites + '\'' +
                    ", koltuk=" + koltuk +
                    ", hizSiniri=" + hizSiniri +
                    ", depozito=" + depozito +
                    ", gunlukUcret=" + gunlukUcret +
                    '}';
        }

        public String getSinif() {
            return sinif;
        }

        public String getYakit() {
            return yakit;
        }

        public String getVites() {
            return vites;
        }

        public int getKoltuk() {
            return koltuk;
        }

        public int getHizSiniri() {
            return hizSiniri;
        }

        public int getDepozito() {
            return depozito;
        }

        public double getGunlukUcret() {
            return gunlukUcret;
        }
    }



