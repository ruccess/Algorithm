/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-25
 * Description:그룹 단어 체커
 */
package String;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str;
        ArrayList<String> strArr = new ArrayList<>();
        int leng = sc.nextInt();
        String temStr;
        int count = 0;
        int total = 0;

        for(int i=0; i<leng; i++){
            str =  sc.next().split("");
            temStr = str[0];
            strArr.add(str[0]);
            for(String j : str){
                if(!strArr.contains(j)){
                    strArr.add(j);
                }
            }

            temStr = str[0];
            strArr.remove(str[0]);
            for (int j =1; j<str.length; j++){
                if(!temStr.equals(str[j])){
                    if(strArr.contains(str[j])){
                        strArr.remove(str[j]);
                    }else{
                        count++;
                    }
                    temStr = str[j];
                }
            }
            if(count != 0){
                total++;
                count = 0;
            }

            strArr.clear();
        }

        System.out.println(leng - total);
    }
}
