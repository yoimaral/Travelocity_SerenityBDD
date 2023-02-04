# language: es

Característica: Vuelos redondos
  Yo como viajero
  quiero diseñar vuelos de ida y regreso
  para facilitar mis viajes de paseo

  Escenario: vuelo redondo con opciones por defecto
    Dado "Yoimar" esta en "Medellín"
    Cuando quiera viajar a "Cancun" por 15 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondo con opcion clase economica premium
    Dado "Paola" esta en "Bogota"
    Cuando quiera viajar a "Cali" por 13 dias
    Entonces debe obtener alguna opcion de vuelo

  @manual
  Escenario: vuelo redondo con opción de agregar auto
    Dado "Laura" esta en "Medellin"
    Cuando quiera viajar a "Cancun" agregando un "auto"
    Entonces debe obtener alguna opcion de auto


  Escenario: Busco vuelos desde Nueva York a Los Ángeles
    Dado yoimar esta en "Nueva York"
    Cuando quiera viajar a "Los Ángeles" por 10 dias
    Entonces debe obtener alguna opcion de vuelo
