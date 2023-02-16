# language: es

Característica: Envio de paquetes con hospedaje y vuelo agregados
  Yo como viajero
  quiero un paquete con opcion de hospedar y agregar vuelos

  Escenario: Comprando un paquete de viaje en la página de Travelocity
    Dado que al hacer clic en la sección de "Paquetes"
    Cuando quiero comprar un paquete de bogota a cali por 28 dias
    Entonces La página me debe mostrar la lista de paquetes de alquiler disponibles

  Escenario: Paquetes con opcion de agregar auto
    Dado que estoy en Quito (UIO - A. Internacional Mariscal Sucre)
    Cuando viaje quiero un paquete a Bogotá (BOG - A. Internacional El Dorado) por 28 dias con opcion de agregar un auto
    Entonces debo obtener alguna paquete con opcion de auto

