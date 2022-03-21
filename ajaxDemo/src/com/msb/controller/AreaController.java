package com.msb.controller;

import com.google.gson.Gson;
import com.msb.dao.AreaDao;
import com.msb.dao.AreaDaoImpl;
import com.msb.pojo.Area;
import com.msb.service.AreaService;
import com.msb.service.AreaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Auther: ms
 * @Date: 2022/3/20 0020 - 03 - 20 - 14:54
 * @Description: com.msb.controller
 * @version: 1.0
 */
@WebServlet("/areaController.do")
public class AreaController extends HttpServlet {
    private AreaService areaSerivce=new AreaServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer parentId = 0;
        try {
            parentId =  Integer.parseInt(req.getParameter("parentID"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

         List<Area> areas= areaSerivce.findByParentID(parentId);

        String json = new Gson().toJson(areas);
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html,charset=UTF-8");
        resp.getWriter().print(json);

    }
}
