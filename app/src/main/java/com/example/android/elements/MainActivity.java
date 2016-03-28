package com.example.android.elements;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeProperties(savedInstanceState);
    }

    protected void initializeProperties(Bundle savedInstanceState){
        elementTitle [0] = getResources().getString(R.string.earth_title);
        elementTitle [1] = getResources().getString(R.string.fire_title);
        elementTitle [2] = getResources().getString(R.string.water_title);
        elementTitle [3] = getResources().getString(R.string.air_title);
        elementDescription [0] = getResources().getString(R.string.earth_represents);
        elementDescription [1] = getResources().getString(R.string.fire_represents);
        elementDescription [2] = getResources().getString(R.string.water_represents);
        elementDescription [3] = getResources().getString(R.string.air_represents);
        characteristics [0] = getResources().getString(R.string.earth_characteristic);
        characteristics [1] = getResources().getString(R.string.fire_characteristic);
        characteristics [2] = getResources().getString(R.string.water_characteristic);
        characteristics [3] = getResources().getString(R.string.air_characteristic);
        element [0] = getResources().getString(R.string.melancholic);
        element [1] = getResources().getString(R.string.choleric);
        element [2] = getResources().getString(R.string.flegmatic);
        element [3] = getResources().getString(R.string.sanguine);
        positiveCharacteristics [0] = getResources().getString(R.string.earth_positive_qualities);
        positiveCharacteristics [1] = getResources().getString(R.string.fire_positive_qualities);
        positiveCharacteristics [2] = getResources().getString(R.string.water_positive_qualities);
        positiveCharacteristics [3] = getResources().getString(R.string.air_positive_qualities);
        negativeCharacteristics [0] = getResources().getString(R.string.earth_negative_qualities);
        negativeCharacteristics [1] = getResources().getString(R.string.fire_negative_qualities);
        negativeCharacteristics [2] = getResources().getString(R.string.water_negative_qualities);
        negativeCharacteristics [3] = getResources().getString(R.string.air_negative_qualities);
    }

    final int EARTH = 0;
    final int FIRE = 1;
    final int WATER = 2;
    final int AIR = 3;

    String[] elementName= {"Earth", "Fire", "Water", "Air"};

    private String[] elementTitle = new String[4];
    private String[] elementDescription = new String[4];
    /*
            "Earth represents things that are solid.",
            "Fire represents things that destroy.",
            "Water represents things that are liquid.",
            "Air or Wind represents things that move."};
   */
    private static final String[] characteristics = new String[4];
    /*
              {"Dry and cold.",
               "Hot and dry.",
               "Cold and wet.",
               "Wet and hot."};
    */
       private static final String [] element = new String[4];
    /*
               {"Earth (Melancholic)",
               "Fire (Choleric)",
               "Water (Phlegmatic)",
               "Air (Sanguine)"};
    */
       private String[] positiveCharacteristics = new String[4];
       /*private static final String [] POSITIVE_CHARACTERISTICS = {
               "consistency, conscientiousness, perseverance, punctuality, caution, resistance, responsibility, carefulness, firmness, reliability, sobriety, ambition, respectfulness, matter-of-factness...",
               "vigorousness, zeal, enthusiasm, courage, decisiveness, power of creativity, daring, sedulity...",
               "understanding, placidity, mildness, trusting nature, devotion, mercy, forgiveness, modesty, compassion, fervor, pliancy, meditativeness, internalization...",
               "vigilance, care-freedom, kind-heartedness, trusting nature, clarity, lightness, independency, dexterity, optimism, diligence, acuity, joy, smiling..."};
       */
    private static final String [] negativeCharacteristics = new String[4];
               /*{
            "stuffiness, superficiality, laziness, indifference, cumbersomeness, touchiness, lack of conscientiousness, irregularity, timidity, scornfulness...",
            "quarrelsomeness, irritability, urge to destroy everything, passion, immoderacy, jealousy, voraciousness, vindictiveness, violence, hate, anger, sudden ebullition...",
            "indifference, heartlessness, laziness, indolence, rigidity, lack of daring, lack of concern, unstableness, dejection...",
            "lack of perseverance, dishonesty, gossipy, cunningness, backbiting, garrulousness, inconstancy, touchiness, prodigality..."};
*/
    int activeElement = EARTH;

    /**
     * Called when the EARTH Element button is clicked.
     */
    public void clickEarth(View view) {
        activeElement = EARTH;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(elementTitle[EARTH]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(elementDescription[EARTH]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(characteristics[EARTH]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText(element[EARTH]);
        status_text_view.setBackgroundColor(Color.parseColor("#FFA726"));

        System.out.println("my string is");
        System.out.println(positiveCharacteristics.length);
        System.out.println(positiveCharacteristics);
        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(positiveCharacteristics[EARTH]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(negativeCharacteristics[EARTH]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.earth3);
    }

    /**
     * Called when the FIRE Element button is clicked.
     */
    public void clickFire(View view) {
        activeElement = FIRE;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(elementTitle[FIRE]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(elementDescription[FIRE]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(characteristics[FIRE]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText(element[FIRE]);
        status_text_view.setBackgroundColor(Color.parseColor("#F44336"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(positiveCharacteristics[FIRE]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(negativeCharacteristics[FIRE]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.fire3);
    }

    /**
     * Called when the WATER Element button is clicked.
     */
    public void clickWater(View view) {
        activeElement = WATER;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(elementTitle[WATER]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(elementDescription[WATER]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(characteristics[WATER]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of "  + element[WATER]);
        status_text_view.setBackgroundColor(Color.parseColor("#03A9F4"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(positiveCharacteristics[WATER]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(negativeCharacteristics[WATER]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.water);
    }

    /**
     * Called when the AIR Element button is clicked.
     */
    public void clickAir(View view) {
        activeElement = AIR;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(elementTitle[AIR]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(elementDescription[AIR]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(characteristics[AIR]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of " + element[AIR]);
        status_text_view.setBackgroundColor(Color.parseColor("#C6FF00"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(positiveCharacteristics[AIR]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(negativeCharacteristics[AIR]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.air);
    }

        public void sendIt(View view) {
//        //Find the Element name
            String ans = elementTitle[activeElement];
            ans += "\n"+elementDescription[activeElement]+"\n"+
                    "\nCHARACTERISTICS:"+
                    "\n"+characteristics[activeElement]+"\n"+
                    "\nPOSITIVE QUALITIES:"+
                    "\n"+positiveCharacteristics[activeElement]+"\n"+
                    "\nNEGATIVE QUALITIES:"+
                    "\n"+negativeCharacteristics[activeElement];

//        EditText editText = (EditText) findViewById(R.id.element_text_view);
//        String name = editText.getText().toString();
//
//        String sendMessage = createOrderSummary(price, name, hasWhippedCream, hasChocolad);
        /**
         * This method sents email when the button Send It to Me is submitted.
         */
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Element profile description for " + elementName[activeElement]);
        intent.putExtra(Intent.EXTRA_TEXT, ans);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
