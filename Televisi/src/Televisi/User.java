package Televisi;

/**
 *
 * @author Ali Imron Saefullah
 */
public class User {

 
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("TV , 40 inches", 100);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR",
                                 "NET TV", "MOLA TV", "TRANS TV",
                                 "MNCTV", "TV 7", "TVRI", "TV G", "AN TV"};
        String[] channelFavorit = {"RCTI","NET TV", "MOLA TV", "TRANS TV",
                                 "MNCTV", "TV 7", "TV G", };

        System.out.println("Pak RT, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannel);

        tv.setChannelAktif(3);
        tv.setVolume(70);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
    }
    

