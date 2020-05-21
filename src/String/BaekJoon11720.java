/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-21
 * Description: 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 */
package String;

import java.util.Scanner;

public class BaekJoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] leng = new String[sc.nextInt()];
        String num=sc.next();
        leng = num.split("");
        int sum = 0;
        for (int i=0;i<leng.length; i++){
            sum +=  Integer.parseInt(leng[i]);
        }
        System.out.println(sum);
    }
}
