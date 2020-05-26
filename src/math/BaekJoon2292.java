/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-26
 * Description: 벌집
 * 등비수열 문제
 */
package math;

import java.util.Scanner;

public class BaekJoon2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int index = 0;
        int count = 1;
        if (input == 1) {
            System.out.println(1);
        } else {
            count += index * 6;
            while (true) {
                if (count < input) {
                    count += (index + 1) * 6;
                    if (count >= input) {
                        System.out.println(index + 2);
                        break;
                    }
                }
                index++;
            }
        }
    }
}
