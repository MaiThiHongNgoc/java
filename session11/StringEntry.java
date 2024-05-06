package session11;

import session11.model.KeyValues;

public class StringEntry<V> extends KeyValues<String,V> {
    public StringEntry(String key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        StringEntry<String> entry=new StringEntry<String>("S001","Ngoc");
        String sNumber = entry.getKey();
        String sName = entry.getValue();
        System.out.println(sNumber+" "+ sName);
    }
}
