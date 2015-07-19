package hello;

import java.util.HashMap;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import json.simple.JsonArray;
import json.simple.JsonObject;

import org.json.simple.JSONArray;

public class SimpleJson {

	public static void main(String[] args) {
		System.out.println("Hello Simple Json!");

		JsonObject json = new JsonObject();

		JSONObject obj = json.createJsonObj();
		System.out.println("json : " + obj.toJSONString());
		HashMap<String, String> map = json.createMap();
		System.out.println("map : " + map.toString());

		System.out.println("---------------------------------------------------------------");

		JsonArray arr = new JsonArray();

		JSONArray jarr = arr.createJsonArray();
		System.out.println("jsonArr : " + jarr.toJSONString());
		ArrayList<String> list = arr.createJsonArray();
		System.out.println("ArrayList : " + list.toString());

	}
}
