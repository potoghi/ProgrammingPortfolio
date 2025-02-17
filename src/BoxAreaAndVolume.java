// Write a function that returns the total surface area and volume of a box as an array: [area, volume]

import java.util.Arrays;

public class BoxAreaAndVolume {

    public static int[] getSize(int l, int w, int h) {

        int surfaceArea = 2 * ((l * w) + (w * h) + (h * l));

        int volume = l * w * h;


        return new int[] {surfaceArea, volume};

    }

    public static void main(String[] args) {


        int[] w = getSize(10,10,10);
        int[] h = getSize(10,10,15);
        int[] d = getSize(15,25,25);

        System.out.println(Arrays.toString(w));
    }

}
