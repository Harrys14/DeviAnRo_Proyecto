NOTA:

El sistema cuenta con implementación de Servlets (LoginServlet y RegistroServlet) y conexión a base de datos mediante JDBC a través de la clase UsuarioDAO.

Durante las pruebas, se evidenció que para la ejecución completa del login y registro es necesario un servidor de aplicaciones (Apache Tomcat), ya que los Servlets no pueden ejecutarse directamente desde archivos HTML abiertos en el navegador.

Debido a que no se configuró un servidor en este entorno, se implementó una simulación en el frontend que permite la navegación entre páginas (login, registro y home) para efectos de visualización.

Sin embargo, todo el backend requerido (Servlets, DAO, conexión JDBC) se encuentra completamente desarrollado conforme a los requerimientos del proyecto.
