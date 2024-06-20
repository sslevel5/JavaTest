public class Problem3_8 {
 
    public static void main(String[] args) {
        int num = (int)(Math.random()*10)+1;    //  1から6までの乱数を発生させる
        System.out.println("数値 : " + num);
        if(num == 1){
            System.out.println("1です。");
            }else{
                System.out.println("1以外です。");
            }
    }
 
}