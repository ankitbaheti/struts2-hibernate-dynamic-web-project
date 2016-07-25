<%@page import="com.project.sport_class"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<s:head />
   
   <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      
      google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {
    	 
    	 dataTable = new google.visualization.DataTable();
   
          var newData = [
                         ['Name', 'win','loss'],
                         <c:forEach items="${sports}" var="entry">
         				 [ '${entry.name}',${entry.win},${entry.loss} ],
         				 </c:forEach>
          ];

          // determine the number of rows and columns.
          var numRows = newData.length;
          var numCols = newData[0].length;

          // in this case the first column is of type 'string'.
          dataTable.addColumn('string', newData[0][0]);

          // all other columns are of type 'number'.
          for (var i = 1; i < numCols; i++)
            dataTable.addColumn('number', newData[0][i]);           

          // now add the rows.
          for (var i = 1; i < numRows; i++)
            dataTable.addRow(newData[i]);            

        var options = {
          chart: {
            title: 'Company Performance',
            subtitle: 'Sales, Expenses, and Profit: 2014-2017',
          },
          bars: 'horizontal' // Required for Material Bar Charts.
        };

        var chart = new google.charts.Bar(document.getElementById('barchart_material'));

        chart.draw(dataTable, options);
      }
      
    </script>
   
</head>
<body>

 <div id="barchart_material" style="width: 300px; height: 300px;"></div>
 
 
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



