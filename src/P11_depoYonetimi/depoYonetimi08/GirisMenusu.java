package P11_depoYonetimi.depoYonetimi08;

import javax.swing.*;

public class GirisMenusu {

    //Arayüzün create işlemleri yapıldı. Buradaki işlemlerden yararlanmak istiyorsanız: https://www.youtube.com/watch?v=rwksn-BkSpA&t=20s
    // Arayüz kullanmak başta zahmete yol açsa da birçok gereksiz ayrıntı ile uğraşmamaya yardımcı oluyor.
    //Bu projede kod arayüz kapatılınca sona eriyor.



    public static void main(String[] args) {

        girisMenusu();

    }
        static void girisMenusu() {


        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AnaMenu frame=new AnaMenu();

                frame.setVisible(true);

            }
        });




    }


}
