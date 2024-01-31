Feature:  Buscar en google la palabra Simetrik
  Yo como usuario de Google al buscar la palabra Simetrik en el buscador
  validar que el resultado de la busqueda sea diferente de cero.

  Scenario: Busqueda de la palabra Simetrik en Google.
    Given Un usuario desea realizar una busqueda en Google "https://www.google.com/"
    When Escribe la palabra Simetrik "Simetrik"
    And Presiona Enter
    Then Se muestran los resultados de Simetrik diferente a cero
