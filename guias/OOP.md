# Programación Orientada a Objetos

La **Programación Orientada a Objetos (POO)** es un paradigma de desarrollo de software que organiza el código en torno a entidades llamadas objetos. Cada objeto es una representación de un elemento del mundo real o conceptual y posee:​

- **Atributos:** También conocidos como propiedades o características, representan el estado o la información que el objeto mantiene.​

- **Métodos:** Son las funciones o comportamientos que el objeto puede realizar, definiendo su interacción con otros objetos o con el propio sistema.​

El objetivo principal de la POO es mejorar la modularidad, la reutilización y la flexibilidad en el diseño de software, facilitando el mantenimiento y la escalabilidad de las aplicaciones.

---

## Clases e Instancias

En POO, una clase es una plantilla o modelo que define un conjunto de atributos y métodos comunes a todos los objetos de un determinado tipo. Es decir, la clase establece la estructura y el comportamiento que tendrán sus objetos.​

Una instancia es la creación de un objeto específico basado en una clase. Al instanciar una clase, se genera un objeto con valores concretos en sus atributos y la capacidad de ejecutar los métodos definidos en la clase.​

```java
// Definición de la clase
public class Coche {
    // Atributos
    String marca;
    String modelo;
    int año;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

// Creación de una instancia de la clase
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        miCoche.mostrarDetalles(); // Salida: Marca: Toyota, Modelo: Corolla, Año: 2020
    }
}
```

---

## Principios Fundamentales de la POO

### 1. Abstracción

La **abstracción** consiste en identificar y representar los aspectos más importantes de un objeto o sistema, definiendo **atributos** (datos) y **métodos** (funcionalidades) que son relevantes para el contexto del problema.  
Por ejemplo, al modelar un automóvil, podríamos enfocarnos en atributos como `marca`, `modelo` y `año`, y métodos como `acelerar()`, `frenar()`, ignorando detalles internos del motor o la mecánica de combustión.

### 2. Encapsulamiento en Programación Orientada a Objetos

El **encapsulamiento** consiste en agrupar los atributos y métodos dentro de una misma clase, y restringir el acceso a estos componentes desde el exterior. Esto se logra mediante el uso de modificadores de acceso, que determinan qué partes de la clase son visibles o modificables desde otras clases.

#### Modificadores de Acceso

- **public:** El atributo o método es accesible desde cualquier lugar.
- **private:** Solo es accesible dentro de la misma clase.
- **protected:** Es accesible dentro de la misma clase y en subclases.

#### Ejemplo Práctico

```java
public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor para inicializar la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el atributo 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo 'edad'
    public int getEdad() {
        return edad;
    }

    // Setter para el atributo 'edad' con validación
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
}
```

### 3. Herencia en Programación Orientada a Objetos

La **herencia** es un mecanismo que permite a una **subclase** (clase hija) adquirir atributos y métodos de una **superclase** (clase padre). Esto facilita la reutilización de código y la organización de las clases en una estructura jerárquica.

#### Ejemplo Práctico

```java
class Persona {
  // Atributos de la clase Persona
  protected String nombre;
  protected String apellido;
  // Constructor de la clase Persona

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  // Método para mostrar los datos de la persona
  public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
  }
}

class Alumno extends Persona {
  // Atributo adicional de la clase Alumno
  private int legajo;
  // Constructor de la clase Alumno
  
  public Alumno(String nombre, String apellido, int legajo) {
    super(nombre, apellido);
    this.legajo = legajo;
  }
  // Método para mostrar los datos del alumno   (sobrescribe el método de la clase Persona)

  @Override
  public void mostrarDatos() {
    super.mostrarDatos(); // Llama al método   mostrarDatos() de la clase Persona
  System.out.println("Legajo: " + legajo);
  }
}
```

### 4. Polimorfismo

El **polimorfismo** es la capacidad de un objeto para adoptar diferentes formas o comportamientos según el contexto en el que se utilice. Esto permite tratar de manera uniforme a objetos de distintas clases a través de una misma interfaz, adaptando su comportamiento en función de la referencia utilizada.

#### Tipos de Polimorfismo

1. **Polimorfismo de Subtipo (o Inclusión):**  
Permite que un objeto de una clase derivada se utilice como si fuera de su clase base. Esto significa que métodos definidos en la superclase pueden ser sobrescritos en la subclase, permitiendo comportamientos específicos dependiendo del tipo real del objeto.

2. **Polimorfismo Paramétrico (o Sobrecarga):**
Permite definir múltiples métodos con el mismo nombre en una misma clase, pero con diferentes parámetros (firma del método). Cada versión del método se ejecuta dependiendo del tipo y/o número de argumentos proporcionados, adaptándose a la necesidad específica.
