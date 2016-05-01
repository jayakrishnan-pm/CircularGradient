package circulargradient.devdeeds.com.circulargradient;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        View layout = findViewById(R.id.wrapper);  // root view

        GradientDrawable g = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{getResources().getColor(R.color.primary_grad_start),  //#fff this is the start color of gradient
                getResources().getColor(R.color.primary_grad_end)}); //#97712F this is the end color of gradient
        g.setGradientType(GradientDrawable.RADIAL_GRADIENT); // making it circular gradient
        g.setGradientRadius(100);  // radius of the circle

        int sdk = android.os.Build.VERSION.SDK_INT;

        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            layout.setBackgroundDrawable(g);
        } else {
            layout.setBackground(g);
        }
    }
}
