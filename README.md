# Tarea02-CruiseBook
El sistema CruiseBook permite a los usuarios reservar viajes en crucero a diversos destinos. Cada crucero puede ofrecer múltiples rutas y fechas de salida, así como diferentes tipos de cabinas, como suites, cabinas con balcón, interiores y familiares. Una cabina puede estar en uno de los siguientes estados: disponible, reservada, ocupada o en mantenimiento.

Los usuarios pueden buscar cruceros según criterios como destino, fecha de salida, duración del viaje y tipo de cabina. Una vez seleccionado el crucero y la cabina, el sistema reserva la cabina por un tiempo limitado, permitiendo al usuario completar el proceso de pago para confirmar la reserva. Las tarifas pueden incluir servicios adicionales, como excursiones en tierra, paquetes de bebidas o tratamientos en el spa, que los usuarios pueden personalizar.

Los operadores del crucero pueden establecer políticas de cancelación, reprogramación y reembolsos, así como condiciones específicas para cada tipo de cabina. El sistema envía notificaciones a los usuarios sobre el estado de sus reservas, detalles del itinerario, y actualizaciones importantes, a través de correo electrónico, SMS o aplicaciones de mensajería.

Si el viaje es cancelado o hay cambios significativos en el itinerario, el sistema debe gestionar el reembolso de manera automática o permitir a los usuarios modificar su reserva sin cargos adicionales. Los incidentes reportados por los usuarios, tales como problemas con la reserva, pagos o servicios a bordo, son atendidos inicialmente por el equipo de atención al cliente; si no se resuelven, se escalan a la gerencia del crucero para una solución definitiva.
## Patrones de diseño utilizados
- Factory Method
- Strategy
- Observer
## Diagrama de clases
![Captura de pantalla 2024-12-09 114208](https://github.com/user-attachments/assets/5b1a65e6-a390-43bb-858c-463a619e2fcc)
