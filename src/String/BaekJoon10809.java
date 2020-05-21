/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-21
 * Description:알파벳 찾기
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 */
package String;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputString;
        inputString = sc.next().split("");
        int count = 0;

        ArrayList alpa = new ArrayList();
        alpa.add("a");
        alpa.add("b");
        alpa.add("c");
        alpa.add("d");
        alpa.add("e");
        alpa.add("f");
        alpa.add("g");
        alpa.add("h");
        alpa.add("i");
        alpa.add("j");
        alpa.add("k");
        alpa.add("l");
        alpa.add("m");
        alpa.add("n");
        alpa.add("o");
        alpa.add("p");
        alpa.add("q");
        alpa.add("r");
        alpa.add("s");
        alpa.add("t");
        alpa.add("u");
        alpa.add("v");
        alpa.add("w");
        alpa.add("x");
        alpa.add("y");
        alpa.add("z");
        for (int i = 0; i<alpa.size(); i++) {
            count = 0;
            for (int j = 0; j < inputString.length; j++) {
                if(alpa.get(i).equals(inputString[j])){
                    count++;
                    System.out.print( j + " ");
                    alpa.set(i,"");
                }
            }
            if(count == 0){
                System.out.print(-1 + " ");

            }
        }
    }
}
