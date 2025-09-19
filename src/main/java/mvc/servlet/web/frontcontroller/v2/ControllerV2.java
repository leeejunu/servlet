package mvc.servlet.web.frontcontroller.v2;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.servlet.web.frontcontroller.MyView;

import java.io.IOException;

public interface ControllerV2 {

    MyView process(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException;
}
