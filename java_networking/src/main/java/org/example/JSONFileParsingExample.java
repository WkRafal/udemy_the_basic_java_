package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONFileParsingExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader(new File("example.json")));

        StringBuffer buf = new StringBuffer();

        String str;
        while ((str = br.readLine()) != null) {
            buf.append(str);
        }
        String jsonStr = buf.toString();
        System.out.println(jsonStr);

        JSONObject json = new JSONObject(jsonStr);

        JSONObject company = json.getJSONObject("company");
        System.out.println("company name: " + company.getString("name"));

        JSONArray arr = company.getJSONArray("products");
        for (int i = 0; i < arr.length(); i++) {
            System.out.println("product: " + arr.getString(i));
        }
    }
}
