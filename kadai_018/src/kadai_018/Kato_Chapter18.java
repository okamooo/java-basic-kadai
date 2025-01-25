package kadai_018;

abstract class Kato_Chapter18 {

	 String famillyName = "加藤";       
	 
	 String givenName  ;      
	 
	 String address = "住所は東京都中野区〇×です" ;        
	 
	 public void commonIntroduce(){  
		 System.out.println("名前は" + famillyName + givenName + "です");  
		 System.out.println(address);  
		 }         
	 
    abstract public void eachIntroduce();
    
	 
	 public void execIntroduce(){     
		 commonIntroduce();    
		 eachIntroduce();  
		
	 } 
}
