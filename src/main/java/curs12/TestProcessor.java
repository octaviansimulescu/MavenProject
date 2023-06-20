package curs12;

import org.json.simple.parser.ParseException;

public class TestProcessor {
    public static void main(String[] args) throws ParseException {
        JsonProcessor obj = new JsonProcessor();
        /*obj.writeJson();
        obj.readJson("email");
        obj.readJson("lista obiecte");
        obj.updateJsonFile("email","romeofantastik@java.com");*/
        obj.update2JsonFile("email","altEmail");
    }
}
