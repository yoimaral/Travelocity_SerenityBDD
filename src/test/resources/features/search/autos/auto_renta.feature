# language: es

Característica: autos renta
  Yo como viajero
  quiero rentar un auto
  para facilitar mi transporte

  Escenario: renta de autos con opciones por defecto
    Dado Yoimar esta buscando auto en "Medellín"
    Cuando quiere rentarlo "5" dias y regresarlo a "Bogota"
    Entonces debe obtener alguna opcion de renta

