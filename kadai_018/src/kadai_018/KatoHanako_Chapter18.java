package kadai_018;

class KatoHanako_Chapter18 extends Kato_Chapter18 {  
	  public KatoHanako_Chapter18() {
	        setGivenName();  // コンストラクタ内で givenName を設定
	    }
	    
	    public void setGivenName() {     
	        givenName = "花子";
	    }
	@Override 
	 public void  eachIntroduce(){
		
		System.out.println("趣味は読書です"); 
		}
	}
