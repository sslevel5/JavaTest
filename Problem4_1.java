public class Problem4_1 {
    public static void main(String[] args) {
        // 1から10までの乱数を生成
        int num = (int)(Math.random() * 10) + 1;
        
        // 発生させた数値を表示
        System.out.println("数：" + num);
        
        // その数だけ■マークを表示
        for (int i = 0; i < num; i++) {
            System.out.print("■　");
        }
    }    
}
