package ru.afm.servlets;

import ru.afm.clinic.Animal;
import ru.afm.clinic.Client;
import ru.afm.clinic.Dog;
import ru.afm.clinic.Pet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ClinicServlet extends HttpServlet {
    private List<Client> clients = new CopyOnWriteArrayList<Client>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.append(
                "<!DOCTYPE html>" +
                        "<html>" +
                        "<head>" +
                        "<title> Clinic Pet</title>" +
                        "</head>" +
                        "<body>" +
                        "<form action = '" + req.getContextPath() + "/' method='post'>" +
                        "Pet Name: <input type='text' name='petname'> <br>" +
                        "Client Name: <input type='text' name='clientname'>" +
                        "<input type='submit' value='Submit'>"+
                        "<form> <br>" +
                        "<form action = '" + req.getContextPath() + "/'method='post'>" +
                        "Client Name: <input type='text' name='searchclientname'>" +
                        "<input type='submit' value='Search'>" +
                        "</form>" +
                        this.viewClients()+
                        "</body>" +
                        "</html>"
        );
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("searchclientname").equals("")) {
            this.clients.add(new Client(req.getParameter("clientname"), new Dog(req.getParameter("petname"))));
        }else{
            for(Client client: clients){
                if(!client.getId().equals(req.getParameter("searchclientname"))){
                    clients.remove(client);
                }
            }
        }
        doGet(req, resp);
    }

    private String viewClients(){
        StringBuilder sb = new StringBuilder();
        sb.append("<p>Clients</p>");
        sb.append("<table style='border : 1px solid black'");
        for(Client client: clients){
            sb.append("<tr><td style='border: 1px solid black'>").append(client.getId()).append("<br>")
                    .append(client.getPetName()).append("</td></tr>");
        }
        sb.append("</table>");
        return sb.toString();
    }
}
