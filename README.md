# JavaSkillsBaseline

1. Curso de Git

Comandos basicos

git init - 
Se usa para crear un repositorio vacio en un directorio
![image](https://user-images.githubusercontent.com/40470742/123145523-4b7f8100-d433-11eb-8019-591e788c2a97.png)

git status - 
Se usa para checkear los cambios en la rama activa
![image](https://user-images.githubusercontent.com/40470742/123145767-8b466880-d433-11eb-9681-d0085de29301.png)

git add - 
Agrega nuevos archivos al area de Staging
![image](https://user-images.githubusercontent.com/40470742/123145849-a2855600-d433-11eb-9897-b92491cab318.png)

git commit - 
Persiste todos los cambios hechos a un archivo en git
![image](https://user-images.githubusercontent.com/40470742/123145930-b92bad00-d433-11eb-8a08-10e4124d77e4.png)

git log - 
Se usa para ver todos los cambios hechos en un archivo, cuando se hicieron y quien o quienes los hicieron
![image](https://user-images.githubusercontent.com/40470742/123146037-d8c2d580-d433-11eb-9c50-e67f0c48bd6b.png)


2. Curso de Programacion Orientada a Objetos

2.1 Conceptos Basicos

Que es la Programacion Orientada a Objetos (OOP)?
Es un paradigma de la programacion que se basa en el concepto de clases y objetos.

Que es una clase?
Una clase puede ser definida como un template, en el cual se definen sus atributos y su comportamiento (metodos). A traves de las clases se crean los objetos.

Ejemplo

Public class Persona {
  private String nombre;
  private String apellido;
}

Que es un objeto?
Es una instancia de una clase y posee los atributos y el comportamiento definido por esta.
Los objetos pueden relacionarse entre si.Esta relacion se la conoce como colaboracion y pueden ser de 3 tipos distinto:
 - Asociacion: las instancias son independientes entre si y tienen ciclos de vida diferentes. Ej: un alumno puede tener un maestro y un maestro puede tener varios alumnos.
   Ambas entidades son independientes y pueden existir sin la otra.
 - Agregacion: Si una clase tiene como referencia a otra clase, esto se lo conoce como agregacion. Representa una relacion de HAS-A
   Ej: Una clase Empleado tiene como atributos nombre, id, edad, etc. Ademas tiene un objeto llamado direccion, el cual tiene sus propios atributos.
 - Composicion: Un objeto deja de existir si el objeto del cual depende es destruido. Ej: si una casa es destruida, sus habitaciones tambien dejaran de existir.
 
 




