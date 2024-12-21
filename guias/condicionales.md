## Sentencias de Decisión en Java

Las sentencias de decisión en Java permiten a los programas tomar diferentes acciones
basadas en condiciones específicas. Las sentencias de decisión más comunes en Java son
`if`, `if-else`, `else-if` y `switch`.

### Sentencia `if`

La sentencia if se utiliza para ejecutar un bloque de código solo si una condición
específica es verdadera.

**Sintaxis:**

```java
if (condicion) {
// Bloque de código a ejecutar si la condición es verdadera
```

**Ejemplo:**

```java
public class EjemploIf {
public static void main(String[] args) {
    int edad = 20;
    if (edad >= 18) {
        System.out.println("Eres mayor de edad.");
        }
    }
}
```

### Sentencia `if-else`

La sentencia if-else se utiliza para ejecutar un bloque de código si la condición es
verdadera y otro bloque de código si la condición es false.

**Sintaxis:**

```java
if (condicion){
// Bloque de código a ejecutar si la condición es verdadera
}
  else {
    // Bloque de código a ejecutar si la condición es falsa
    }
```

**Ejemplo:**

```java
public class EjemploIfElse {
    public static void main(String[] args) {
        int edad = 16;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}
```

### Sentencia `else-if`

La sentencia if-else se utiliza para evaluar múltiples condiciones en secuencia.

**Sintaxis:**

```java
if (condicion1) {
// Bloque de código a ejecutar si la condición1 es verdadera
    } 
    else if (condicion2) {
    // Bloque de código a ejecutar si la condición2 es verdadera
    } 
    else {
    // Bloque de código a ejecutar si ninguna condición anterior es verdadera
    }
```

**Ejemplo:**

```java
public class EjemploIfElseIfElse {
    public static void main(String[] args) {
        int nota = 85;
        
        if (nota >= 90) {
            System.out.println("Calificación: A");
        } 
        else if (nota >= 80) {
            System.out.println("Calificación: B");
        } 
        else if (nota >= 70) {
            System.out.println("Calificación: C");
        } 
        else if (nota >= 60) {
            System.out.println("Calificación: D");
        } 
        else {
            System.out.println("Calificación: F");
        }
    }
}
```
