/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-22
 * Description: 다이얼
 */
package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.next().split("");

        ArrayList<List> list = new ArrayList<>();

        list.add(new ArrayList<String>(Arrays.asList("")));
        list.add(new ArrayList<String>(Arrays.asList("A", "B", "C")));
        list.add(new ArrayList<String>(Arrays.asList("D", "E", "F")));
        list.add(new ArrayList<String>(Arrays.asList("G", "H", "I")));
        list.add(new ArrayList<String>(Arrays.asList("J", "K", "L")));
        list.add(new ArrayList<String>(Arrays.asList("M", "N", "O")));
        list.add(new ArrayList<String>(Arrays.asList("P", "Q", "R","S")));
        list.add(new ArrayList<String>(Arrays.asList("T", "U", "V")));
        list.add(new ArrayList<String>(Arrays.asList("X", "Y", "Z")));
        list.add(new ArrayList<String>(Arrays.asList("")));
        int maxNum=0;

        for (int i=0; i<inputArr.length; i++){
            for (int j=0; j<list.size(); j++){
                for(int k=0; k<list.get(j).size(); k++){
                    if(inputArr[i].equals(list.get(j).get(k))){
                        maxNum += 2 + j;
                    }
                }
            }
        }
        System.out.println(maxNum);
    }
}
