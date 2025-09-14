package mvc.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회] - start");

        req.getParameterNames().asIterator()
                        .forEachRemaining(param -> System.out.println(param + "=" + req.getParameter(param)));

        System.out.println("[전체 파라미터 조회] - end");
        System.out.println();

        System.out.println("[단일 파리미터 조회] - start");

        String username = req.getParameter("username");
        String age = req.getParameter("age");

        System.out.println("username = " + username);
        System.out.println("age = " + age);

        System.out.println("[단일 파리미터 조회] - end");
        System.out.println();

        System.out.println("[이름이 같은 복수 파라미터 조회]"); // localhost:8080/request-param?username=lee&age=27&username=kim
        String[] usernames = req.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("name = " + name);
        }

        resp.getWriter().write("ok");

    }


}
