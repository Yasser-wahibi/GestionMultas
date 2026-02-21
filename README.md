# GestionMultas
Las 3 Obligatorias:
Spring Web: Es la herramienta principal. Nos permite crear los @RestController, mapear las rutas (como el POST /api/multas...) y que nuestro programa entienda y devuelva JSON.

Spring Data JPA: Esta es la magia para hablar con la base de datos. Nos permite usar las etiquetas @Entity, @OneToMany y crear repositorios sin escribir casi nada de SQL manual. (Por debajo usa Hibernate).

H2 Database: Es una base de datos "en memoria". ¿Por qué usamos esta hoy? Porque no quiero que pierdas tiempo instalando MySQL o configurando contraseñas en tu ordenador. H2 arranca con tu programa y se borra al apagarlo, es perfecta para hacer pruebas y simulacros como este.

Las 2 Recomendadas (Nivel Pro):
Lombok: Si no la has usado en clase, te va a cambiar la vida. Evita que tengas que escribir a mano todos los getters, setters y constructores de tus clases. Pones un @Data arriba de la clase y listo. A los seniors nos encanta porque deja el código súper limpio.

Validation (Spring Boot Starter Validation): Para que en un futuro podamos comprobar automáticamente si un DNI tiene el formato correcto o si nos pasan un campo vacío.
