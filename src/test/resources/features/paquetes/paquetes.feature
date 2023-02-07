# language: es

Característica: Envio de paquetes con hospedaje y vuelo agregados
  Yo como viajero
  quiero un paquete con opcion de hospedar y agregar vuelos

  Escenario: El usuario abre la página de Travelocity
    Dado El usuario hace clic en la sección de "Paquetes"
    Cuando viaje quiero un paquete de bogota a cali por 28 dias
    Entonces La página muestra una lista de paquetes de alquiler disponibles

  Escenario: Paquetes con opcion de auto
    Dado que estoy en Quito (UIO - A. Internacional Mariscal Sucre)
    Cuando viaje quiero un paquete a Bogotá (BOG - A. Internacional El Dorado) por 28 dias con opcion de agregar un auto
    Entonces debe obtener alguna paquete con opcion de auto

