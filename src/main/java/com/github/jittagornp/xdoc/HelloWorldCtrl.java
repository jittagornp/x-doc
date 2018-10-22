/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jittagornp.xdoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt;  
 * create : 2018/10/22
 */
@RestController
public class HelloWorldCtrl {

  @GetMapping
  public String getMessage(){
    return "Hello World.";
  }
  
}
