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

**Herencia**

Una clase puede heredar atributos y comportamientos de la clase padre, y ademas puede definir sus propios atributos y comportamientos.
Existen 3 tipos de herencia.
 * Simple: Una clase hereda de una sola clase padre.
 * Multiple: Una clase hereda de mas de una clase.
 * Multinivel: La herencia se da por niveles.
 * Jerarquica:


 
 

