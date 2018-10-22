
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author jittagornp &lt;http://jittagornp.me&gt;  
 * create : 2018/10/22
 */
@SpringBootApplication
@ComponentScan("com.github.jittagornp")
public class AppStarter {

  public static void main(String[] args) {
    SpringApplication.run(AppStarter.class, args);
  }
  
}
