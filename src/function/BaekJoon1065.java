/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-20
 * Description: 한수
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
package function;

import java.util.Scanner;

public class BaekJoon1065 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int a = 0;          //일의 자리 십의 자리 차
        int b = 0;          //백의 자리 십의 자리 차
        for(int i = 1; i<=num; i++){
            if(i<100){
                count++;
            }else if(i != 1000){
                a = i/100 - (i%100)/10;
                b = (i%100)/10 - i%10;
                if(a == b){
                    count++;
                }
            }else {

            }
            a=0;
            b=0;
        }
        System.out.println(count);
    }
}
