/**
 * create by ruccess.
 * Version: 1.0.0
 * Date: 2020-05-20
 * Description: 셀프 넘버
 *
 *
 */
package function;

public class BaekJoon4673 {
    static int[] num = new int[10001];
    public static void main(String[] args) {
        for(int i = 0; i<=10000; i++){
            num[i] = i;
        }
        for (int i =0; i<num.length; i++){
            d(i);
        }
        for (int i =0; i<num.length; i++){
            if(i>0 && i<=10000 &&num[i]>0){
                System.out.println(num[i]);
            }
        }
    }


    public static void d(int n) {
        if(n/10 == 0){              //1
            n = n + n;
        }else if(n/100 == 0){       //10
            n = n + n/10 + n%10;
        }else if(n/1000 == 0){      //100
            n = n + n/100 + n%10+ (n%100)/10;
        }else if(n/10000 == 0){     //1000
            n = n + n/1000 + n%10 + (n%1000)/100 + (n%100)/10;
        }else if(n >10000){
            return;
        }
        if(n < 10001){
            num[n] = 0;
        }
    }
}
