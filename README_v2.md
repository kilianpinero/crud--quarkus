# CRUD con Quarkus

Aplicacion CRUD simple desarrollado con Quarkus. Expone endpoints REST para realizar operaciones básicas en una entidad `Country`.

## Requisitos

- Java 11
- Maven 3.6.2
- H2 Database

## Ejecución

Para ejecutar la aplicación, simplemente ejecutar el siguiente comando:

```bash
./mvnw compile quarkus:dev
```

Esto iniciará la aplicación en modo de desarrollo. Puede acceder a los endpoints REST a través de `http://localhost:8080/country`.

## Endpoints

La aplicación expone los siguientes endpoints:

- `GET /country/list`: Obtiene la lista de todos los países.
- `GET /country/list/{id}`: Obtiene un país por su ID.
- `POST /country/add`: Agrega un nuevo país.
- `PUT /country/update`: Actualiza un país existente.
- `DELETE /country/{id}`: Elimina un país por su ID.


## Pruebas

El objetivo de esta operación es comprobar la rapidez con la que levanta el servicio y poder compararlo con otras aplicaciones hechas con lenguajes de programación diferentes.
Se han hecho 3 pruebas de lanzamiento de esta aplicación y los resultados son los siguientes:

- 3489ms
- 2929ms
- 2884ms

## Conclusión

La aplicación es bastante rápida y se podria considerar para fines en los que se necesite que la rapidez de respuesta sea casi inmediata.