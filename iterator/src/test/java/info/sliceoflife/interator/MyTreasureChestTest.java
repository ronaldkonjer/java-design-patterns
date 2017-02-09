package info.sliceoflife.interator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import info.sliceoflife.iterator.aggregate.MyTreasureChest;
import info.sliceoflife.iterator.item.MyItem;
import info.sliceoflife.iterator.item.MyItemType;
import info.sliceoflife.iterator.iterator.MyItemIterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Application Test
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
@RunWith(Parameterized.class)
public class MyTreasureChestTest {

  /**
   * Create a list of all expected items in the chest.
   *
   * @return The set of all expected items in the chest
   */
  @Parameterized.Parameters
  public static List<Object[]> data() {
    final List<Object[]> parameters = new ArrayList<>();
    parameters.add(new Object[] {new MyItem(MyItemType.POTION, "Potion of courage")});
    parameters.add(new Object[] {new MyItem(MyItemType.RING, "Ring of shadows")});
    parameters.add(new Object[] {new MyItem(MyItemType.POTION, "Potion of wisdom")});
    parameters.add(new Object[] {new MyItem(MyItemType.POTION, "Potion of blood")});
    parameters.add(new Object[] {new MyItem(MyItemType.WEAPON, "Sword of silver +1")});
    parameters.add(new Object[] {new MyItem(MyItemType.POTION, "Potion of rust")});
    parameters.add(new Object[] {new MyItem(MyItemType.POTION, "Potion of healing")});
    parameters.add(new Object[] {new MyItem(MyItemType.RING, "Ring of armor")});
    parameters.add(new Object[] {new MyItem(MyItemType.WEAPON, "Steel halberd")});
    parameters.add(new Object[] {new MyItem(MyItemType.WEAPON, "Dagger of poison")});
    return parameters;
  }

  /**
   * One of the expected items in the chest
   */
  private final MyItem expectedItem;

  /**
   * Create a new test instance, test if the given expected item can be retrieved from the
   * chest
   *
   * @param expectedItem One of the items that should be in the chest
   */
  public MyTreasureChestTest(final MyItem expectedItem) {
    this.expectedItem = expectedItem;
  }

  /**
   * Test if the expected item can be retrieved from the chest using the {@link MyItemIterator}
   */
  @Test
  public void testIterator() {
    final MyTreasureChest chest = new MyTreasureChest();
    final MyItemIterator iterator = chest.iterator(expectedItem.getType());
    assertNotNull(iterator);

    while (iterator.hasNext()) {
      final MyItem item = iterator.next();
      assertNotNull(item);
      assertEquals(this.expectedItem.getType(), item.getType());

      final String name = item.toString();
      assertNotNull(name);
      if (this.expectedItem.toString().equals(name)) {
        return;
      }
    }

    fail("Expected to find item [" + this.expectedItem + "] using iterator, but we didn't.");
  }

  /**
   * Test if the expected item can be retrieved from the chest using the
   * {@link MyTreasureChest#getItems()} method
   */
  @Test
  public void testGetItems() throws Exception {
    final MyTreasureChest chest = new MyTreasureChest();
    final List<MyItem> items = chest.getItems();
    assertNotNull(items);

    for (final MyItem item : items) {
      assertNotNull(item);
      assertNotNull(item.getType());
      assertNotNull(item.toString());

      final boolean sameType = this.expectedItem.getType() == item.getType();
      final boolean sameName = this.expectedItem.toString().equals(item.toString());
      if (sameType && sameName) {
        return;
      }
    }

    fail("Expected to find item [" + this.expectedItem + "] in the item list, but we didn't.");

  }

}
