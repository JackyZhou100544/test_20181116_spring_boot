<! DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <link href="/css/index.css" rel="stylesheet"/>
</head>
<body>
<center>
    <img src="/images/f44d305ea0a2194a77c819.jpg"/>
    <h1 id="title">${title}</h1>
</center>
<script type="text/javascript" src="/webjars/jquery/2.1.4/juery.min.js"></script>
<script>
    $(function(){
        $('#title').click(function(){
              alert("点击了");
        });
    })

</script>
</body>
</html>