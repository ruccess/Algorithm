/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-21
 * Description: 문자열 반복
 */
package String;

import java.util.Scanner;

public class BaekJoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"UTF-8");
        int count = 0;
        String text;
        String[] arrays;
        int num =sc.nextInt();
        for (int i=0; i<num;i++){
            count = sc.nextInt();
            text = sc.next();
            arrays = text.split("");

            for (int j=0; j<arrays.length; j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(arrays[j]+"");
                }
            }
            System.out.println();
        }
    }
}
