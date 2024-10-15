# Diagrama de clase. => MR

### Clase: [Título, Atributos, Métodos, Relaciones]

### Visualización: [Privado, Público, Protegido]

### Relaciones
    * Herencia
    * Implementación
    * Asociación 
        - Simple "----------"
        - Agregación ----------<> (fecha llena)
        - Composición ----------<> (fecha vacia)

### Tipos de clases: 
    - Interfaz
    - Normal (Realización)
    - Abstracta
    ------------
    - Enum
    - Record
    - Exception
    - Annotation

### Carrio de compra

- Persona
    - nombre
    - apellido
    - telefono
    - correo
    - direccion
    - estado
- Usuario
    - usuario
    - contrasenia
    - personaId `Herencia`
    - rolId `Composición`
    - estado
- Rol
    - codigo
    - nombre
    - descripcion
    - estado
- Categoria
     - codigo
    - nombre
    - descripcion
    - estado
- Producto
    - codigo
    - nombre
    - descripcion
    - estado
    - categoriaId `Agregación`
- Inventario
    - stock
    - valorCompra
    - valorVenta
    - productoId `Composición`
- Factura
    - fecha
    - valorPagar
    - usuarioId `Composición`
- DetalleFactura
    - valorPagar
    - cantidad
    - facturaId `Composición`
    - productoId `Composición`

