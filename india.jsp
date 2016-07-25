<%@page import="com.project.India"%>
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
      
       
    	 google.charts.load('current', {'packages':['line']});
         google.charts.setOnLoadCallback(drawChart);

       function drawChart() {

    	   var data = new google.visualization.DataTable();
           data.addColumn('string','Year');
           data.addColumn('number','Matches Won' );
           data.addColumn('number','Matches Loss' );
           
           
           data.addRows([
                         <c:forEach items="${indias}" var="entry">
         				 [ '${entry.year}',${entry.match_win},${entry.match_loss}],
         				 </c:forEach>
                      ]);
         
          
            
            var options = {
          	        chart: {
          	          title: 'India\'s Performance',
          	          subtitle: 'India\'s Performace Year-Wise'
          	        },
          	      width: 900,
                  height: 500
          	       
          	      };

          	      var chart = new google.charts.Line(document.getElementById('line_top_x'));

          	      chart.draw(data, options);
        	    }      
    </script>
   
</head>
<body>

	<div id="line_top_x"></div>
	
</body>
</html>





