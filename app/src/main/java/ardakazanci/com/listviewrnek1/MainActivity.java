package ardakazanci.com.listviewrnek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<KullaniciModel> kullaniciList;
    KullaniciAdapter adapter;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewElemanlari();
        listeyiDoldur();

    }

    public void listeyiDoldur() {

        kullaniciList = new ArrayList<>();
        KullaniciModel k1 = new KullaniciModel("ardakazanci", "ardakazanci@anadolu.edu.tr", "26", "Erkek");
        KullaniciModel k2 = new KullaniciModel("ba1", "ba1@gmail.com", "23", "Kadın");
        KullaniciModel k3 = new KullaniciModel("cb1", "cb1@yahoo.com", "43", "Erkek");
        KullaniciModel k4 = new KullaniciModel("dc1", "dc1@gmail.com", "34", "Kadın");

        kullaniciList.add(k1);
        kullaniciList.add(k2);
        kullaniciList.add(k3);
        kullaniciList.add(k4);

        adapter = new KullaniciAdapter(kullaniciList, this);
        listView.setAdapter(adapter);


    }

    public void viewElemanlari() {


        listView = findViewById(R.id.listview);

    }
}
