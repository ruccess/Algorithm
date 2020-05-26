/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-26
 * Description: 설탕배달
 */
package math;

import java.util.Scanner;

public class BaekJoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int count = 0;
        int leng = amount;
        for (int i = 0; i <= leng; i++) {
            if (amount % 5 == 0) {
                count = amount / 5;
                System.out.println(count);
                break;
            } else if (amount > 0) {
                amount -= 3;
                count++;
                if (amount == 0) {
                    System.out.println(count);
                    break;
                } else if (amount % 5 == 0) {
                    count += amount / 5;
                    System.out.println(count);
                    break;
                }
            } else {
                System.out.println(-1);
                break;
            }
        }
    }
}
