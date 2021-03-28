package servlet;

import domain.Wares;
import service.WaresService;
import service.impl.WaresServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class WaresQueryServlet extends HttpServlet {

    public WaresQueryServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type= req.getParameter("type");
        String state = req.getParameter("state");
        String start = req.getParameter("start");
        String waresid = req.getParameter("waresid");
        String userid = req.getParameter("userid");
        System.out.println(type);
        System.out.println(state);
        System.out.println(waresid);
        System.out.println(userid);
        System.out.println(start);

        /*String waresname = req.getParameter("waresname");
        Double waresprice = Double.valueOf(req.getParameter("waresprice"));
        Integer waresstock = Integer.valueOf(req.getParameter("waresstock"));
        String waresremarks = req.getParameter("waresremarks");*/

        /*WaresService waresService = new WaresServiceImpl();
        Wares wares = new Wares(waresid,userid,waresname,waresprice,waresstock,waresremarks);
        wares.toString();
        List<Wares> waresList = null;
        try {
            waresList = waresService.queryByCondition(wares);
            req.setAttribute("waresList",waresList);
            req.getRequestDispatcher("/waresllist.jsp").forward(req,resp);
        } catch (Exception exception) {
            resp.sendRedirect("/");
        }*/

    }
}
