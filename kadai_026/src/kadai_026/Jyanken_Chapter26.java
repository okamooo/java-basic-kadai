package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;




public class Jyanken_Chapter26 extends JyankenExce_Chapter26 {
	
	public String  getMyChoice(){

		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");

            String imput = scanner.next();

            if (!(imput.equals("r") || imput.equals("s") || imput.equals("p"))) {  
                System.out.println("正しい手を入力してください。");
            } else {
                
                return imput; // 適切にリターン
            }
           
        }
       
    }
		 

	public String getRandom() {
	    String[] rivals = {"r", "s", "p"};
	    Random random = new Random();
	    return rivals[random.nextInt(3)];
	}
 
		public void playGame() {
			
			HashMap<String, String> list = new HashMap<String, String>();
		 
		      list.put("r","グー");
		 
		      list.put("p","パー");
		 
		      list.put("s","チョキ");
		      
		      
		      String me = new String(getMyChoice());
		  	String you = new String(getRandom());
		  	
		  	System.out.println("自分の手は" + list.get(me) + "、対戦相手の手は" +list.get(you));
		  	
			if(me.equals(you)) {
				System.out.println("あいこです");
			}else if(
				me.equals("r")&&you.equals("s")||
				me.equals("s")&&you.equals("p")||
				me.equals("p")&&you.equals("r")) {
				System.out.println("自分の勝ちです");
			}else {
				System.out.println("自分の負けです");
			}
			
		 }
}
