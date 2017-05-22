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

public class Bares extends AppCompatActivity {
    int [] IMAGES = {R.drawable.bare, R.drawable.macc, R.drawable.rosa};
    String [] NAMES = {"Barezzito","McCarthy's Irish Pub","Rosarito"};
    String [] DESCRIPTIONS = {"Dirección: 68050, Av Belisario Domínguez 322, Reforma, Oaxaca, Oax.",
            "Una variedad de cervezas y platillos internacionales en un lugar festivo con escenario para música en vivo",
            "Dirección: Avenida Belisario Domínguez 322, Interior S/N, 68050 Oaxaca, OAX"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView= (ListView) findViewById(R.id.listView);
        Bares.CustomAdapter customAdapter = new Bares.CustomAdapter();
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
