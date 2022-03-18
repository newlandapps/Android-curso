# Curso Android newlandapps
## Tareas
##### crear un proyecto con nombre propio
##### crear una activity nueva y dirigir el intent mainactivity a esta clase
##### crear una clase fragment nueva y un boton en el menu para cambiar el fragmentlayout
##### Implementar un splash screen de lottie files
##### cambiar los iconos del menu por unos propios
##### crear un modulo con arquitectura MVP y sus clases con nombres correspondientes
##### revisar el modulo de google maps que se actualizo en el repositorio
#
#Subir los cambios al git en una rama personal al proyecto en github
#
#
https://www.figma.com/file/zoA4MU9yn1lKssuBAUG1iE/on-road?node-id=2394%3A18535


##RETO DE EXAMEN
https://www.jsonschema2pojo.org/
![image](https://user-images.githubusercontent.com/98972848/159066372-93460a82-c296-4c2a-b975-16483f4c434f.png)
#### Dentro del folder de onroad plus crear una carpeta nueva llamada examen
#### generar un nuevo item en el menu con el mapa que contenga un botton que cambie el fragment del mapa por uno con dos listas
#### estas listas consumiran la lista de vehiculos y empleados respectivamente y contendran un filtro para cada caso
#### el flujo del splash y el login deben guardar el token en las shared preferences
#### la llave para el mapa seguira siendo la que se encuentra en el proyecto dentro del repositorio en el manifest
#### la arquitectura de este modulo debe ser MVP
#### los enpoints a agregar son los siguientes
#### catalog/getEmployees
#### catalog/getUnit
#### los parametros del request son los siguientes
### request
```
{
  "flag_parent": true,
  "token": "44391ebd034e667e213bffeca5887ea2"
}
```
### response
```
{
  "responseCode": 105,
  "message": "Operation success",
  "data": [
    {
      "origin_adm": 16,
      "cve_vehicle": 102,
      "vehicle_name": "RE4073",
      "vehicle_plate": "LB16904",
      "vehicle_vin": "1M2AX18C2GM036047",
      "vehicle_year": "2016"
    }
  ]
}
```
#### sacar el modelo con el siguiente enlace


