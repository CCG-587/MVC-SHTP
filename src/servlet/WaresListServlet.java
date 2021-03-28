package servlet;

import domain.Wares;
import service.WaresService;
import service.impl.WaresServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaresListServlet extends HttpServlet {

    public WaresListServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        WaresService waresService = new WaresServiceImpl();
        List<Wares> waresList = waresService.queryAll();
        req.setAttribute("waresList",waresList);
        req.getRequestDispatcher("/wares-list.jsp").forward(req,resp);
    }
}
