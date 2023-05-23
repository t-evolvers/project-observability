package com.mpuertao.demootel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SisteController {

    public SisteController(SisteService sisteService) {
        this.sisteService = sisteService;
    }

    private SisteService sisteService;

    @GetMapping("/siste")
    public String HelloSiste(){
        return this.sisteService.sisteHello();
    }
}
