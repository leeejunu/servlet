package mvc.servlet.web.frontcontroller.v1.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.servlet.domain.member.Member;
import mvc.servlet.domain.member.MemberRepository;
import mvc.servlet.web.frontcontroller.v1.ControllerV1;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV1 implements ControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public void process(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";

        List<Member> members = memberRepository.findAll();
        httpRequest.setAttribute("members", members);

        RequestDispatcher dispatcher = httpRequest.getRequestDispatcher(viewPath);
        dispatcher.forward(httpRequest, httpResponse);
    }
}
