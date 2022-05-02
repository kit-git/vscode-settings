import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;
public class MBPlus{

    public static void main(String[] args) throws Exception{
        Robot hal = new Robot();
        int count = 1;
        while(true){
        	Random rand = new Random();
        	int t = rand.nextInt(200) + 20;
        	
            hal.delay(t * 60);  
            
            int k = rand.nextInt(3) + 1;
            int j = rand.nextInt(2) + 1;	
            for (int i = 0; i < k; i++) {	            
	            hal.keyPress(KeyEvent.VK_ALT);    
	            hal.keyRelease(KeyEvent.VK_ALT);
	            
	            count++;
	            System.out.println("count key "+ count);
            }
            for (int i = 0; i < j; i++) {
	            
	            hal.mousePress(InputEvent.BUTTON1_MASK);
	            hal.mouseRelease(InputEvent.BUTTON1_MASK);
	            
	            count++;
//	            System.out.println("count mouse "+ count);
            }
            
            Random r = new Random();
            int low = 1;
            int high = 15;
            int result = r.nextInt(high-low) + low;
            
            hal.keyPress(KeyEvent.VK_CONTROL);    
            
            for (int w = 1; w < result; w++) {
            	hal.keyPress(KeyEvent.VK_TAB);
            	hal.keyRelease(KeyEvent.VK_TAB);
            	
            	if(result%2==0) {
	            	hal.keyPress(KeyEvent.VK_DOWN);
	            	hal.keyRelease(KeyEvent.VK_DOWN);   
            	}else {
                	hal.keyPress(KeyEvent.VK_UP);
                	hal.keyRelease(KeyEvent.VK_UP);
            	}
            }
             
            hal.keyRelease(KeyEvent.VK_CONTROL);
            
        }
    }
}
