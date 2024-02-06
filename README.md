## CRUD with Quarkus

Simple CRUD application developed with Quarkus. It exposes REST endpoints to perform basic operations on a `Country` entity.

## Requirements

- Java 11
- Maven 3.6.2
- H2 Database

## Execution

To run the application, simply execute the following command:

```bash
./mvnw compile quarkus:dev
```

This will start the application in development mode. You can access the REST endpoints via `http://localhost:8080/country`.

## Endpoints

The application exposes the following endpoints:

- `GET /country/list`: Get the list of all countries.
- `GET /country/list/{id}`: Get a country by its ID.
- `POST /country/add`: Add a new country.
- `PUT /country/update`: Update an existing country.
- `DELETE /country/{id}`: Delete a country by its ID.

## Testing

The purpose of these tests is to check the speed at which the service starts and compare it with other applications built with different programming languages. Three launch tests have been conducted for this application with the following results:

- 3489ms
- 2929ms
- 2884ms

## Conclusion

The application is quite fast and could be considered for use cases where almost immediate response speed is required.
