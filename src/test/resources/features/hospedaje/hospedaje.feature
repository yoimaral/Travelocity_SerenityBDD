#language: es

  Característica: dado que salgo de viaje pormi cuenta
    quiero hospedar un hotel.


    Escenario: hospedaje en hotel Dann Carlton Bogota
      Dado que yo quiero hospedarme en el "Hotel Dann Carlton Bogota"
      Cuando quiero reservar por 8 dias
      Entonces debo visualizar el hotel


    Escenario: hospedaje en Cancun
      Dado que yo quiero hospedarme en el "Nickelodeon Hotels & Resorts All Inclusive Riviera Maya"
      Cuando quiero reservar por 10 dias
      Entonces debo visualizar opciones de hospedaje en Nickelodeon Hotels & Resorts All Inclusive Riviera Maya


    Escenario: hospedaje en el hotel Grecotel Pallas Athena
      Dado que yo quiero hospedarme en el "Grecotel Pallas Athena"
      Cuando quiero reservar por 5 dias con opcion de agregar auto
      Entonces debo visualizar opciones de hospedaje y auto
