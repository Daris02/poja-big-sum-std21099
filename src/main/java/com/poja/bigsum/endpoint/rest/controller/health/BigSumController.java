package com.poja.bigsum.endpoint.rest.controller.health;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poja.bigsum.PojaGenerated;

import lombok.AllArgsConstructor;

@PojaGenerated
@RestController
@AllArgsConstructor
public class BigSumController {

    @GetMapping("/big-sum")
    public String getBigSum(@RequestParam(name = "a") String a, @RequestParam(name = "b") String b) {
        return new BigInteger(a).add(new BigInteger(b)).toString();
    }
}