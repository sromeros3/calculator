# Instruciones de uso
Microservicio generado para prueba (MVN/SPRING-BOOT)

API REST que realiza operaciones matemáticas básicas. Integrada con la librería local TRACER

La API REST tiene una única ruta GET /api/calcula que acepta tres parámetros: primero, segundo, y operacion.
Estos parámetros se deben pasar por URL en formato URLEncoded. 
Los valores aceptados para el parámetro operacion son suma, resta, multiplicación, y division.

Para utilizar el proyecto, primero debes descargar el repositorio de GitHub y verificar que tienes la última versión de Maven instalada y Java en tu sistema. 

Luego, ejecuta los siguientes comandos en la línea de comandos en la carpeta raíz del proyecto:

- mvn validate
- mvn verify
- mvn clean install

Esto instalará las dependencias locales y compilará el proyecto, generando un archivo JAR final llamado calculadora-spring-boot.jar en la carpeta target.

Para ejecutar el proyecto, simplemente usa el comando:

java -jar target/calculadora-spring-boot.jar
Esto iniciará la API REST en http://localhost:8080/api/calcula.

Para probar la API, puedes enviar una solicitud GET a la ruta http://localhost:8080/api/calcula con los parámetros requeridos. Por ejemplo:

GET http://localhost:8080/api/calcula?primero=4&segundo=9&operacion=suma

Esto devuelve una respuesta con el resultado de la operación solicitada, que en este caso es 13.0.

## Tests
Para ejecutar los [tests](src/test/java) debes ejecutar el comando `mvn clean test`.
