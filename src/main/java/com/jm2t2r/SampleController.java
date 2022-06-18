package com.jm2t2r;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
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
}
