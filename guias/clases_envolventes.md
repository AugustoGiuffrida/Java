## Clases Envolventes

En Java, para cada tipo de dato primitivo, existe una clase envolvente correspondiente en el paquete `java.lang`. Estas clases permiten tratar los valores primitivos como objetos y proporcionan métodos útiles para convertir y manipular datos.

### Tipos Primitivos y sus Clases Envolventes

| Tipo Primitivo | Clase Envolvente |
|----------------|------------------|
| `int`          | `Integer`       |
| `long`         | `Long`          |
| `float`        | `Float`         |
| `double`       | `Double`        |
| `char`         | `Character`     |
| `boolean`      | `Boolean`       |

---

### Ejemplos y Métodos Útiles

#### 1. **`Integer` (para `int`)**

La clase `Integer` proporciona métodos útiles para trabajar con valores enteros.

**Métodos útiles:**
- `Integer.parseInt(String s)`: Convierte una cadena a un entero.
- `Integer.toString(int i)`: Convierte un entero a una cadena.
- `Integer.MAX_VALUE`: Valor máximo de un `int`.
- `Integer.MIN_VALUE`: Valor mínimo de un `int`.

**Ejemplo:**
```java
public class DetallesInteger {
    public static void main(String[] args) {
        int numero = 42;
        // Convertir a cadena
        String numeroStr = Integer.toString(numero);
        System.out.println("Número como cadena: " + numeroStr);

        // Valor máximo y mínimo
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);

        // Parsear cadena a entero
        int parsedNumero = Integer.parseInt("123");
        System.out.println("Número parseado: " + parsedNumero);
    }
}
```

#### 2. **Double** (para `double`)

La clase `Double` proporciona métodos útiles para trabajar con valores de punto flotante.

**Métodos útiles:**
- `Double.parseDouble(String s)`: Convierte una cadena a un `double`.
- `Double.toString(double d)`: Convierte un `double` a una cadena.
- `Double.MAX_VALUE`: Valor máximo de un `double`.
- `Double.MIN_VALUE`: Valor mínimo de un `double`.

**Ejemplo:**
```java
public class DetallesDouble {
    public static void main(String[] args) {
        double numero = 3.14159;
        // Convertir a cadena
        String numeroStr = Double.toString(numero);
        System.out.println("Número como cadena: " + numeroStr);

        // Valor máximo y mínimo
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);

        // Parsear cadena a double
        double parsedNumero = Double.parseDouble("2.71828");
        System.out.println("Número parseado: " + parsedNumero);
    }
}
```

#### 3. **`Character` (para `char`)**

La clase `Character` proporciona métodos útiles para trabajar con caracteres.

**Métodos útiles:**
- `Character.isDigit(char ch)`: Verifica si el carácter es un dígito.
- `Character.isLetter(char ch)`: Verifica si el carácter es una letra.
- `Character.toUpperCase(char ch)`: Convierte un carácter a mayúscula.
- `Character.toLowerCase(char ch)`: Convierte un carácter a minúscula.

**Ejemplo:**
```java
public class DetallesCharacter {
    public static void main(String[] args) {
        char letra = 'a';
        // Convertir a mayúscula
        char mayuscula = Character.toUpperCase(letra);
        System.out.println("Letra en mayúscula: " + mayuscula);

        // Verificar si es una letra
        System.out.println("Es una letra: " + Character.isLetter(letra));

        // Verificar si es un dígito
        char digito = '1';
        System.out.println("Es un dígito: " + Character.isDigit(digito));
    }
}
```
