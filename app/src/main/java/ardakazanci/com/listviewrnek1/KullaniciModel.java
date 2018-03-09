package ardakazanci.com.listviewrnek1;

/**
 * Created by ardakazanci on 9.03.2018.
 */

public class KullaniciModel {

    String kullaniciAd;
    String kullaniciEmail;
    String kullaniciYas;
    String kullaniciCinsiyet;


    public KullaniciModel(String kullaniciAd, String kullaniciEmail, String kullaniciYas, String kullaniciCinsiyet) {
        this.kullaniciAd = kullaniciAd;
        this.kullaniciEmail = kullaniciEmail;
        this.kullaniciYas = kullaniciYas;
        this.kullaniciCinsiyet = kullaniciCinsiyet;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciEmail() {
        return kullaniciEmail;
    }

    public void setKullaniciEmail(String kullaniciEmail) {
        this.kullaniciEmail = kullaniciEmail;
    }

    public String getKullaniciYas() {
        return kullaniciYas;
    }

    public void setKullaniciYas(String kullaniciYas) {
        this.kullaniciYas = kullaniciYas;
    }

    public String getKullaniciCinsiyet() {
        return kullaniciCinsiyet;
    }

    public void setKullaniciCinsiyet(String kullaniciCinsiyet) {
        this.kullaniciCinsiyet = kullaniciCinsiyet;
    }
}
