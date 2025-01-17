# Foro Alura

## Descripción del proyecto
Foro Alura es una aplicación backend desarrollada en Java con el framework Spring Boot. Este proyecto implementa una conexión a una API REST y utiliza una base de datos SQL para gestionar la información. La arquitectura está basada en patrones de diseño modernos y buenas prácticas, asegurando un código limpio y mantenible.

El objetivo principal es proporcionar un entorno eficiente para gestionar temas o "tópicos" relacionados con el curso Sprig Boot del programa ONE (Oracle Next Education) desarrollado en colaboración entre Oracle y Alura, incluyendo funcionalidades CRUD (Crear, Leer, Actualizar y Eliminar).

---

## Características principales
- **Framework:** Spring Boot para facilitar el desarrollo rápido de aplicaciones backend.
- **Persistencia:** JPA con Hibernate como implementación para gestionar las operaciones con bases de datos.
- **Lombok:** Reducción de código repetitivo gracias a anotaciones como `@RequiredArgsConstructor`.
- **Estructura limpia:** Dividido en capas (`Controller`, `Service`, `Repository` y `Model`) para mantener una separación clara de responsabilidades.
- **Licencia MIT:** Este proyecto es de uso libre bajo los términos de la licencia MIT.

---

## Requisitos del sistema
Para ejecutar este proyecto, asegúrate de tener instalado lo siguiente:

- **Java JDK:** Versión 17 o superior. Descarga la última versión LTS de forma gratuita.
- **Maven:** Versión 4 o superior para gestionar las dependencias.
- **Spring Boot:** Versión 3 o superior. Puedes iniciar desde [Spring Initializr](https://start.spring.io/).
- **MySQL:** Versión 8 o superior. Descarga el instalador desde [MySQL Installer](https://dev.mysql.com/downloads/installer/).
- **IDE:** IntelliJ IDEA para un entorno de desarrollo integrado robusto.

---

## Instalación y configuración

### 1. Clonar el repositorio
Clona este repositorio en tu máquina local utilizando el siguiente comando:

```bash
git clone https://github.com/NFabian-Parra/Challenge_ForoHub.git
```

### 2. Configuración de la base de datos
- Asegúrate de tener una base de datos MySQL en funcionamiento.
- Crea una base de datos con el nombre de tu preferencia `NOMBRE_DB`.
- Configura las credenciales de la base de datos en el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/NOMBRE_DB
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASENA
```

### 3. Construcción del proyecto
- Navega al directorio raíz del proyecto.
- Ejecuta el siguiente comando para construir el proyecto:

```bash
mvn clean install
```

### 4. Ejecución de la aplicación
Inicia la aplicación ejecutando el siguiente comando:

```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`.

---

## Estructura del proyecto
El proyecto sigue una estructura modular para garantizar claridad y escalabilidad:

- **`controller`:** Contiene las clases que gestionan las solicitudes HTTP.
- **`model`:** Define las entidades y modelos utilizados para la persistencia de datos.
- **`repository`:** Interfaces para interactuar con la base de datos.
- **`service`:** Implementa la lógica de negocio y las operaciones necesarias.

---

## Endpoints principales

### Tópicos

1. **Listar todos los tópicos:**
   - **Método:** GET
   - **URL:** `/topicos`

2. **Obtener un tópico por ID:**
   - **Método:** GET
   - **URL:** `/topicos/{id}`

3. **Crear un nuevo tópico:**
   - **Método:** POST
   - **URL:** `/topicos`

4. **Actualizar un tópico existente:**
   - **Método:** PUT
   - **URL:** `/topicos/{id}`

5. **Eliminar un tópico:**
   - **Método:** DELETE
   - **URL:** `/topicos/{id}`

---

## Tecnologías utilizadas
- **Java 17**
- **Spring Boot 3**
- **Maven**
- **MySQL**
- **JPA/Hibernate**
- **Lombok**

---

## Contribuciones
Si deseas contribuir al proyecto, sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea una nueva rama para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -m 'Añade nueva funcionalidad'`).
4. Sube tus cambios a tu fork (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

---

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

