package mvc.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface ControllerV1 {

    void process(HttpServletRequest httpRequest, HttpServletResponse httpResponse) throws ServletException, IOException;
}
