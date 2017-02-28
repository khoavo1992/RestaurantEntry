package com.example.khoa.restaurantentry;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class addRestaurant extends AppCompatActivity implements OnClickListener {
    private static final int RESULT_LOAD_IMAGE = 1;
    private ListView lvRestaurant;
    ImageView getImage;
    Button btnSubmit;
    EditText restName, cityName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_restaurant);

        lvRestaurant = (ListView)findViewById(R.id.listRestaurant);

        List<restaurantData> listRest = new ArrayList<restaurantData>();
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.getImage:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI); //Allow the gallery to be opened
                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnSubmit:
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && data != null) //make sure to receive result from gallery
        {
            Uri selectedImage = data.getData(); //Get the uri, allows to prefer back to the image
            getImage.setImageURI(selectedImage); //display the image
        }
    }

}
