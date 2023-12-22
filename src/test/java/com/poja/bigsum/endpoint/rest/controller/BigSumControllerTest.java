package com.poja.bigsum.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.poja.bigsum.PojaGenerated;
import com.poja.bigsum.endpoint.rest.controller.health.BigSumController;

@PojaGenerated
public class BigSumControllerTest {
    
  BigSumController bigSumController = new BigSumController();
  
  @Test
  void bigSum() {
    assertEquals("1000000000000000000002", bigSumController.getBigSum("1000000000000000000000", "2"));
  }
}
