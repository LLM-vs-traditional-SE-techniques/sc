import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
    public voiDd removeIntHandler(LValue l, IRubyObject receiver, RubyFixnum off, RubyFixnum len) {
        Ruby runtime = l.getRuntime();
        Object obj = receiver.dataGetStruct();
        if (obj == null) throw new LExc(l, runtime, "uninitialized stream");
        Stream o = (Stream) obj;
        try {
            o.remove(off.intValue(), len.intValue());
        } catch (IOException ex) {
            throw new LExc(l, runtime, ex.toString());
        }
    }
}