USE ada;

-- Insertar datos en la tabla visitas
INSERT INTO `ada`.`visitas` (`auditor_name`, `comentarios`, `hotel_name`, `scheduled_date`, `status`)
VALUES 
('Ana Martínez', 'Inspección para mejorar la calidad del servicio.', 'Hotel Plaza', '2025-09-26 10:00:00', 'Pendiente'),
('Carlos Jiménez', 'Revisión de protocolos de seguridad.', 'Hotel Plaza', '2025-09-27 14:30:00', 'Pendiente'),
('Juan Pérez', 'Chequeo de condiciones sanitarias.', 'Hotel Plaza', '2025-09-28 09:00:00', 'Pendiente'),
('María González', 'Revisión de habitaciones y servicios.', 'Hotel Sol', '2025-09-26 10:00:00', 'Pendiente'),
('David Fernández', 'Auditoría de cumplimiento de normativas.', 'Hotel Sol', '2025-09-26 10:00:00', 'Pendiente'),
('Elena López', 'Evaluación de servicios de restauración.', 'Hotel Sol', '2025-09-29 11:00:00', 'Pendiente'),
('Pedro García', 'Inspección para comprobar estándares de calidad.', 'Hotel Riviera', '2025-09-29 13:30:00', 'Pendiente'),
('Lucía Romero', 'Visita de control de calidad y limpieza.', 'Hotel Riviera', '2025-09-30 09:00:00', 'Pendiente'),
('Javier Ruiz', 'Revisión de las instalaciones comunes.', 'Hotel Riviera', '2025-09-30 15:00:00', 'Pendiente'),
('Luis Martínez', 'Inspección para verificar medidas de seguridad.', 'Hotel Luna', '2025-10-01 16:00:00', 'Pendiente'),
('Sofía Sánchez', 'Revisión de las instalaciones de cocina.', 'Hotel Luna', '2025-10-01 17:00:00', 'Cancelada'),
('Marco Díaz', 'Auditoría de calidad y estándares del hotel.', 'Hotel Luna', '2025-10-02 10:00:00', 'Cancelada'),
('Paula Álvarez', 'Visita de verificación de los servicios para huéspedes.', 'Hotel Mirage', '2025-10-03 09:30:00', 'Pendiente'),
('Fernando Pérez', 'Inspección de accesibilidad y espacios comunes.', 'Hotel Mirage', '2025-10-03 11:00:00', 'Cancelada'),
('Cristina Rodríguez', 'Revisión de protocolos de higiene.', 'Hotel Mirage', '2025-10-04 15:00:00', 'Cancelada'),
('Raúl Gómez', 'Auditoría de calidad en habitaciones.', 'Hotel Estrella', '2025-10-05 14:00:00', 'Pendiente'),
('Marta Fernández', 'Revisión de la gestión de reservas.', 'Hotel Estrella', '2025-10-06 12:00:00', 'Realizada'),
('Iván Sánchez', 'Evaluación de la calidad en el servicio al cliente.', 'Hotel Estrella', '2025-10-06 18:30:00', 'Realizada'),
('Clara Jiménez', 'Revisión de medidas de seguridad y limpieza.', 'Hotel Horizonte', '2025-10-07 08:30:00', 'Realizada'),
('Eduardo López', 'Inspección para verificar normas ambientales.', 'Hotel Horizonte', '2025-10-08 09:00:00', 'Realizada'),
('Raquel Martín', 'Chequeo de calidad en los servicios de alimentación.', 'Hotel Horizonte', '2025-10-08 16:30:00', 'Realizada');
