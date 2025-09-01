# Programa Educativo de Listas (ArrayList)

Este proyecto demuestra el uso básico de ArrayList en Java de forma educativa.

## ¿Qué es ArrayList?

ArrayList es una clase en Java que implementa una lista dinámica. Permite:
- Almacenar elementos de forma ordenada
- Cambiar de tamaño automáticamente
- Acceder a elementos por índice
- Realizar operaciones como agregar, eliminar, buscar y modificar

## Cómo ejecutar el programa

### Requisitos
- Java 17 o superior
- Terminal o IDE (como IntelliJ IDEA)

### Compilar y ejecutar
```bash
# Compilar
javac src/Main.java

# Ejecutar
java -cp src Main
```

## Lo que aprenderás

El programa demuestra:

1. **Creación de ArrayList**: `ArrayList<Integer> nums = new ArrayList<>();`
2. **Agregar elementos**: `nums.add(12);`
3. **Acceder a elementos**: `nums.get(0);`
4. **Obtener tamaño**: `nums.size();`
5. **Buscar elementos**: `nums.contains(35);`
6. **Modificar elementos**: `nums.set(1, 20);`
7. **Insertar en posición específica**: `nums.add(2, 25);`

## Conceptos importantes

- **Índices**: Los ArrayList usan índices que comienzan en 0
- **Tamaño dinámico**: Pueden crecer o decrecer automáticamente
- **Tipo genérico**: `<Integer>` especifica que solo acepta números enteros
- **Métodos útiles**: add(), get(), size(), contains(), indexOf(), set()

## Salida esperada

El programa muestra:
- Ayuda inicial explicando los conceptos
- Proceso de agregado de elementos
- Acceso a elementos específicos
- Información sobre el tamaño
- Operaciones adicionales como búsqueda y modificación

## Autor

Harold López - Proyecto educativo sobre estructuras de datos en Java