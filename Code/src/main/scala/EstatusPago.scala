object EstatusPago {
  def Add(C26: Int, C20: Int, C23: Int = 0, LAVP: Int = 0, LCP: Int = 0): String = {
    //C26 = 0?
    if (C26 == 0)
    {
      //SI, --> Existe Valor en C20? Es decir: C20 != 0?
      if (C20 == 0)
      {
        //NO, --> C20 = 0 --> "La Declaración se da como 'Pagada' y Estatus = 'ED04'"
        "ED04"
      }
      else
      {
        //SI, --> C20 != 0 -->
        //"Se Valida que al Menos Una de las Líneas Anteriores a la Vigente esté 'Pagada'"
        //--> LAVP = 1?
        if (LAVP == 1)
        {
          //SI, --> "La Declaración se da como 'Pagada' y Estatus = 'ED01'"
          "ED01"
        }
        else
        {
          //NO, --> "La Declaración se da como 'NO Pagada' y Estatus = 'ED05'"
          "ED05"
        }
      }
    }
    else
    {
      //C26 = 0? NO, C26 != 0 --> Existe Valor en C20?
      if (C20 == 0)
      {
        //NO, C20 = 0 --> Existe Valor en C23?
        if (C23 == 0)
        {
          //NO, C23 = 0 --> "Se Valida qye la LC Asociada a la Declaración esté 'Pagada'"
          // --> LCP = 1?
          if (LCP == 1)
          {
            //SI, --> "La Declaración se da como 'Pagada' y Estatus = 'ED01'"
            "ED01"
          }
          else
          {
            //NO, --> "La Declaración se da como "NO Pagada" y Estatus = 'ED02'"
            "ED02"
          }
        }
        else
        {
          //SI, E23 != 0 --> "Se Valida qye la LC Asociada a la Declaración esté 'Pagada'"
          // --> LCP = 1?
          if (LCP == 1)
          {
            //SI, LCP = 1 --> "la Declaración se da como 'Pagada' y Estatus = 'ED06'"
            "ED06"
          }
          else
          {
            //NO, LCP = 0 --> "la Declaración se da como 'NO Pagada' y Estatus = 'ED02'"
            "ED02"
          }
        }
      }
      else
      {
        //SI, C20 != 0 -->
        //"Se Valida que al Menos Una de las Líneas Anteriores a la Vigente esté 'Pagada'"
        //--> LAVP = 1?
        if (LAVP == 1)
        {
          //SI, --> Existe Valor en C23?
          if (C23 == 0)
          {
            //NO, C23 = 0 --> "Se Valida qye la LC Asociada a la Declaración esté 'Pagada'"
            // --> LCP = 1?
            if (LCP == 1)
            {
              //SI, --> "La Declaración se da como 'Pagada' y Estatus = 'ED01'"
              "ED01"
            }
            else
            {
              //NO, --> "La Declaración se da como "NO Pagada" y Estatus = 'ED02'"
              "ED02"
            }
          }
          else
          {
            //SI, C23 != 0 --> "Se Valida qye la LC Asociada a la Declaración esté 'Pagada'"
            // --> LCP = 1?
            if (LCP == 1) {
              //SI, --> "La Declaración se da como 'Pagada' y Estatus = 'ED06'"
              "ED06"
            }
            else {
              //NO, --> "La Declaración se da como "NO Pagada" y Estatus = 'ED02'"
              "ED02"
            }
          }
        }
        else {
          //NO, --> "La Declaración se da como 'NO Pagada' y Estatus = 'ED05'"
          "ED05"
        }
      }
    }
  }
}
