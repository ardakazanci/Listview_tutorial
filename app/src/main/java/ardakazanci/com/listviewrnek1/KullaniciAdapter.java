package ardakazanci.com.listviewrnek1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ardakazanci on 9.03.2018.
 */

public class KullaniciAdapter extends BaseAdapter {


    List<KullaniciModel> list;
    Context context;

    public KullaniciAdapter(List<KullaniciModel> list, Context context) {

        this.list = list;
        this.context = context;

    }

    @Override
    public int getCount() {
        return list.size(); // Boyut değeri - Kaç tane eleman var.
    }

    @Override
    public Object getItem(int i) {
        return list.get(i); // Pozisyon değeri

    }

    @Override
    public long getItemId(int i) {
        return 0; // Bu örnekte değiştirilmiyor.
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View layout = LayoutInflater.from(context).inflate(R.layout.layout, viewGroup, false);
        TextView kullaniciAD = layout.findViewById(R.id.kullaniciAD);
        TextView kullaniciEMAIL = layout.findViewById(R.id.kullaniciEMAIL);
        TextView kullaniciYAS = layout.findViewById(R.id.kullaniciYAS);
        TextView kullaniciCINSIYET = layout.findViewById(R.id.kullaniciCINSIYET);
        kullaniciAD.setText(list.get(i).getKullaniciAd());
        kullaniciEMAIL.setText(list.get(i).getKullaniciEmail());
        kullaniciCINSIYET.setText(list.get(i).getKullaniciCinsiyet());
        kullaniciYAS.setText(list.get(i).getKullaniciYas());


        return layout;
    }
}
