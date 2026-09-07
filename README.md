# EventPass - Microservicio de Órdenes

Microservicio encargado de registrar las órdenes de compra.

## Funcionalidades
- Crear orden de compra
- Registrar orden como "aceptada y pendiente de emisión"
- Enviar orden a la cola SQS
- Consultar estado de órdenes

## Tecnologías
- Java + Spring Boot
- Integración con Amazon SQS

## Endpoints principales
- POST /api/ordenes
- GET /api/ordenes/{id}
- GET /api/ordenes/usuario/{usuarioId}
