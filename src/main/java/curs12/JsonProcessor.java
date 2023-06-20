package curs12;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/*
{
name : "ceva"  // chei - valori
},
{

}
 */
public class JsonProcessor {

    @SuppressWarnings("unchecked")
    public void writeJson() {
        JSONObject obj = new JSONObject();
        //JSONObject = perechea de acolade
        obj.put("name", "Test");
        obj.put("email","email@test.com");

        JSONArray list = new JSONArray();
        list.add("obiect 1");
        list.add("obiect 2");
        list.add("obiect 3");
        list.add("obiect 4");

        obj.put("lista obiecte", list);

        try (FileWriter fileWriter = new FileWriter("test.json")){
            fileWriter.write(obj.toJSONString());//te lasa sa scrii
        }catch (IOException e){

        }
    }

    public void readJson(String key) throws ParseException {

        JSONParser parser = new JSONParser(); //obiect care parseaza
        try {
            FileReader file = new FileReader("test.json");//canal de comunicare - citeste fisiserul
            JSONObject jsonObj = (JSONObject) parser.parse(file);

            System.out.println(jsonObj.get(key));

        }catch (IOException e){

        }
    }
    public void updateJsonFile(String key,String value){
        JSONParser parser = new JSONParser(); //obiect care parseaza

        try {
            FileReader file = new FileReader("test.json");//canal de comunicare - citeste fisiserul
            JSONObject jsonObj = (JSONObject) parser.parse(file);

          jsonObj.put(key,value);

          try {
              FileWriter fileWriter = new FileWriter("test.json");
              fileWriter.write(jsonObj.toJSONString());
              fileWriter.close();
          }catch (Exception e){}

        }catch (Exception e){

        }
    }

    public void update2JsonFile(String key,String value){
        JSONParser parser = new JSONParser(); //obiect care parseaza

        try {
            FileReader file = new FileReader("test.json");//canal de comunicare - citeste fisiserul
            JSONObject jsonObj = (JSONObject) parser.parse(file);

            JSONArray list = (JSONArray) jsonObj.get("Lista obiecte");
            list.set(0,"ZERO");

            jsonObj.put(key,value);
            jsonObj.put("listaobiecte",list);


            try {
                FileWriter fileWriter = new FileWriter("test.json");
                fileWriter.write(jsonObj.toJSONString());
                fileWriter.close();
            }catch (Exception e){}

        }catch (Exception e){

        }
    }

    public void deleteFromJsonFile(String key){
        try (FileReader reader = new FileReader("test.json")){

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            jsonObject.remove(key);
            try(FileWriter file = new FileWriter("test.json")) {
                file.write(jsonObject.toJSONString());
            }catch(Exception e) {            }
        }catch (Exception e){

        }
    }
}
