package test2;

public class HttpServletExample {
    public static void method(HttpServlet servlet) {
        servlet.service();
    }

    public static void main(String[] args) {
        method(new LoginServlet());     // 로그인합니다.
        method(new FileDownloadServlet()); // 파일 다운로드합니다.
    }
}

