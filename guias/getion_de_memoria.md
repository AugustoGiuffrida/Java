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

## Indices

- [Volver al README](./../README.md)
- [Siguiente guia](./clases_envolventes.md)