# Escuela Colombiana de Ingeniería Julio Garavito - Arquitecturas de Software ARSW - Parcial Segundo Tercio

## Correr proyecto

Primero Clonaremos el repositorio, para eso desde nuestro navegador nos dirigiremos al siguiente link

```sh
https://github.com/Javier200151/LOPEZ-ARSW-T2
```

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
git clone https://github.com/Javier200151/LOPEZ-ARSW-T2
 ```

 Y luego entraremos a la carpeta

```sh
$ cd openweather
 ```
Descargaremos y compilaremos el proyecto con el siguiente comando  
Este comando nos descargara la dependencias necesarias

 ```sh
$ mvn package
 ```
 Y finalmente para ejecutar la aplicación.

 ```sh
$ mvn spring-boot:run
 ```

### Prerequisitos

* Tener conocimientos básicos en la terminal o CMD
* Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.

## Despliegue en Heroku:
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://lopez-arsw-t2.herokuapp.com)

# Extensibilidad
Lo que lo hace extensible es su bajo acoplamiento entre clases permitiendo la creación o inserción de nuevas funcionabilidades que requieran entidades e implementaciones nuevas. Por otra parte el backend es facilmente adaptable un frontend diferente, pues si estos se separán se puede adaptar a un aplicativo movil