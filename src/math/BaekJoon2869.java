/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-26
 * Description:달팽이는 올라가고 싶다
 * 0.15 초 (추가 시간 없음)
 * 처음엔 for문으로 접근하였다 시간초과로 인해 다른방법 강구함 왜 여기있나했다....
 */
package math;

import java.util.Scanner;

public class BaekJoon2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt(), down = sc.nextInt(), leng = sc.nextInt();

        int index = 1;
        leng -= up;
        int share = leng / (up - down);

        if (leng - ((up - down) * share) <= 0) {
            index += share;
        } else {
            index += share + 1;
        }

        System.out.println(index);
    }
}
