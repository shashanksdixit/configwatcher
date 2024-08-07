package io.sd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppController {
	
	private final Properties properties;
    Logger logger = LoggerFactory.getLogger(AppController.class);

    public AppController(Properties properties) {
        this.properties = properties;
    }

    @GetMapping("/config")
    public String getConfig() {
    	StringBuilder output = new StringBuilder();
    	output.append("Current value of 'my.custom.property' is: " + properties.getProperty() + " \n");
    	logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return output.toString();
    }

    @PostMapping("/config")
    public String updateConfig() {
        return "Update endpoint - simulate update";
    }

}
