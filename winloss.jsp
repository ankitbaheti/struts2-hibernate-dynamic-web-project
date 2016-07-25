<%@page import="com.project.sport_class"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Google Chart</title>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
    // Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {
        'packages' : [ 'corechart' ]
    });

    // Set a callback to run when the Google Visualization API is loaded.
    google.setOnLoadCallback(drawChart);

    // Callback that creates and populates a data table,
    // instantiates the pie chart, passes in the data and
    // draws it.
    function drawChart() {

        // Create the data table.
        //var data = new google.visualization.DataTable();
        //data.addColumn('string', 'Topping');
        //data.addColumn('number', 'Slices');
        /*data.addRows([
                    <c:forEach items="${pieDataMap}" var="entry">
                        [ '${entry.key}', ${entry.value} ],
                    </c:forEach>
                    ]);*/        
        var data = google.visualization.arrayToDataTable([
                                                              ['Country', 'win'],
                                                              <c:forEach items="${sports}" var="entry">
                                                                  [ '${entry.name}',${entry.win} ],
                                                              </c:forEach>
                                                        ]);

        // Set chart options
        var options = {
            'title' : 'Matches won by Country', //title which will be shown right above the Google Pie Chart
            is3D : true, //render Google Pie Chart as 3D
            pieSliceText: 'label', //on mouse hover show label or name of the Country
            tooltip :  {showColorCode: true}, // whether to display color code for a Country on mouse hover
            'width' : 900, //width of the Google Pie Chart
            'height' : 500 //height of the Google Pie Chart
        };

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
    }
</script>
</head>
<body>
    <div style="width: 600px;">
        <div id="chart_div"></div>
    </div>
     <s:form action="addSport">
   <s:textfield name="id" label="id"/>
   <s:textfield name="Name" label="Name"/>
   <s:textfield name="win" label="win"/>
   <s:textfield name="loss" label="loss"/>
   <s:submit/>
   <hr/>
 
   <table>
      <tr>
         <th>Name</th>
         <th>win</th>
         <th>loss</th>
      </tr>
      
       <s:iterator value="sports">	
          <tr>
             <td><s:property  value="Name"/></td>
             <td><s:property  value="win"/></td>
             <td><s:property  value="loss"/></td>
            </tr>
       </s:iterator>
 
   </table>
   
         
   </s:form>
    
</body>
</html>