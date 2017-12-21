// @RequestMapping - 요청 헤더의 이름으로 구분하기
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test06")
public class Test06 {
    
    
    /* 요청 헤더의 존재 유무에 따라 호출될 메서드를 구분할 수 있다.
     * headers 속성에 헤더 이름을 등록하라.
     */
    @RequestMapping
    public String m1() {
        System.out.println("m1()");
        return "/hello.jsp";
    }
    
    // => menu라는 파라미터가 있는 경우
    @RequestMapping(headers="aaa")
    public String m2() {
        System.out.println("m2()");
        return "/hello.jsp";
    }
    
    // => command라는 파라미터가 있는 경우
    @RequestMapping(headers="bbb")
    public String m3() {
        System.out.println("m3()");
        return "/hello.jsp";
    }
    
    // => menu와 command가 함께 있는 경우
    @RequestMapping(headers={"aaa","bbb"})
    public String m4() {
        System.out.println("m4()");
        return "/hello.jsp";
    }
}