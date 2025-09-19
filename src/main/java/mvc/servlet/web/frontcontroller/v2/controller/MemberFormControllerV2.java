package mvc.servlet.web.frontcontroller.v2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.servlet.web.frontcontroller.MyView;
import mvc.servlet.web.frontcontroller.v2.ControllerV2;

import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {
    @Override
    public MyView process(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        return new MyView(viewPath);
    }
}
