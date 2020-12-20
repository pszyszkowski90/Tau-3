package org.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.jupiter.api.Test;

public class JSONTest {
  @Test
  public void toJsonTest() {

    JSONObject obj = new JSONObject();

    obj.put("name", "Pankaj Kumar");
    obj.put("age", new Integer(32));

    JSONArray cities = new JSONArray();
    cities.add("New York");
    cities.add("Bangalore");
    cities.add("San Francisco");

    obj.put("cities", cities);
    System.out.print(obj.toJSONString());
    String expObj = "{\"cities\":[\"New York\",\"Bangalore\",\"San Francisco\"],\"name\":\"Pankaj Kumar\",\"age\":32}";

    assertEquals(expObj, obj.toJSONString());
  }
  @Test
  public void parseJsonTest() {

    String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
    String expect = "{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}";
    Object obj = JSONValue.parse(s);
    Object expectObj = JSONValue.parse(expect);
    JSONArray array = (JSONArray)obj;
    assertEquals(expectObj, array.get(1));
  }
}