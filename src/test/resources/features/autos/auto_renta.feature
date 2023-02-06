# language: es

Característica: Alquilar un auto en Travelocity
Como usuario, quiero poder buscar y alquilar un auto en Travelocity para una fecha y ubicación específicas.


  Escenario: renta de autos con opciones por defecto
    Dado Yoimar esta buscando auto en "Medellín"
    Cuando quiere rentarlo 5 dias y regresarlo a "Bogota"
    Entonces debe obtener alguna opcion de renta

  Escenario: Buscar un auto disponible
    Dado que estoy en la página de inicio de Travelocity
    Cuando hago clic en el enlace "Autos"
    Y ingreso la fecha y ubicación de mi viaje
    Y hago clic en el botón "Buscar"
    Entonces se me debe mostrar una lista de autos disponibles para alquilar

  Escenario: Seleccionar un auto para alquilar
    Dado que estoy en la página de resultados de la búsqueda de autos
    Cuando selecciono un auto que deseo alquilar
    Y hago clic en el botón "Reservar"
    Entonces se me debe mostrar una página con la información detallada del auto seleccionado y las opciones de pago

  Escenario: Reservar un auto
    Dado que estoy en la página de detalles de la reserva de un auto
    Cuando ingreso mis datos personales y de pago
    Y hago clic en el botón "Reservar ahora"
    Entonces se me debe mostrar una confirmación de la reserva con un número de referencia y una fecha límite para cancelar o modificar la reserva.