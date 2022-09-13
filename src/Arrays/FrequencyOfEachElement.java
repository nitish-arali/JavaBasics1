package Arrays;

import javax.sound.midi.Soundbank;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 1, 3, 5, 5, 7};
        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
        System.out.println("Frequency");
        ;
        for (int i = 0; i < fr.length; i++) {
            if(fr[i] != visited)
                System.out.println(arr[i]+" || "+fr[i]);

            }
        }
    }