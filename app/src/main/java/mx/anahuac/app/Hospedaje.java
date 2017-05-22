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

public class Hospedaje extends AppCompatActivity {
    int [] IMAGES = {R.drawable.fiest, R.drawable.fort, R.drawable.one};
    String [] NAMES = {"Fiesta inn","Fortin Plaza","One Hoteles"};
    String [] DESCRIPTIONS = {"McDonald's es una cadena de restaurantes de comida rápida.",
            "Es una franquicia de restaurantes de comida rápida especializada en pollo frito",
            "Es una empresa estadounidense de restaurantes de comida rápida"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospedaje);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ListView listView= (ListView) findViewById(R.id.listView);
        Hospedaje.CustomAdapter customAdapter = new Hospedaje.CustomAdapter();
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
