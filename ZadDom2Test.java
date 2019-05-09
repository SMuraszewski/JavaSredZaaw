package zadaniedomowe2;

import zadaniedomowe2.ZadDom2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZadDom2Test{

  @Test
  void mnozenieDziala(){
    assertEquals(ZadDom2.mnozenie(2,5), 10);
  }

  @Test
  void dzielenieDziala() {
    assertEquals(ZadDom2.mnozenie(2,1), 2);
  }
}