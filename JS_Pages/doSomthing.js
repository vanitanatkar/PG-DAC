<html>
    <script type="text/javascript" src="./classcalculate.js">
    </script>
    <script type="text/javascript">
      function dosmthing()
        {
            n1 = document.getElementById("first").value
            n2 = document.getElementById("second").value
             op =  document.getElementById("operation").value

           result_str = n1 +" "+op+" "+n2+"=" + calculate(n1,n2,op)
           document.getElementById("result").innerHTML = result_str

        }

    </script>
    <body>
        <input type="number" id="first" />
        <input type="number" id="second" />
        <select id="operation" onchange="dosmthing()" >
            <option>select operation</option>
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
        </select>
        <p id="result"></p>
    </body>
</html>