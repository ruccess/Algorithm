/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-21
 * Description: 상수
 * 문자열로 푸는게 출제자의 의도였으나 숫자로 푸는게 더 간단해보여 숫자로 풀었음.
 */
package String;

import java.util.Scanner;

public class BaekJoon2908 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inputNum = {sc.nextInt(),sc.nextInt()};
        int a,b,c,tot,answer=0;
        for(Integer i : inputNum){
            a = i%10;
            b = (i/10)%10;
            c = i/100;
            tot = a*100 + b*10 + c;
            if(answer <tot){
                answer = tot;
            }
        }
        System.out.println(answer);
    }
}
