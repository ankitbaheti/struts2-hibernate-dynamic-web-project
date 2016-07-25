<%@page import="com.project.Athletics"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="//code.jquery.com/jquery-1.12.0.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css"/>

<script>
$(document).ready(function() {
    $('#example').DataTable( {
        "order": [[ 3, "desc" ]]
    } );
} );
</script>

</head>
<body>

 <s:form action="addAthletics">
   <s:textfield name="event" label="Event"/>
   <s:textfield name="player_name" label="Name"/>
   <s:textfield name="record" label="Record"/>
   <s:textfield name="gender" label="Gender"/>
   <s:textfield name="nation" label="Nation"/>
   
   <s:submit/>
   <hr/>
 
   <table id="example" class="display" width="100%" cellspacing="0">
   <thead>
      <tr>
         <th style="color: 	#00ffff;">Event</th>
         <th style="color: 	#00ffff;">Name</th>
         <th style="color: 	#00ffff;">Record</th>
         <th style="color: 	#00ffff;">Gender</th>
         <th style="color: 	#00ffff;">Nation</th>
      
      </tr>
       </thead>
         <tfoot>
            <tr>
             <th>Event</th>
      	     <th>Name</th>
        	 <th>Record</th>
         	 <th>Gender</th>
           	 <th>Nation</th>
            </tr>
        </tfoot>
       <tbody>   
       <s:iterator value="athleticss">	
          <tr>
             <td><s:property  value="event"/></td>
             <td><s:property  value="player_name"/></td>
             <td><s:property  value="record"/></td>
             <td><s:property  value="gender"/></td>
             <td><s:property  value="nation"/></td>
           
            </tr>
       </s:iterator>
       </tbody>  
   </table>
   
         
   </s:form>



</body>
</html>