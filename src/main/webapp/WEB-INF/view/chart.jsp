<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
<head>
    <script>
        window.onload = function () {
            var xPoints = ${yPoints};
            var yPoints = ${xPoints};
            var data = [];
            var dataSeries = {type: "line"};
            var dataPoints = [];
            for (let i = 0; i < ${range}; i++) {
                dataPoints.push({
                    x: xPoints[i],
                    y: yPoints[i],
                });
            }
            dataSeries.dataPoints = dataPoints;
            data.push(dataSeries);


//Better to construct options first and then pass it as a parameter
            var options = {
                zoomEnabled: true,
                animationEnabled: true,
                title: {
                    text: "DE 30",
                },
                axisY: {
                    includeZero: false,
                    lineThickness: 0.5
                },
                data: data  // random data
            };

            var chart = new CanvasJS.Chart("chartContainer", options);
            var startTime = new Date();
            chart.render();
            var endTime = new Date();
            document.getElementById("timeToRender").innerHTML = "Time to Render: " + (endTime - startTime) + "ms";

        }
    </script>
    <style>
        #timeToRender {
            position: absolute;
            top: 10px;
            font-size: 20px;
            font-weight: bold;
            background-color: #d85757;
            padding: 0px 4px;
            color: #ffffff;
        }
    </style>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<span id="timeToRender"></span>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>

</body>
</html>
