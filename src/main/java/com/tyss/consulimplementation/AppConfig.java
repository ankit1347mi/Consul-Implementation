package com.tyss.consulimplementation;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@RefreshScope
public class AppConfig {

    @Value("${dataMessage}")
    private String dataMessage;
}
