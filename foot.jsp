<%@page import="com.project.footballPlayers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://fusioncharts.js"></script>
   <script src="http://fusioncharts.charts.js"></script>
  <script type="text/javascript">
  
      
  FusionCharts.ready(function () {
	    var topStores = new FusionCharts({
	        type: 'bar2d',
	        renderAt: 'chart-container',
	        width: '400',
	        height: '300',
	        dataFormat: 'json',
	        dataSource: {
	            "chart": {
	                "caption": "Top 5 Stores by Sales",
	                "subCaption": "Last month",
	                "yAxisName": "Sales (In USD)",
	                "numberPrefix": "$",
	                "paletteColors": "#0075c2",
	                "bgColor": "#ffffff",
	                "showBorder": "0",
	                "showCanvasBorder": "0",
	                "usePlotGradientColor": "0",
	                "plotBorderAlpha": "10",
	                "placeValuesInside": "1",
	                "valueFontColor": "#ffffff",
	                "showAxisLines": "1",
	                "axisLineAlpha": "25",
	                "divLineAlpha": "10",
	                "alignCaptionWithCanvas": "0",
	                "showAlternateVGridColor": "0",
	                "captionFontSize": "14",
	                "subcaptionFontSize": "14",
	                "subcaptionFontBold": "0",
	                "toolTipColor": "#ffffff",
	                "toolTipBorderThickness": "0",
	                "toolTipBgColor": "#000000",
	                "toolTipBgAlpha": "80",
	                "toolTipBorderRadius": "2",
	                "toolTipPadding": "5"
	            },
	            
	            "data": [
	                {
	                    "label": "Bakersfield Central",
	                    "value": "880000"
	                }, 
	                {
	                    "label": "Garden Groove harbour",
	                    "value": "730000"
	                }, 
	                {
	                    "label": "Los Angeles Topanga",
	                    "value": "590000"
	                }, 
	                {
	                    "label": "Compton-Rancho Dom",
	                    "value": "520000"
	                }, 
	                {
	                    "label": "Daly City Serramonte",
	                    "value": "330000"
	                }
	            ]
	        }
	    })
	    .render();
	});         
    </script>

</head>
<body>

 
<div class="container">
  <h2>Panels with Contextual Classes</h2>
  <div class="panel-group">
    <div class="panel panel-default">
      <div class="panel-heading">Panel with panel-default class</div>
      <div class="panel-body">
      <div id="chart-container">FusionCharts will render here</div>
      </div>
    </div>

    <div class="panel panel-primary">
      <div class="panel-heading">Panel with panel-primary class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-success">
      <div class="panel-heading">Panel with panel-success class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-info">
      <div class="panel-heading">Panel with panel-info class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-warning">
      <div class="panel-heading">Panel with panel-warning class</div>
      <div class="panel-body">Panel Content</div>
    </div>

    <div class="panel panel-danger">
      <div class="panel-heading">Panel with panel-danger class</div>
      <div class="panel-body">Panel Content</div>
    </div>
  </div>
</div>


</body>
</html>