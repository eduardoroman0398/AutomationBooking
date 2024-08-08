@Demo-auto
Feature: Automation Booking

  Scenario Outline: Reservar un alojamiento en Booking
    Given Ingresar la url de la pagina <ambiente>
    And Cerramos el popup
    And Ingresamos el lugar de destino <destino>
    And Seleccionamos las fechas de <fecha_entrada>, <fecha_salida>
    And Seleccionamos la ocupacion con <adultos>, <ninos>, <edad_nino>, <habitaciones>
    And Clickeamos en el boton buscar
    And Seleccionamos el alojamiento <alojamiento>
    And Reservamos el alojamiento
    And Rellenamos el formulario con <nombre>, <apellido>, <email>, <telefono>
    And Click en dar el ultimo Paso y completar la reserva

    Examples:
      | ambiente | destino | fecha_entrada | fecha_salida | adultos | ninos | edad_nino | habitaciones | alojamiento   | nombre  | apellido | email                  | telefono  |  |
      | URL      | Cusco   | 2024-08-14    | 2024-08-28   | 2       | 1     | 5         | 1            | Uchukuta wasi | Eduardo | Roman    | hesex38688@luvnish.com | 931908358 |  |

