package info.sliceoflife.prototype.heroprototype;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import info.sliceoflife.prototype.herofactory.impl.MyHeroFactoryImpl;
import info.sliceoflife.prototype.heroprototype.impl.MyBeast;
import info.sliceoflife.prototype.heroprototype.impl.MyMage;
import info.sliceoflife.prototype.heroprototype.impl.MyWarlord;

import org.junit.Test;

public class MyHeroFactoryImplTest {

  @SuppressWarnings("unchecked")
  @Test
  public void testFactory() throws Exception {
    final MyMage mage = mock(MyMage.class);
    final MyWarlord warlord = mock(MyWarlord.class);
    final MyBeast beast = mock(MyBeast.class);

    when(mage.clone()).thenThrow(CloneNotSupportedException.class);
    when(warlord.clone()).thenThrow(CloneNotSupportedException.class);
    when(beast.clone()).thenThrow(CloneNotSupportedException.class);

    final MyHeroFactoryImpl factory = new MyHeroFactoryImpl(mage, warlord, beast);
    assertNull(factory.createMage());
    assertNull(factory.createWarlord());
    assertNull(factory.createBeast());

    verify(mage).clone();
    verify(warlord).clone();
    verify(beast).clone();
    verifyNoMoreInteractions(mage, warlord, beast);
  }

}
