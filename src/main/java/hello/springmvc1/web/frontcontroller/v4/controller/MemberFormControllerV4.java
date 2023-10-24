package hello.springmvc1.web.frontcontroller.v4.controller;

import hello.springmvc1.web.frontcontroller.ModelView;
import hello.springmvc1.web.frontcontroller.V3.ControllerV3;
import hello.springmvc1.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }

}
