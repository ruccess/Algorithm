/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-04-20
 * Description: 평균은 넘겠지
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 */
package arrays;

import java.util.Scanner;

public class BackJoon4344 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNum = sc.nextInt();
        int totalScore= 0;
        int[] list;
        int humanCount=0;
        float averageScore;
        float answer;
        for (int i =0; i<totalNum; i++){
            list = new int[sc.nextInt()];
            for (int j =0; j<list.length; j++){
                list[j] = sc.nextInt();
                totalScore += list[j];

            }
            averageScore = totalScore/list.length;
            for(int j : list){
                if(j > averageScore){
                    humanCount++;
                }
            }
            answer = (float) humanCount/(float) list.length;
            answer = (float) (answer*100.0);
            System.out.println(String.format("%.3f", answer)+"%");
            humanCount = 0;
            totalScore = 0;
        }
    }
}
