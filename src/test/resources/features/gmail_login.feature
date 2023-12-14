Feature: Iniciar sesion exitosa en gmail
  Yo como usuario
  Necesito iniciar sesion en la pagina de gmail
  Para validar que el logueo fue exitoso

  Scenario: Iniciar sesion en gmail
    Given Deseo abrir la pagina de gmail "https://mail.google.com/"
    When ingreso nombre de usuario "emmanueldiversiones@gmail.com" y password "101720Dfg_*"
    Then Vaalido que el logueo sea valido para el usuario "Recibidos"

#  Scenario Outline: Iniciar sesion en gmail
#    Given Deseo abrir la pagina de gmail
#    When ingreso nombre de usuario <user> y password <pass>
#    Then Vaalido que el logueo sea valido para el usuario <usuario>
    #Examples:
     # | user                | pass        | usuario             |
      #| germanhrh@gmail.com | 101720DFg_* | germanhrh@gmail.com |
      #| germanhrh@gmail.com | 101720DFg_* | germanhrh@gmail.com |