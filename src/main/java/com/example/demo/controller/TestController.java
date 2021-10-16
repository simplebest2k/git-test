package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
   public Object get2() {
      return "Hello";
   }
   public Object get() {
      return new HashMap<String,String>();
   }

}
