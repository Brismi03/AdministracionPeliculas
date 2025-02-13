# APLICACIÓN PARA LA ADMINISTRACIÓN DE PELÍCULAS 

##L a aplicación permite agregar una nueva pelicula que incluye su nombre, imagen (url), duración y clasificación, así como su horario que incluye fecha y hora de la película; además de 
buscar peliculas por su nombre, clasificación, editar y eliminar registros, desarrollado con spring boot y MySQL. 


## Tecnologías utilizadas 
- Spring boot 
- Spring Data JPA
- MySQL
- Spring web 
- GitHub

  
## *1.Clonar este repositorio*
- git clone https://github.com/Brismi03/AdministracionPeliculas.git
- cd AdministracionPeliculas

  
## *2. Configurar la BD*
- Crear una BD con el nombre 'adminpeliculas' 
- Importar el archivo que esta en BD/Dump20250212.sql

  
## *3. Editar application.properties*
- spring.datasource.url=jdbc:mysql://localhost:3306/adminpeliculas
- spring.datasource.username=TU_USUARIO
- spring.datasource.password=TU_CONTRASEÑA
  
## *Principales Endpoints* 
- GET - http://localhost:9000/PeliculasWs/listar -- Obtiene todas las peliculas
- POST -http://localhost:9000/PeliculasWs/guardar --Agregar una nueva pelicula 
- POST - http://localhost:9000/PeliculasWs/buscar -- Obtiene peliculas por ID 
- POST - http://localhost:9000/PeliculasWs/editar --Edita un registro de pelicula
- POST - http://localhost:9000/PeliculasWs/eliminar --Elimina el registro 
- POST - http://localhost:9000/PeliculasWs/buscarByNombre --Obtiene una pelicula por su nombre 
- POST - http://localhost:9000/PeliculasWs/buscarByClasificacion --Obtiene las peliculas por clasificación

- GET - http://localhost:9000/HorarioWs/listar - Obtiene todos los horarios 
- POST - http://localhost:9000/HorarioWs/buscar -Busca un horario por su id 
- POST - http://localhost:9000/HorarioWs/guardar -Guarda un nuevo horario 
- POST - http://localhost:9000/HorarioWs/eliminar -Elimina un horario 
- POST - http://localhost:9000/HorarioWs/editar -Edita un horario 
