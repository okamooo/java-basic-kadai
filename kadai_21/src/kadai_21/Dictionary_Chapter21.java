package kadai_21;

import java.util.HashMap;

 

public class Dictionary_Chapter21 extends DictionaryExec_Chapter21 {

 

      HashMap<String,String> fruitlist = new HashMap<String,String>();

 
      public void tuika() {

      fruitlist.put("apple","りんご");

      fruitlist.put("peach","桃");

      fruitlist.put("banana","バナナ");

      fruitlist.put("lemon","レモン");

      fruitlist.put("pear","梨");

      fruitlist.put("kiwi","キウィ");

      fruitlist.put("straberry","いちご");

      fruitlist.put("grape","ぶどう");

      fruitlist.put("muscat","マスカット");

      fruitlist.put("cherry","さくらんぼ");

      }     

      

 

   public void fruitsearch(String word){

       if (fruitlist.containsKey(word))

        {

            System.out.println(word+"は"+fruitlist.get(word)+"です。");

        }else{

            System.out.println(word+"は辞書に存在しません。");

        }

  }

}
