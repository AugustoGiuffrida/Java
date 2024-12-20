## Java

Java es un lenguaje de programación de alto nivel de paradigma Orientado a Objetos ([OOP](https://es.wikipedia.org/wiki/Programaci%C3%B3n_orientada_a_objetos)), [multiplataforma](https://es.wikipedia.org/wiki/Multiplataforma) y [fuertemente tipado](https://es.wikipedia.org/wiki/Tipado_fuerte).

## Introducción a Java

### ¿Por qué Java?¿Qué ofrece?

| Característica                              | Descripción                                                       |
|---------------------------------------------|-------------------------------------------------------------------|
| **Portabilidad** | Una de las mayores fortalezas de Java es su lema **"Escribe una vez, ejecuta en cualquier lugar"** (Write Once, Run Anywhere). Esto significa que el código Java compilado puede ejecutarse en cualquier plataforma que tenga una Máquina Virtual de Java (JVM). |
| **Rendimiento**  | Su arquitectura incluye características de seguridad incorporadas que protegen contra una amplia gama de amenazas y vulnerabilidades. Un detalle no menor es que la gestión de memoria es automática gracias al **[Garbage Collector](https://es.wikipedia.org/wiki/Recolector_de_basura)**, ya que se evitan problemas como fugas de memoria (o [memory leaks](https://es.wikipedia.org/wiki/Fuga_de_memoria)). Además posee una **arquitectura multihilo** brindando la posibilidad de desarrollar aplicaciones que se aprovechen de las ventajas de la multiprogramación y el paralelismo de tareas. Obviamente, para poder aprovechar el paralelísmo y la multiprogramación, se debe diseñar un programa capaz de hacerlo. |

### ¿Qué es un Compilador y por qué se necesita para trabajar con Java?

Un [compilador](https://es.wikipedia.org/wiki/Compilador) es una herramienta que traduce el código fuente escrito en un lenguaje de alto nivel (como Java) a un lenguaje de bajo nivel o código máquina que puede ser ejecutado directamente por el sistema operativo de la computadora. Este proceso es crucial porque las computadoras no entienden el código de alto nivel directamente; necesitan instrucciones en un formato que puedan ejecutar.

Java en sí no se compila directamente a lenguaje máquina como `C` o `C++`, sinó que se compila a **bytecode**, que es un intermedio entre el lenguaje máquina y el **código fuente Java**. El compilador de Java, `javac` (java compliler) convierte el código fuente Java en bytecode (`file.java → file.class`), y el bytecode es ejecutado en cualquier sistema operativo que tenga una **Máquina Virtual Java** (JVM).

<p align="center">
  <img src="media/JDK.png" alt="Java Development Kit">
</p>

### ¿Qué es el JDK?

El `Java Development Kit` (JDK) es un paquete de herramientas necesarias para desarrollar aplicaciones en Java. Incluye:
1. **Compilador** (`javac`): Traduce el código fuente Java a bytecode.
2. **Java Runtime Environment** (JRE): Proporciona las bibliotecas y la JVM necesarias para ejecutar el bytecode.
3. **Herramientas de Desarrollo**: Incluye herramientas como el depurador (`jdb`), el empaquetador (`jar`), entre otras.

### ¿Qué es el JRE?

El `Java Runtime Environment` (JRE) es un subconjunto del JDK. Es todo lo que necesitas para ejecutar programas Java, pero no para desarrollarlos. Incluye:
1. **Java Virtual Machine** (JVM): Ejecuta el bytecode Java.
2. **Bibliotecas de Clase**: Conjunto de bibliotecas necesarias para ejecutar aplicaciones Java.
3. **Otros Componentes**: Archivos de configuración, bibliotecas nativas, etc.

### Resumen

| Componente | Descripción |
|------------|-------------|
| **Compilador** | Convierte el código fuente Java en bytecode que puede ser ejecutado por la JVM. |
| **JDK** | Incluye el compilador, el JRE, y otras herramientas de desarrollo. |
| **JRE** | Incluye la JVM y las bibliotecas necesarias para ejecutar aplicaciones Java. |
| **JVM** | Ejecuta el bytecode Java y permite la independencia de plataforma. |

<p align="center">
  <img src="media/JDK2.png" alt="Java Runtime Environment">
</p>


## ¿Cómo empiezo?

Para comenzar a programar en Java, lo primero que vamos a necesitar es **JDK**. Para obtener JDK dispones de dos opciones:
- [JDK](https://www.oracle.com/java/technologies/downloads/) bajo licencia de Oracle.
- [OpenJDK](https://openjdk.org/) bajo la licencia GPL.

La diferencia entre JDK y OpenJDK está principalmente en su origen, licencia y contenido adicional. Ambos son implementaciones de la plataforma Java Development Kit (JDK), necesarias para compilar y ejecutar aplicaciones Java.

Las diferencias generales entre JDK y OpenJDK son las siguientes:

| Característica           | **JDK (de Oracle)**                         | **OpenJDK**                     |
|--------------------------|---------------------------------------------|----------------------------------|
| **Licencia**             | Licencia comercial (gratuita con límites). | GPLv2 + Classpath Exception.    |
| **Costo**                | Gratuito para uso personal/pruebas; pago para empresas. | Totalmente gratuito.            |
| **Soporte**              | Soporte oficial de Oracle (para empresas). | Soporte de la comunidad o terceros. |
| **Extras**               | Herramientas propietarias y optimizaciones. | Solo herramientas estándar.     |


El cuál elegir dependerá de tus necesidades, si trabajas en un proyecto **personal o de código abierto**, **OpenJDK** es más que suficiente. Por otro lado si necesitas **soporte empresarial** o acceso a las herramientas adicionales de Oracle, considera usar el **JDK de Oracle**, pero ten en cuenta los costos de licenciamiento para entornos comerciales.

### Ya tengo JDK ¿Y ahora?

Bueno pues despues de obtener JDK lo único que necesitas es empezar a escribir código, pero vamos a ir despacio para no complicar todo. Para facilitar el desarrollo suele utilizarse un [IDE](https://es.wikipedia.org/wiki/Entorno_de_desarrollo_integrado) como [IntelliJ IDEA](https://www.jetbrains.com/idea/) de JetBrains, aunque, si este IDE no es de tu agrado, puedes utilizar cualquier IDE o editor de código que te guste.

Algunas de las ventajas de IntelliJ es que proporciona todas las herramientas para desarrollar en Java bien integradas y además, su versión comunitaria es open source! (puedes ver su código fuente [aquí](https://github.com/JetBrains/intellij-community))

## Gestión de Memoria en Java

Cuando ejecutas un programa Java, la **RAM** juega un papel clave en la gestión de variables y memoria. Este proceso incluye dos áreas principales:

1. **Stack**:
    - **Almacena**: Variables locales y primitivas dentro de métodos.
    - Cada método tiene un **marco (frame)** en el stack para sus variables locales.
    - Se gestiona de forma automática con cada llamada y retorno de métodos.

2. **Heap**:
    - **Almacena**: Objetos y datos asociados.
    - Gestionado automáticamente por el **Garbage Collector (GC)**, que libera la memoria ocupada por objetos no accesibles.

---

### Funcionamiento del Garbage Collector

El **Garbage Collector (GC)** es una parte fundamental de la JVM que administra la memoria del **heap**. Su propósito incluye:

- **Liberar Memoria**: Recolectar objetos no utilizados para liberar espacio.
- **Optimización**: Minimizar la fragmentación y garantizar un uso eficiente de la memoria.

👉 El proceso de recolección de basura es **automático** y se activa según las necesidades de la aplicación.
