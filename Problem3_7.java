public class Problem3_7 {
 
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);
        if(num >= 5){
            System.out.println("5以上です。");
            }else{
                System.out.println("5未満です。");
            }
    }
 
}