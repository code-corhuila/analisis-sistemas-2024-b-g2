-- Eliminar si existe 
DROP DATABASE IF EXISTS tutoria_23_10;
-- Crear la base de datos
CREATE DATABASE tutoria_23_10;

-- Usar la base de datos
USE tutoria_23_10;

-- Crear la tabla persona
CREATE TABLE persona (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    edad INT NOT NULL,
    state VARCHAR(20) NOT NULL DEFAULT 'activo',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Crear la tabla categoria
CREATE TABLE categoria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
    state VARCHAR(20) NOT NULL DEFAULT 'activo',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Crear la tabla deporte
CREATE TABLE deporte (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    descripcion TEXT,
    categoria_id INT,
    state VARCHAR(20) NOT NULL DEFAULT 'activo',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_categoria FOREIGN KEY (categoria_id) REFERENCES categoria(id)
        ON DELETE SET NULL ON UPDATE CASCADE
);

-- Crear la tabla deportista
CREATE TABLE deportista (
    id INT AUTO_INCREMENT PRIMARY KEY,
    persona_id INT,
    deporte_id INT,
    state VARCHAR(20) NOT NULL DEFAULT 'activo',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_persona FOREIGN KEY (persona_id) REFERENCES persona(id)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_deporte FOREIGN KEY (deporte_id) REFERENCES deporte(id)
        ON DELETE CASCADE ON UPDATE CASCADE
);
