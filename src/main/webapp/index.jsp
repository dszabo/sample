<%@ page import="com.packtpub.Calculator"%>
<html>
<body>
<h2>Hello World!</h2>
<% Calculator calculator = new Calculator();
   int sum = calculator.sum(1, 2);
   out.print("1 + 2 = " + sum);
%>
</body>
</html>
