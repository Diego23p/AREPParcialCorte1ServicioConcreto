# 

Programa que retorna el valor de las funciones trigonomertricas cos, sin, tan

## Inicialización

Herramientas requeridas para ejecutar el programa

### prerrequisitos

#### Java

Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> java -version

java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)
```

#### Maven

La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> mvn -v

Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T13:41:47-05:00)
Maven home: C:\apache-maven-3.6.0\bin\..
Java version: 1.8.0_201, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_201\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git

Se usará el sistema de control de versiones Git, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> git --version

git version 2.21.0.windows.1
```

#### Heroku

La página web se encuentra alojada en la nube usando Heroku, para comprobar que se tengan los requisitos localmente:

```
> heroku -v

heroku/7.39.0 win32-x64 node-v12.13.0
```

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
> git clone https://github.com/Diego23p/<nombreeeeeeee>.git
```

Para compilar el proyecto usando Maven:
```
> mvn package
```

## Ejecutando el Programa

Para ejecutar el programa localmente haciendo uso de Heroku, se necesita desde la línea de comandos:
```
> mvn clean install

> heroku local web
```
En la página web se deben ingresar los números en el campo de ingreso separados por comas

## Heroku

La aplicación desplegada en la nube se encuentra en: 

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://still-hamlet-80792.herokuapp.com/)

# Descripción del Diseño

Cuenta con la clase principal main que resuelve qué función se está invcando y llama al método correspondiente en OperacionesImpl el cual resuelve la operación solicitada.

# Autores

- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)

# Licencia

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
