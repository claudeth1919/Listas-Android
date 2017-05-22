package mx.anahuac.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Tiendas extends AppCompatActivity {
    int [] IMAGES = {R.drawable.meras, R.drawable.ooxo, R.drawable.piti};
    String [] NAMES = {"Meraz","Oxxo","Piticó"};
    String [] DESCRIPTIONS = {"Dirección: Av. Jorge L Tamayo Castillejos 502, Agencia Candiani, 68130 Oaxaca, Oax.",
            "Cinemex es una empresa mexicana dedicada al desarrollo y operación de complejos múltiples de exhibición cinematográfica surgida en 1988.",
            "Bldv. Guadalupe Hinojosa Km 3.5, Cabecera Municipal Santa Cruz Xoxocotlan, 71230 Santa Cruz Xoxocotlán, Oax."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView= (ListView) findViewById(R.id.listView);
        Tiendas.CustomAdapter customAdapter = new Tiendas.CustomAdapter();
        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView=(ImageView) view.findViewById(R.id.imagenView);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) view.findViewById(R.id.textView_description);
            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);
            return view;
        }
    }
}
