package kadai_015;

public class CarExec_Chapter15 {
	 private int previousGear = 1;
	 private int currentGear = 1; 
	 private int speed = 10;
	    
	 public CarExec_Chapter15(int gear, int speed) {
	        this.currentGear = gear;
	        this.speed = speed;
	    }
	    
	 public void gearChange(int afterGear) {
	        this.previousGear = this.currentGear; 
	        this.currentGear = afterGear; 
	        this.speed = switch (this.currentGear) {
	            case 1 -> 10;
	            case 2 -> 20;
	            case 3 -> 30;
	            case 4 -> 40;
	            case 5 -> 50;
	            default -> 10;
	        };
	    }
	    
	 public void run() {
	        System.out.println("ギア" + this.previousGear + "から" + this.currentGear + "に切り替えられました");
	        System.out.println("速度は時速" + this.speed + "kmです");
	    }
	 
}
