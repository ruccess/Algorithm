/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-20
 * Description: 아스키 코드
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */
package String;

import java.util.Scanner;

public class BaekJoon11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        int b = 0;
        b = test.charAt(0);
        System.out.println(b);
    }
}
