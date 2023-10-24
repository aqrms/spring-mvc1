package hello.springmvc1.web.frontcontroller.V3;

import hello.springmvc1.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);

}
