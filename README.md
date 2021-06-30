# JavaSkillsBaseline

# 2. Curso de Programacion Orientada a Objetos

## 2.1 Conceptos Basicos

**Que es la Programacion Orientada a Objetos (OOP)?**

Es un paradigma de la programacion que se basa en el concepto de clases y objetos.

**Que es una clase?**

Una clase puede ser definida como un template, en el cual se definen sus atributos y su comportamiento (metodos). A traves de las clases se crean los objetos.

Ejemplo

```Java
public class Persona {
   private String nombre;
   private String apellido;
}
```

**Constructores**

Los constructores permiten instanciar una clase (crear un objeto).Los constructores pueden llevar parametros o no.

Ejemplo de constructor vacio (sin parametros)
```Java                                                                  
public Persona() {}
```
Ejemplo de constructor con parametros
```Java
public Persona(String nombre, String apellido) {
      this.nombre = nombre;
      this.apellido = apellido;
}
```

**Que es un objeto?**

Es una instancia de una clase y posee los atributos y el comportamiento definido por esta.
Los objetos pueden relacionarse entre si.Esta relacion se la conoce como colaboracion y pueden ser de 3 tipos distinto:
 - Asociacion: las instancias son independientes entre si y tienen ciclos de vida diferentes. Ej: un alumno puede tener un maestro y un maestro puede tener varios alumnos.
   Ambas entidades son independientes y pueden existir sin la otra.
 - Agregacion: Si una clase tiene como referencia a otra clase, esto se lo conoce como agregacion. Representa una relacion de HAS-A
   Ej: Una clase Empleado tiene como atributos nombre, id, edad, etc. Ademas tiene un objeto llamado direccion, el cual tiene sus propios atributos.
 - Composicion: Un objeto deja de existir si el objeto del cual depende es destruido. Ej: si una casa es destruida, sus habitaciones tambien dejaran de existir.

## 2.2 Herencia

Una clase puede heredar atributos y comportamientos de la clase padre, y ademas puede definir sus propios atributos y comportamientos.
Existen 3 tipos de herencia.
 * Simple: Una clase hereda de una sola clase padre.
 
 ![image](https://user-images.githubusercontent.com/40470742/123968044-42d7ff00-d98d-11eb-8afa-5a6e2899a643.png)
 * Multiple: Una clase hijo hereda de mas de una clase padre.Ej: La clase cocodrilo hereda de animal terrestre y animal acuatico.
 * Multinivel: La herencia se da por niveles.Ej: Elefante hereda de mamifero, que a su vez hereda de animal.
 * Jerarquica:
 
 ![image](https://user-images.githubusercontent.com/40470742/123968843-00fb8880-d98e-11eb-9a78-6bdaf4362956.png)
 
 * Hibrida
 
 ![image](https://user-images.githubusercontent.com/40470742/123968934-1a043980-d98e-11eb-84e2-419199751159.png)
 
 ### Clases Abstractas e Interfaces
 
 **Clases Abstractas**
  * Una clase abstracta es una clase que solo puede ser extendida, pero no instanciada (no se pueden crear objetos a partir de ellas).
  * Pueden contener metodos abstractos y metodos concretos.
  Ejemplo:
  ```Java
  public abstract class FiguraGeometrica {
     public abstract int CalcularArea(); // los metodos abstractos solo definen su encabezado, no contiene mas codigo
  }
  ```
 
 **Interfaces**
  * Al igual que las clases abstractas, las intefaces no pueden ser instanciadas y solo se usan para definir metodos.
  * Se usan para lograr herencia multiple (java no soporta herencia multiple, pero se puede solucionar usando interfaces).
  ```Java
  public interface Figura {
     public void Dibujar(); // Las interfaces solo soportan metodos abstractos
  }
  ```
  
  ## 2.3 Patrones de Diseño
  
  **Que son los Patrones de Diseño?**
  Los patrones de diseños son soluciones habituales a problemas que ocurren frecuentemente en el desarrollo del software. 
  Se agrupan en 3 categorias:
   * Creacionales: proporcionan mecanismos para crear objetos de forma limpia y flexible, favoreciendo la reutilizacion.
   * Estructurales: brindan convenciones para el armado de estructuras.
   * Comportamiento: tratan estrategias para implementar una comunicacion efectiva entre modulos y clases.
   
   ## 2.4 S.O.L.I.D
   
   **Que es SOLID?**
   
     * Single responsability: una clase debe tener solo una responsabilidad.
     * Open-close: abierto para extension, cerrado para cambios.
     * Lyskov substitution: una subclase puede ser reemplazada por otra de manera que no se altere el comportamiento.
     * Interface segregation: interfaces con los metodos justos y necesarios. Evitar las interfaces multiproposito.
     * Dependency injection: evitar el acoplamiento entre modulos.
    

 
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

git branch -
Este comando se usa para determinar en que rama se esta trabajando en ese momento, para crear una nueva rama o para eliminarlas

![image](https://user-images.githubusercontent.com/40470742/123808665-5882f100-d8c7-11eb-87ce-6d7689ccc679.png)




