package some_java_notes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Method_02 {
    // 這裡定義屬性
    int a;
    int b;
     
    // 這裡定義建構子
    public Method_02(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public Method_02() {
        this.a = 0;
        this.b = 0;
    }
     
    // 這裡定義方法
    public int do_something() {
        return a + b;
    }
      
    // 這裡定義 main() 方法
    public static void main(String[] args) { 
		// call log4j to replace print
		Logger logger = LogManager.getLogger("method_02");
		//
    	
    	Method_02 demo = new Method_02(11, 22);
         
		logger.error("");
		logger.error("a = "+ demo.a +" b = "+ demo.b);
        logger.error("a + b = "+ demo.do_something());
		logger.error("");
    }
}
