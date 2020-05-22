/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-22
 * Description:크로아티아 알파벳
 * 조건 제대로 준 것 같은데 아닌 것 같다,,,,
 * 그래서 주석처리하고 다시함
 */
package String;

import java.util.Scanner;

public class BaekJoon2941 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] word = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(String text : word){
            input = input.replaceAll(text, "T");
        }
        System.out.println(input.length());

/*        String[] str = sc.next().split("");
        int maxNum = 0;

        for(int i=0; i<str.length; i++){
            if(!str[i].equals("=") && !str[i].equals("-")){
                if(i-1 != str.length && str[i].equals("d")){
                    i++;
                }else if(i-1 != str.length && str[i].equals("l")){
                    i++;
                }else if(i-1 != str.length && str[i].equals("n")){
                    i++;
                }

                maxNum++;
            }
        }
        System.out.println(maxNum);*/
    }
}
