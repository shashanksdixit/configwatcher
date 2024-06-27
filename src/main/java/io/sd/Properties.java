package io.sd;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my.custom")
public class Properties {

    private String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
