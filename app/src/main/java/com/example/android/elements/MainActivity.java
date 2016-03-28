package com.example.android.elements;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final int EARTH = 0;
    final int FIRE = 1;
    final int WATER = 2;
    final int AIR = 3;

    String[] elementName= {"Earth", "Fire", "Water", "Air"};

    private static final String[] ELEMENT_TITLE = {"Earth (solid)","Fire (plasma)", "Water (liquid)", "Air (gas)"};
    private final String[] ELEMENT_DESCRIPTION = {
//            this.getString(R.string.earth_represents),
            "Earth represents things that are solid.",
            "Fire represents things that destroy.",
            "Water represents things that are liquid.",
            "Air or Wind represents things that move."};
    private static final String[] CHARACTERISTICS = {
            "Dry and cold.",
            "Hot and dry.",
            "Cold and wet.",
            "Wet and hot."};
    private static final String [] ELEMENT = {
            "Earth (Melancholic)",
            "Fire (Choleric)",
            "Water (Phlegmatic)",
            "Air (Sanguine)"};
    private static final String [] POSITIVE_CHARACTERISTICS = {
            "consistency, conscientiousness, perseverance, punctuality, caution, resistance, responsibility, carefulness, firmness, reliability, sobriety, ambition, respectfulness, matter-of-factness...",
            "vigorousness, zeal, enthusiasm, courage, decisiveness, power of creativity, daring, sedulity...",
            "understanding, placidity, mildness, trusting nature, devotion, mercy, forgiveness, modesty, compassion, fervor, pliancy, meditativeness, internalization...",
            "vigilance, care-freedom, kind-heartedness, trusting nature, clarity, lightness, independency, dexterity, optimism, diligence, acuity, joy, smiling..."};
    private static final String [] NEGATIVE_CHARACTERISTICS = {
            "stuffiness, superficiality, laziness, indifference, cumbersomeness, touchiness, lack of conscientiousness, irregularity, timidity, scornfulness...",
            "quarrelsomeness, irritability, urge to destroy everything, passion, immoderacy, jealousy, voraciousness, vindictiveness, violence, hate, anger, sudden ebullition...",
            "indifference, heartlessness, laziness, indolence, rigidity, lack of daring, lack of concern, unstableness, dejection...",
            "lack of perseverance, dishonesty, gossipy, cunningness, backbiting, garrulousness, inconstancy, touchiness, prodigality..."};

    int activeElement = EARTH;

    /**
     * Called when the EARTH Element button is clicked.
     */
    public void clickEarth(View view) {
        activeElement = EARTH;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(ELEMENT_TITLE[EARTH]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(ELEMENT_DESCRIPTION[EARTH]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(CHARACTERISTICS[EARTH]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of " + ELEMENT[EARTH]);
        status_text_view.setBackgroundColor(Color.parseColor("#FFA726"));

        System.out.println("my string is");
        System.out.println(POSITIVE_CHARACTERISTICS.length);
        System.out.println(POSITIVE_CHARACTERISTICS);
        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(POSITIVE_CHARACTERISTICS[EARTH]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(NEGATIVE_CHARACTERISTICS[EARTH]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.earth3);
    }

    /**
     * Called when the FIRE Element button is clicked.
     */
    public void clickFire(View view) {
        activeElement = FIRE;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(ELEMENT_TITLE[FIRE]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(ELEMENT_DESCRIPTION[FIRE]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(CHARACTERISTICS[FIRE]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of " + ELEMENT[FIRE]);
        status_text_view.setBackgroundColor(Color.parseColor("#F44336"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(POSITIVE_CHARACTERISTICS[FIRE]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(NEGATIVE_CHARACTERISTICS[FIRE]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.fire3);
    }

    /**
     * Called when the WATER Element button is clicked.
     */
    public void clickWater(View view) {
        activeElement = WATER;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(ELEMENT_TITLE[WATER]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(ELEMENT_DESCRIPTION[WATER]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(CHARACTERISTICS[WATER]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of "  + ELEMENT[WATER]);
        status_text_view.setBackgroundColor(Color.parseColor("#03A9F4"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(POSITIVE_CHARACTERISTICS[WATER]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(NEGATIVE_CHARACTERISTICS[WATER]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.water);
    }

    /**
     * Called when the AIR Element button is clicked.
     */
    public void clickAir(View view) {
        activeElement = AIR;
        TextView status_text_view = (TextView) findViewById(R.id.element_text_view);
        status_text_view.setText(ELEMENT_TITLE[AIR]);

        status_text_view = (TextView) findViewById(R.id.elementdescription_text_view);
        status_text_view.setText(ELEMENT_DESCRIPTION[AIR]);

        status_text_view = (TextView) findViewById(R.id.element_characteristics_text_view);
        status_text_view.setText(CHARACTERISTICS[AIR]);

        status_text_view = (TextView) findViewById(R.id.element_name_text_view);
        status_text_view.setText("The element of " + ELEMENT[AIR]);
        status_text_view.setBackgroundColor(Color.parseColor("#C6FF00"));

        status_text_view = (TextView) findViewById(R.id.positive_characteristics_text_view);
        status_text_view.setText(POSITIVE_CHARACTERISTICS[AIR]);

        status_text_view = (TextView) findViewById(R.id.negative_characteristics_text_view);
        status_text_view.setText(NEGATIVE_CHARACTERISTICS[AIR]);

        ImageView element_image_view = (ImageView) findViewById(R.id.element_image_view);
        element_image_view.setImageResource(R.drawable.air);
    }

        public void sendIt(View view) {
//        //Find the Element name
            String ans = elementName[activeElement];
            ans += "\n"+ELEMENT_TITLE[activeElement]+
                    "\n"+ELEMENT_DESCRIPTION[activeElement]+
                    "\n CHARACTERISTICS:"+
                    "\n"+CHARACTERISTICS[activeElement]+
                    "\n POSITIVE QUALITIES:"+
                    "\n"+POSITIVE_CHARACTERISTICS[activeElement]+
                    "\n NEGATIVE QUALITIES:"+
                    "\n"+NEGATIVE_CHARACTERISTICS[activeElement];

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
