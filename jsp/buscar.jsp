<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Búsqueda</title>
</head>

<body>

<h1>Buscar producto</h1>

<form method="get">

    <input type="text" name="producto" placeholder="Buscar producto">

    <button type="submit">
        Buscar
    </button>

</form>

<%

String producto = request.getParameter("producto");

if(producto != null){

%>

<h2>Resultado:</h2>

<p>
    Producto buscado:
    <strong><%= producto %></strong>
</p>

<%

}

%>

</body>
</html>