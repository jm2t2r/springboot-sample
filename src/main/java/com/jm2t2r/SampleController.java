package com.jm2t2r;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RestController
public class SampleController {


    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/")
    public String hello(HttpServletRequest request){
        String result = "src: "+request.getRemoteAddr()+" / dest: "+request.getServerName()+"\n";

        logger.error("error log");
        logger.warn("warn log");
        logger.info("info log");
        logger.debug("debug log");
        logger.trace("trace log");
 
        logger.info(result);
        
        
        return result;
    }
    @RequestMapping("/sleep")
    public String sleep(HttpServletRequest request){
    	String result="";
    	
    	long seed = System.currentTimeMillis();
    	Random rand = new Random(seed);
    	long lValue = rand.nextInt(5000); // 0 <= iValue < 5000
    	
    	try {
			Thread.sleep(lValue);
			result = "this thread sleep for "+lValue+"ms";
			logger.debug(result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    	return result;
    
    }
}
