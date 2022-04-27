package com.example.readjsonfromfiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "==>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String json = readFile("mountains.json");
        Log.d(TAG, json);

    // Create GSON object to perform marshall/unmarshall operations
        Gson gson = new Gson();


    // Unmarshall JSON -> list of objects
        Type type = new TypeToken<List<mountain>>() {}.getType();
        List<mountain> listOfMountains = gson.fromJson(json, type);
        Log.d(TAG, "Number of elements"+listOfMountains.size());
        Log.d(TAG, "Element 8"+listOfMountains.get(0).toString());
    }
    @SuppressWarnings("SameParameterValue")
    private String readFile(String fileName) { //en metod som läser filer i assets mappen
        try {
            //noinspection CharsetObjectCanBeUsed
            return new Scanner(getApplicationContext().getAssets().open(fileName), Charset.forName("UTF-8").name()).useDelimiter("\\A").next();
        } catch (IOException e) {
            Log.e(TAG, "Could not read file: " + fileName);
            return null;
        }
    }
}