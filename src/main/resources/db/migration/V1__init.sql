CREATE TABLE IF NOT EXISTS Productos (
    ID SERIAL PRIMARY KEY,
    Nombre VARCHAR(255) NOT NULL,
    Descripcion TEXT,
    Precio DECIMAL(10, 2) NOT NULL,
    Stock INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS MovimientosDeInventario(
    ID SERIAL PRIMARY KEY,
    ProductosID INT,
    TipoMovimiento VARCHAR(30),
    Cantidad INT NOT NULL,
    FechaMovimiento DATE NOT NULL,
    FOREIGN KEY (ProductosID) REFERENCES Productos(ID)
    );
