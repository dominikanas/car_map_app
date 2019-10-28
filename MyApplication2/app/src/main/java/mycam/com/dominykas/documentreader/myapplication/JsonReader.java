package mycam.com.dominykas.documentreader.myapplication;


import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

class ReadJsonFIle extends AsyncTask<String,Integer,Void> {

    protected Void doInBackground(String...params) {
        URL url;

        try {
            StringBuilder text = new StringBuilder();
            //create url object to point to the file location on internet
            url = new URL(params[0]);
            //make a request to server
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            //get InputStream instance
            InputStream is = con.getInputStream();
            //create BufferedReader object
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            //read content of the file line by line

            while ((line = br.readLine()) != null) {
                text.append(line);

            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
            //close dialog if error occurs
        }

        return null;
    }
}