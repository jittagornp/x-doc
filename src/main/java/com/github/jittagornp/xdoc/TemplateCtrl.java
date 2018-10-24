/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jittagornp.xdoc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/04/09
 */
@Controller
public class TemplateCtrl {

  @GetMapping
  public ModelAndView getIndex(@RequestParam(value = "page", required = false, defaultValue = "index") String page) {
    ModelAndView mav = new ModelAndView("template");
    mav.addObject("container", page);
    return mav;
  }

}
