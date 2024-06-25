package io.sd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class AppConfig {
	
    @Value("${my.custom.property}")
    private String myCustomProperty;

    public String getMyCustomProperty() {
        return myCustomProperty;
    }

    public void setMyCustomProperty(String myCustomProperty) {
        this.myCustomProperty = myCustomProperty;
    }

}
