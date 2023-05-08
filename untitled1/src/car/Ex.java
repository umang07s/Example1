package car;

import java.util.Arrays;

public class Ex {
    private int[] data;
  
    // makes a shallow copy of values
    public Ex(int[] values) {
        //data = values;
        data = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
        System.out.println(data.hashCode() + ", Address "+ data.toString());

    }
  
    public void showData() {
        System.out.println( Arrays.toString(data) );
    }
}