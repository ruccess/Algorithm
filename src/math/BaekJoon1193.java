/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-26
 * Description: 분수찾기
 * 등차수열 이용하여 이용
 */
package math;

import java.util.Scanner;

public class BaekJoon1193 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int index = 1;
        if (input != 1) {
            while (true) {
                if (input - index > 0) {
                    input -= index;
                    index++;
                } else {
                    break;
                }
            }
            if (index % 2 != 0) {
                System.out.println((index - input + 1) + "/" + input);

            } else {
                System.out.println(input + "/" + (index - input + 1));
            }
        } else {
            System.out.println("1/1");
        }
    }
}
