package info.sliceoflife.visitor;

import info.sliceoflife.visitor.visitor.impl.MySergeantVisitor;

import java.util.Optional;

public class MySergeantVisitorTest extends MyVisitorTest<MySergeantVisitor> {

  public MySergeantVisitorTest() {
    super(new MySergeantVisitor(), Optional.empty(), Optional.of("Hello sergeant"),
        Optional.empty());

  }

}
