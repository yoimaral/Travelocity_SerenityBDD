# language: es

Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondo con opciones por defecto
    Dado Yoimar esta en "Medellín"
    Cuando quiera viajar a "Cancun" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondo con opcion clase economica premium
    Dado Diego esta en "Medellin"
    Cuando quiera viajar a "Cancun" por 13 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondo con opción de agregar auto
    Dado Laura esta en "Medellin"
    Cuando quiera viajar a "Cancun" agregando un auto
    Entonces debe obtener alguna opcion de auto

  @manual
  Escenario: vuelo redondo con opción de agregar hospedaje
    Dado Diego esta en "Medellin"
    Cuando quiera viajar a "Cancun" agregando un hospedaje por 8 dias
    Entonces debe obtener varias opcion de vuelo
    Y debe incluir hospedaje


















  import io.cucumber.java.es.Cuando
  import io.cucumber.java.es.Dado
  import io.cucumber.java.es.Entonces
  import io.cucumber.java.es.Y

#language: es

  Scenario: Envio de paquetes con hospedaje y vuelo agregados


  Escenario: El usuario abre la página de Travelocity
    Dado El usuario hace clic en la sección de "Paquetes"
    Cuando El usuario ingresa la ubicación deseada y las fechas de viaje
    Entonces La página muestra una lista de paquetes de alquiler disponibles en esa ubicación

  Escenario: Filtrado de paquetes de alquiler por presupuesto
    Dado El usuario ha buscado paquetes de alquiler en una ubicación específica
    Cuando El usuario aplica un filtro de presupuesto
    Entonces La página muestra solo los paquetes de alquiler que cumplen con el presupuesto seleccionado

  Escenario: Reservación de paquete de alquiler
    Dado El usuario ha seleccionado un paquete de alquiler
    Cuando El usuario hace clic en "Reservar ahora"
    Y El usuario ingresa sus detalles de pago
    Entonces La página muestra una confirmación de la reservación del paquete de alquiler

