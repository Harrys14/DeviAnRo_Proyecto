NOTA:

El sistema cuenta con implementación de Servlets (LoginServlet y RegistroServlet), conexión a base de datos mediante JDBC a través de la clase UsuarioDAO y páginas JSP para pruebas de interacción dinámica.

El proyecto incluye el uso de métodos GET y POST, además de formularios HTML conectados con componentes backend desarrollados en Java conforme a los requerimientos de la evidencia.

Durante las pruebas, se evidenció que para la ejecución completa del login, registro y procesamiento de JSP es necesario un servidor de aplicaciones como Apache Tomcat, ya que los Servlets y JSP no pueden ejecutarse directamente desde archivos HTML abiertos en el navegador.

Debido a que no se configuró un servidor en este entorno, se implementó una simulación visual en el frontend que permite la navegación entre páginas (login, registro, home, carrito y cuenta) para efectos de demostración y visualización de la aplicación.

Sin embargo, toda la estructura backend requerida (Servlets, DAO, conexión JDBC y JSP) se encuentra desarrollada e incluida dentro del proyecto.
