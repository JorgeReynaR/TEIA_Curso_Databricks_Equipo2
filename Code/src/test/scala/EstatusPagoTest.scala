import org.scalatest.funsuite.AnyFunSuite

class EstatusPagoTest extends AnyFunSuite {
  test("Estatus pago ") {
    assert(EstatusPago.Add(C26 = 0, C20 = 0, LAVP = 0, C23 = 0, LCP = 0) == "ED04")
    assert(EstatusPago.Add(C26 = 0, C20 = 1, LAVP = 0, C23 = 0, LCP = 0) == "ED05")
    assert(EstatusPago.Add(C26 = 0, C20 = 1, LAVP = 1, C23 = 0, LCP = 0) == "ED01")
    assert(EstatusPago.Add(C26 = 1, C20 = 0, LAVP = 0, C23 = 0, LCP = 0) == "ED02")
    assert(EstatusPago.Add(C26 = 1, C20 = 0, LAVP = 0, C23 = 0, LCP = 1) == "ED01")
    assert(EstatusPago.Add(C26 = 1, C20 = 0, LAVP = 0, C23 = 1, LCP = 0) == "ED02")
    assert(EstatusPago.Add(C26 = 1, C20 = 0, LAVP = 0, C23 = 1, LCP = 1) == "ED06")
    assert(EstatusPago.Add(C26 = 1, C20 = 1, LAVP = 0, C23 = 0, LCP = 0) == "ED05")
    assert(EstatusPago.Add(C26 = 1, C20 = 1, LAVP = 1, C23 = 0, LCP = 0) == "ED02")
    assert(EstatusPago.Add(C26 = 1, C20 = 1, LAVP = 1, C23 = 0, LCP = 1) == "ED01")
    assert(EstatusPago.Add(C26 = 1, C20 = 1, LAVP = 1, C23 = 1, LCP = 0) == "ED02")
    assert(EstatusPago.Add(C26 = 1, C20 = 1, LAVP = 1, C23 = 1, LCP = 1) == "ED06")
    assert(EstatusPago.Add(C26 = 0, C20 = 0, LAVP = 0, C23 = 1, LCP = 1) == "ED04")
    assert(EstatusPago.Add(C26 = 0, C20 = 1, LAVP = 0, C23 = 1, LCP = 1) == "ED05")
    assert(EstatusPago.Add(C26 = 0, C20 = 1, LAVP = 1, C23 = 1, LCP = 1) == "ED01")
  }
}
