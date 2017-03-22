package info.sliceoflife.mediator.mediator.impl;

/**
 * MyAction enumeration
 *
 * @author ronaldkonjer (ronaldkonjer@gmail.com)
 */
public enum MyAction {
  HUNT("huted a rabbit", "arrives for dinner"), TALE("tells a tale", "comes to listen"), GOLD("found gold",
      "takes his share of the gold"), ENEMY("spotted enemies", "runs for cover"), NONE("", "");

  private String title;
  private String description;

  MyAction(final String title, final String description) {
    this.title = title;
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public String getTitle() {
    return title;
  }

}
