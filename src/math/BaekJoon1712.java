/**
 * create by ruccess0.0@gmail.com
 * Version: 1.0.0
 * Date: 2020-05-25
 * Description:손익분기점
 */
package math;

import java.util.Scanner;

public class BaekJoon1712 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fixNum = sc.nextInt();
        int makeNum = sc.nextInt();
        int sellNum = sc.nextInt();
        int result = 0;

        if (sellNum <= makeNum) result = -1;
        else result = fixNum / (sellNum - makeNum) + 1;
        System.out.println(result);
    }
}
