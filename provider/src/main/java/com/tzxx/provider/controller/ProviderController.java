package com.tzxx.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping(value = "/reply/{string}")
    public String reply(@PathVariable String string) {
        return "provider reply: " + string;
    }
}