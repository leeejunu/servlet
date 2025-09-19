package mvc.servlet.web.frontcontroller.v2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.servlet.domain.member.Member;
import mvc.servlet.domain.member.MemberRepository;
import mvc.servlet.web.frontcontroller.MyView;
import mvc.servlet.web.frontcontroller.v2.ControllerV2;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public MyView process(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";

        List<Member> members = memberRepository.findAll();
        httpRequest.setAttribute("members", members);

        return new MyView(viewPath);
    }
}
