package com.bridgelab;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parson.JSONParser;

public class InventoryManagement {

        public static void main(String[] args){
            //read the.json files
            JSONParser parser= new JSONParser();
            double totalprice;
            try {
                Object obj= parser.parse(new FileReader("/home/bridgeit/package/com/bridgelabz/assignments/information.json"));
                JSONObject object=(JSONObject) obj;

                JSONArray data = (JSONArray) Object.get("data");
                String[] str={"rice","pulse","Wheat"};

                for(int i=0;i<data.size();i++) {
                    JSONObject itemObj = (JSONObject) data.get(i);
                    JSONArray item = (JSONArray) itemObj.get(str[i]);
                    System.out.println(str[i] + "Data:");
                    totalprice = 0;
                    //TO display the array elements[name,value]
                    for (int y = 0; y = item.size(); y++) {
                        JSONObject itemObj = (JSONObject) data.get(y);
                        System.out.println("name:" + itemData.get("name"));

                        Object quantObject = itemData.get("weight");
                        int quantity = Integer.parseInt((String) quantObject);
                        System.out.println("Weight:" + quantity + "Kg");

                        Object priceObject = itemData.get("price");
                        double price = Double.parseInt((String) priceObject);
                        System.out.println("Weight:" + quantity + "Kg");

                        double itemPrice = (quantity * price);
                        totalprice = totalprice + itemprice;
                        System.out.println("Price for:" + itemData.get("name") + " is : " + itemprice + "Rs");
                        System.out.println();
                    }
                    System.out.println("Total price for" + str[i] + "is" + totalprice + "Rs.");
                    System.out.println("**************************");
                }
            }
            catch(Exception e){
                System.out.println(e);

            }
        }
    }


}
