public class Problem3_16 {
 
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);
        if(num % 2 == 0 && num % 3 == 0){
            System.out.println("2と3の公倍数です。");
            }else if(num % 2 == 0){
                System.out.println("2の公倍数です。");
            }else if(num % 3 == 0){
                System.out.println("3の公倍数です。");
            }else{
                System.out.println("それ以外");
            }
    }
}