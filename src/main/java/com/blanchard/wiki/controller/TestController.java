package com.blanchard.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // @Controller一般用来返回一个页面
@RestController  // RestController一般用来返回一个字符串
/*
ctrl点击@RestController可以跳转到其定义代码，发现它也是@Controller，只是多了一个@ResponseBod，表示返回的是json或者字符串
*/
public class TestController {

  /*
  * 1.@RequestMapping注解会处理get,post,put,delete四种请求
  *   这四种请求都有对应的自己的注解：
  *   @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
  * 2.也可以用@RequestMapping指定处理的http请求，比如下面的就只支持get：
  *   @RequestMapping(value = "/hello", method = RequestMethod.GET)
  * */
//  @RequestMapping("/hello")
  @GetMapping("/hello")
  public String hello() {
    return "Hello world!";
  }
}
