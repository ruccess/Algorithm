/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-21
 * Description:단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 */
package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BaekJoon1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        ArrayList arr = new ArrayList();
        HashMap<String,Integer> has = new HashMap();
        String answer = "";
        int maxNum = 0;

        for (int i =0; i<str.length; i++){
            if(has.containsKey(str[i].toUpperCase())){
                has.replace(str[i].toUpperCase(),has.get(str[i].toUpperCase())+1);
            }else{
                has.put(str[i].toUpperCase(),1);
                arr.add(str[i].toUpperCase());
            }
        }
        for (int i=0; i<arr.size(); i++){
            if(maxNum < has.get(arr.get(i))) {
                maxNum = has.get(arr.get(i));
                answer = (String) arr.get(i);
            }else if(maxNum == has.get(arr.get(i))){
                answer = "?";
            }
        }
        System.out.println(answer);
    }
}
