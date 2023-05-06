import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
  @Test
  public void testOptionWithArgAndLongOpt() throws CmdLineException {
        Arg<Double> money = Arg.create();
        optionsBuilder = new OptionsBuilder();
        parser = new CmdLineParser(this);
        parser.parseArgument("--double", "3.14");
        assertThat(money.getValue(), is(3.14));
    }
}