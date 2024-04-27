package com.example.demo;



import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = {"", "/"})
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String principleAmount = request.getParameter("principleAmount");
        String interest = request.getParameter("interest");
        String years = request.getParameter("years");
        String compoundingPeriod = request.getParameter("compoundingPeriod");
        String error;
        if (principleAmount==null||interest==null||years==null||compoundingPeriod==null||principleAmount.isEmpty()||interest.isEmpty()||years.isEmpty()||compoundingPeriod.isEmpty()){
        error="The data you have given is incomplete";
        request.setAttribute("error",error);
        }else{
            try {
                double result = Util.result(Double.parseDouble(principleAmount),Double.parseDouble(interest)/100,Integer.parseInt(years),Integer.parseInt(compoundingPeriod));
                request.setAttribute("result",result);
                request.setAttribute("principleAmount",principleAmount);
                request.setAttribute("interest",interest);
                request.setAttribute("years",years);
                request.setAttribute("compoundingPeriod",compoundingPeriod);
            } catch (NumberFormatException e) {
                error = "Invalid input format. Please enter valid numbers.";
                request.setAttribute("error", error);
            }
        }
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
