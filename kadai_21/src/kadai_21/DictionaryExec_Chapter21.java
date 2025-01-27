package kadai_21;

public class DictionaryExec_Chapter21 {

    public static void main(String[] args) {

 

      Dictionary_Chapter21 fruit  = new Dictionary_Chapter21();
      fruit.tuika();


 

      String[] wordsArray = {"apple","banana","grape","orange"};

 

      for (String word : wordsArray) {
          fruit.fruitsearch(word);
      }
      
    }
}