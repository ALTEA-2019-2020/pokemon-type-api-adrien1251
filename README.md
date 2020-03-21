# Pokemon type

This API is implemented the pokedex to search first gen of pokemon

# Configuration 

This project run with pokemon json in french or english
 
## Run the project 

`mvn clean install && mvn spring-boot:run`

The application is started on port 8080

# Implementation 

This API is available on this link : [`https://trainer-api-adriend.herokuapp.com/`](https://trainer-api-adriend.herokuapp.com/)

Available routes:

`GET pokemon-types/`                         : Get all pokemons  

`GET pokemon-types/<id>`                     : Get specific pokemon with id

`POST pokemon-types/?name=<pokemon_name>`    : Get specific pokemon with name

`PUT pokemon-types/?types=<list_string_type>`: Get all pokemons with this types
 