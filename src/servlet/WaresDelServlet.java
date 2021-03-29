package servlet;

import service.WaresService;
import service.impl.WaresServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WaresDelServlet extends HttpServlet {
    public WaresDelServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String waresid = req.getParameter("waresid");
        System.out.println(waresid);
        WaresService waresService = new WaresServiceImpl();
        Integer result = null;
        try {
            result = waresService.removeById(waresid);
            HttpSession session = req.getSession();
            if (result != 0){
                session.setAttribute("message","删除成功！");
            }else{
                session.setAttribute("message","删除失败！");
            }
            req.getRequestDispatcher("/WaresListServlet").forward(req,resp);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
