public class Problem4_2 {
    public static void main(String[] args) {
        // 1から10までの乱数を生成
        int num = (int)(Math.random() * 10) + 1;
        
        // 発生させた数値を表示
        System.out.println("数：" + num);
        
        // その数だけ■マークを表示
        int count = 0;
        while (count < num) {
            System.out.print("■ ");
            count++;
        }
    }
}
