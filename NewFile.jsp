<%@ page language="java" import="java.sql.*"%>
<%@page import="java.util.*" %>
<%@page import="org.json.JSONObject" %>

<html>
<head>
<title> Films Example: JSP, Postgres version</title>
</head>
<body bgcolor="white">
<%
Connection conn;
        try {
 	    Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            out.println("<h1>Driver not found:" + e + e.getMessage() + "</h1>" );
        }
	try {
		
	   conn = DriverManager.getConnection (
	    	"jdbc:postgresql://localhost/mydatabase",
		"karan", "karan" );

            Statement stmt = conn.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("SELECT * FROM india");
            
            List empdetails = new LinkedList();
            JSONObject responseObj = new JSONObject();

               JSONObject empObj = null;

            while (rs.next()) {
                                  String title = rs.getString("year");
                                  String director = rs.getString("total_matches");
                                  String origin = rs.getString("match_win");
                                  String made = rs.getString("match_loss");
               
                empObj = new JSONObject();
                empObj.put("year", title);
                empObj.put("total_matches",director);
                empObj.put("match_win",origin);
                empObj.put("match_loss",made);
                empdetails.add(empObj);
                
            }
            responseObj.put("empdetails", empdetails);
        out.print(responseObj.toString());
        conn.close();
	}
        catch(Exception e){
            e.printStackTrace();
        }finally{
          
            }
        
	/*
	    out.println( "<table border=1>" );
            while ( rs.next() ) {
                String title = rs.getString("year");
                String director = rs.getString("total_matches");
                String origin = rs.getString("match_win");
                String made = rs.getString("match_loss");
               
                out.println("<tr><td>"+title+"</td><td>"+director+"</td><td>"+origin+"</td><td>"+
			made+"</td></tr>" );
            }
	    out.println( "</table>" );

            conn.close();
        } catch (Exception e) {
            out.println( "<h1>exception: "+e+e.getMessage()+"</h1>" );
        }
        */
%>
</body>
</html>