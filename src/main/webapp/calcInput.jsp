<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2021-08-06
  Time: 오전 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
 <h1>Input</h1>

 <form action="calcResult.jsp" method="post" target="zero">
     <div>
         <input type="number" name="num1">
     </div>
     <div>
         <input type="number" name="num2">
     </div>
     <div>
         <select name="oper">
             <option value="add"> + </option>
             <option value="sub"> - </option>
             <option value="mul"> * </option>
             <option value="div"> / </option>
         </select>
     </div>
     <div>
         <button type="submit">SUBMIT</button>
     </div>


 </form>

 <iframe name="zero"></iframe>

 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
</body>
</html>
