package hello.springmvc1.web.frontcontroller.V3.controller;

import hello.springmvc1.web.frontcontroller.ModelView;
import hello.springmvc1.web.frontcontroller.V3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
