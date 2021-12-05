<%-- 
    Document   : process
    Created on : Dec 5, 2021, 12:44:33 PM
    Author     : JM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="person.data.PersonInformationWS"%>
<%@page import="person.data.PersonInformationWS_Service"%>


<%
    PersonInformationWS_Service service = new PersonInformationWS_Service();
    PersonInformationWS port = service.getPersonInformationWSPort();
    
   // String action = request.getParameter("action");
    //int personInfoSize = port.selectAllPersonInformation().size();
//    try {
//        try {
//            if(action ==)
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//    }
//    catch(Exception e) {
//        e.printStackTrace();
//    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
//           
            if(request.getParameter("submit").equals("UPDATE")) {
                int id = Integer.parseInt(request.getParameter("id"));
                String fname =  request.getParameter("firstname");
                String lname =  request.getParameter("lastname");
                String birthday =  request.getParameter("bday");
                out.println(port.updatePersonProfile(id, fname, lname, birthday));
                response.sendRedirect("./index.jsp");
            }
            
            if(request.getParameter("submit").equals("INSERT")) {
                String fname =  request.getParameter("firstname");
                String lname =  request.getParameter("lastname");
                String birthday =  request.getParameter("bday");
                out.println(port.insertPersonProfile(fname, lname, birthday));
                out.println(request.getParameter("id"));
                response.sendRedirect("./index.jsp");
            }
            
             if(request.getParameter("submit").equals("DELETE")) {
                int ID = Integer.valueOf(request.getParameter("id"));
                port.delete(ID);
                response.sendRedirect("./index.jsp");
            }
            
            
        %>
    </body>
</html>
