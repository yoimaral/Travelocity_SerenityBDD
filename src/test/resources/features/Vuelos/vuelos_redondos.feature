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
