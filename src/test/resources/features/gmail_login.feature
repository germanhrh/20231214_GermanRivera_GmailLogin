Feature: Iniciar sesion exitosa en gmail
  Yo como usuario
  Necesito iniciar sesion en la pagina de gmail
  Para validar que el logueo fue exitoso

  Scenario: Iniciar sesion en gmail
    Given Deseo abrir la pagina de gmail "https://mail.google.com/"
    When ingreso nombre de usuario "pepitoperez@gmail.com" y password "asdfasd*"
    Then Vaalido que el logueo sea valido para el usuario "Recibidos"

#  Scenario Outline: Iniciar sesion en gmail
#    Given Deseo abrir la pagina de gmail
#    When ingreso nombre de usuario <user> y password <pass>
#    Then Vaalido que el logueo sea valido para el usuario <usuario>
    #Examples:
      #| user                   | pass      | usuario   |
      #| pepitoperez@gmail.com  | ewwerwqe* | Recibidos |
      #| pepitoperez2@gmail.com | asdfasdf* | Recibidos |