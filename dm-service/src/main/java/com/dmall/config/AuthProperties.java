package com.dmall.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "dm.auth")
public class AuthProperties {
    private List<String> includePaths;
    private List<String> excludePaths;
}
