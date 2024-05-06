package session11;

import session11.model.KeyValues;

public class GenericExample {
    public static void main(String[] args) {
       KeyValues<Integer,String> entry = new KeyValues<Integer, String>(1,"Ngoc");
       //K: Interger
       Integer phone = entry.getKey();
       //v: Value String
        String name = entry.getValue();
        System.out.println(phone+ " "+ name);
    }
}
