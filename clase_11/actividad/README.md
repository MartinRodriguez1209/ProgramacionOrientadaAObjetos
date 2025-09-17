# Actividad: Layout Managers y JTable en Java Swing

## Objetivo

El objetivo de esta actividad es doble:
1.  Aprender a utilizar **Layout Managers** para organizar componentes en una interfaz gráfica de usuario (GUI).
2.  Aprender a conectar una **JTable** con un modelo de datos personalizado (`TableModel`) para mostrar información de forma tabular.

Trabajarás sobre una aplicación con arquitectura Modelo-Vista-Controlador (MVC) que ya está parcialmente construida. Tu tarea es "rellenar" las partes que han sido eliminadas estratégicamente.

## Tareas

Deberás modificar 3 archivos Java. Busca los comentarios que empiezan con `// TODO:` para encontrar las tareas específicas.

### 1. `src/vista/AlumnoView.java` (Layout y Creación de JTable)

-   **Layout Principal:** La ventana principal de la aplicación está desorganizada. Deberás establecer un `BorderLayout` en el panel principal y añadir la tabla (dentro de un `JScrollPane`) en el centro y el panel de botones en el este.
-   **Creación de JTable:** Deberás instanciar el objeto `JTable` y meterlo dentro de un `JScrollPane` para que el contenido sea desplazable.

### 2. `src/vista/AlumnoFormView.java` (Layout de Formulario)

-   **Layout de Formulario:** El formulario para añadir/modificar alumnos tiene sus componentes desalineados. Deberás usar un layout manager (se recomienda `GridBagLayout` o `GridLayout`) para organizar las etiquetas y los campos de texto de forma clara.

### 3. `src/modelo/AlumnoModel.java` (Implementación del TableModel)

-   **Conectar el Modelo a la Tabla:** Este es el paso más importante para que la `JTable` muestre datos. Deberás completar los métodos de la interfaz `TableModel`:
    -   `getRowCount()`: Debe devolver la cantidad de alumnos.
    -   `getColumnCount()`: Debe devolver la cantidad de columnas.
    -   `getColumnName()`: Debe devolver el nombre de cada columna.
    -   `getValueAt(row, col)`: Debe devolver el dato específico (ej. nombre, apellido) para una celda determinada de la tabla.

## ¿Cómo empezar?

1.  Abre el proyecto en tu IDE.
2.  Ejecuta la clase `App.java` para ver el estado inicial de la aplicación. Notarás que la interfaz está desorganizada y la tabla no muestra ningún dato.
3.  Ve a los archivos mencionados y completa las tareas marcadas con `// TODO:`.
4.  Vuelve to ejecutar `App.java` para probar tus cambios. Si todo es correcto, la interfaz se verá ordenada y la tabla mostrará la lista de alumnos.

¡Éxito!