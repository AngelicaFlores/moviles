package mx.ipn.cic.geo.images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;
import java.util.Random;

//
public class MainActivity extends AppCompatActivity {
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Quitar la barra de la app.
        Objects.requireNonNull(getSupportActionBar()).hide();
        rand =  new Random();
    }

    // Escribir el código para cambiar la imagen.
    public void onClickButton(View view) {
        ImageView imageView = this.findViewById(R.id.imageViewFondo);
        String strImageTag = imageView.getTag().toString();

        int int_random = rand.nextInt(4)+1;
        System.out.println(int_random);
        String prueba = ""+int_random;
        Log.d("imagen", prueba);
        if(int_random==1) {
            imageView.setImageDrawable(getDrawable(R.drawable.imagen_1));
            imageView.setTag("imagen_1");
        }
        else if(int_random==2){
            imageView.setImageDrawable(getDrawable(R.drawable.imagen_2));
            imageView.setTag("imagen_2");}
        else if(int_random==3) {
            imageView.setImageDrawable(getDrawable(R.drawable.imagen_3));
            imageView.setTag("imagen_3");
        }
        else {
            imageView.setImageDrawable(getDrawable(R.drawable.imagen_4));
            imageView.setTag("imagen_4");
        }

      /*
      if (strImageTag.compareTo("imagen_1") == 0) {
         imageView.setImageDrawable(getDrawable(R.drawable.imagen_2));
         imageView.setTag("imagen_2");
      }
      else
      {
         imageView.setImageDrawable(getDrawable(R.drawable.imagen_1));
         imageView.setTag("imagen_1");
      }*/

    }
}