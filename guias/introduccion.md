# 🚀 Introducción a Java


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