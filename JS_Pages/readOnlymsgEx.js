<html>
<head>
  <script type="text/javascript">
    function message()
    {
        document.getElementById("para1").innerHTML = "WELCOME  " + document.getElementById("tf").value
    }
    function enableTf()
    {
       if(document.getElementById("cb").checked==true)
          {document.getElementById("tf").readOnly=false} //make it editable
      
          else
        document.getElementById("tf").readOnly=true  //make it non editable

    }
  </script>
</head>
<body>
Other details : <input type="checkbox" id="cb" onchange="enableTf()" />
Enter your name :<input type="text" id="tf" readonly value="enter here" oninput="message()" />
<p id="para1">
  WELCOME
</p>
</body>
</html>