public class Problem3_9 {
 
    public static void main(String[] args) {
        int num = (int)(Math.random()*100)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);
        if(num >= 50){
            System.out.println("50以上です。");
            }else{
                System.out.println("50未満です。");
            }
    }
 
}