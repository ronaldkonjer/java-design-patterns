package info.sliceoflife.proxy;

import static org.junit.Assert.assertEquals;

import info.sliceoflife.proxy.pojo.MyWizard;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * The Wizard test class
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public class MyWizardTest {

  @Test
  public void testToString() throws Exception {
    final List<String> wizardNamesList = Arrays.asList("Gendalf", "Dumbledore", "Oz", "Merlin");
    wizardNamesList.forEach(name -> assertEquals(name, new MyWizard(name).toString()));
  }

}
