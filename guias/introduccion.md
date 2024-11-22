# 🚀 Introducción a Java

---

## 🛠️ Configurando la Clase Principal y Método `main`

En Java, todo comienza con una clase principal y un método `main`, que es el punto de entrada para cualquier programa. A continuación, un ejemplo básico:

```java
public class Ejemplo {
    public static void main(String[] args) {
        // Tu código aquí
    }
}
```

### 📌 Explicación del Código

* **`public class Ejemplo`**
  * Declara una clase pública llamada `Ejemplo`.
  * En Java, todo el código debe estar dentro de una clase.
  * El nombre del archivo debe coincidir con el nombre de la clase.

* **`public static void main(String[] args)`**
  * **`public`**: El método es accesible desde cualquier lugar.
  * **`static`**: Permite ejecutar el método sin crear una instancia de la clase.
  * **`void`**: El método no devuelve ningún valor.
  * **`main`**: Nombre reservado que indica el punto de entrada del programa.
  * **`String[] args`**: Parámetro que permite recibir argumentos desde la línea de comandos.

---

## ✨ Ejemplo en Acción

Ejemplo completo para imprimir un mensaje en la consola:

```java
public class HolaMundo{
    public static void main(String[] args) {
        System.out.println("Hola mundo!");
    }
}
```

### 🖥️ ¿Qué Hace este Programa?

* **`System.out.println("Hola Mundo con Java");`**
    * **`System`**: Una clase predefinida en Java que proporciona acceso al sistema.
    * **`out`**: Un campo estático de la clase System que representa la salida estándar.
    * **`println`**: Un método que imprime una línea de texto a la consola.


## 📝 Declaración de Variables

En Java, una variable es un contenedor que almacena datos que pueden cambiar durante la ejecución de un programa. Cada variable tiene un **nombre**, un **tipo de dato**, y un **valor**.

---

### 🔑 Tipos de Variables en Java

1. **Primitivas**: Almacenan valores simples.
  - **Enteros**: `byte`, `short`, `int`, `long`
  - **Punto Flotante**: `float`, `double`
  - **Carácter**: `char`
  - **Booleano**: `boolean` (verdadero o falso)

2. **De Referencia**: Almacenan direcciones de memoria donde están los datos.
  - **Cadenas**: `String`
  - **Arreglos**: `int[]`, `String[]`, etc.
  - **Objetos**: Instancias de clases creadas por el usuario o predefinidas.

### 🛠️ Declaración y Asignación de Variables

```java
// Declaración de una variable
int numero;
numero = 10; // Asignación de valor

// Declaración y asignación simultánea
int edad = 25;
```

---

## 🌟 Ejemplos de Variables en Java

```java
// Variables primitivas
byte nivel = 3;       // Entero pequeño
float precio = 19.99f; // Número decimal
char letra = 'A';     // Carácter
boolean activo = true; // Booleano

// Variables de referencia
String saludo = "Hola, Java"; // Cadena de texto
int[] numeros = {1, 2, 3, 4}; // Arreglo de enteros

// Objetos
Persona persona = new Persona("Juan", 30); // Instancia de una clase
```

---

## 📋 Ejemplo Completo: Declaración de Variables y Uso

```java
public class EjemploVariables {
  public static void main(String[] args) {
    // Declaración de variables
    int edad = 30;
    float altura = 1.75f;
    char inicial = 'J';
    boolean estudiante = true;
    String nombre = "Juan";

    // Uso de variables
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Altura: " + altura + "m");
    System.out.println("Inicial: " + inicial);
    System.out.println("¿Es estudiante? " + estudiante);
  }
}
```

### 🖥️ Salida del Programa

```shell
Nombre: Juan
Edad: 30
Altura: 1.75m
Inicial: J
¿Es estudiante? true
```

