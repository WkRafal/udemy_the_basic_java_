package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

public class JSONExchangeRatesExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.exchangeratesapi.io/latest?base=USD");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        if (connection.getResponseCode() != 200) {
            System.out.println("not 200 response");
            return;
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        String str;
        StringBuffer stringBuffer = new StringBuffer();

        while ((str = reader.readLine()) != null) {
            stringBuffer.append(str);
        }

        String jsonStr = stringBuffer.toString();
        System.out.println(jsonStr);

        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONObject rates = jsonObject.getJSONObject("rates");
        String dateSTR = jsonObject.getString("date");
        System.out.println("rates date: " + dateSTR);
        System.out.println("base: " + jsonObject.getString("base"));

        Map<String, Object> objMap = rates.toMap();

        objMap.forEach((k, v) ->System.out.println(k + " : " + v));

        reader.close();
    }
}
