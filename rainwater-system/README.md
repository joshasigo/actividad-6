Sistema Inteligente de Recolección y Purificación de Agua de Lluvia
Este proyecto implementa un sistema inteligente de recolección y purificación de agua de lluvia utilizando una arquitectura de microservicios. El sistema está desarrollado con Java y Spring Boot, y utiliza Docker para su despliegue.

Estructura del Proyecto
El proyecto está organizado en varios microservicios:

Servicio de Recolección: Responsable de recopilar datos sobre el agua de lluvia y gestionar el proceso de recolección.
Servicio de Purificación: Maneja la purificación del agua de lluvia recolectada y asegura que cumpla con los estándares de calidad.
Servicio Gateway: Actúa como un único punto de entrada para el cliente, enruta las solicitudes al microservicio correspondiente.
Tecnologías Utilizadas
Java
Spring Boot
Docker
Maven
Instrucciones de Configuración
Clonar el Repositorio:

Code
git clone <repository-url>
cd rainwater-system
Construir los Servicios: Navega a cada directorio de servicio y ejecuta:

Code
mvn clean install
Ejecutar los Servicios con Docker: Usa Docker Compose para iniciar todos los servicios:

Code
docker-compose up
Acceder a los Servicios:

Servicio de Recolección: http://localhost:<puerto-del-servicio-de-recolección>
Servicio de Purificación: http://localhost:<puerto-del-servicio-de-purificación>
Servicio Gateway: http://localhost:<puerto-del-servicio-gateway>
Directrices de Uso
Utiliza el Servicio Gateway para interactuar con los Servicios de Recolección y Purificación.
Consulta la documentación de cada servicio individual para conocer los endpoints específicos de la API y los formatos de solicitud/respuesta.
Contribuir

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
