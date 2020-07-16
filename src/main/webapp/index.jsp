<%
    String hostname = "https://localhost:8443";
response.setHeader("Feature-Policy",
        "ch-width "+hostname+", ch-viewport-width "+hostname+", ch-ua-full-version "+hostname);
response.setHeader("Accept-CH", "DPR, Width, Viewport-Width, Downlink");
response.setHeader("Access-Control-Allow-Origin", "*");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <script src="https://localhost:8443/some.js" type="application/javascript"></script>
    </head>
    <body>
        <pre id="1st"></pre>
        <pre id="3rd"></pre>
    </body>
</html>