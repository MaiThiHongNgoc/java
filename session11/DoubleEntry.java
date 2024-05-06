package session11;

import session11.model.KeyValues;

public class DoubleEntry<V> extends KeyValues<Double,V> {
    public DoubleEntry(Double key, V value) {
        super(key, value);
    }

    public static void main(String[] args) {
        DoubleEntry<Double> entry= new DoubleEntry<Double>(0.12,9.5);

    }
}
