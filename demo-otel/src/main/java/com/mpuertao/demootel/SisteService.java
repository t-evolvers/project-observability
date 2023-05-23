package com.mpuertao.demootel;


import io.micrometer.core.instrument.step.StepRegistryConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class SisteService {

    private static final Logger logger = LoggerFactory.getLogger(SisteService.class);

    @Value("#{environment.SERVICE_B_URL}")
    private String url;

    public String sisteHello(){
        logger.info("CONSUMIENDO EL SERVICIO-B DESDE EL SERVICIO-A -> URL DEL SERVICIO-B ES : "+ url);
        return WebClient.create(url).get().uri("/message").retrieve().bodyToMono(String.class).block();
    }
}
