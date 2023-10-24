package hello.springmvc1.web.frontcontroller.v4.controller;

import hello.springmvc1.domain.member.Member;
import hello.springmvc1.domain.member.MemberRepository;
import hello.springmvc1.web.frontcontroller.ModelView;
import hello.springmvc1.web.frontcontroller.V3.ControllerV3;
import hello.springmvc1.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        model.put("member", member);
        return "save-result";
    }
}
