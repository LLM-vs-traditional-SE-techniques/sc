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


public class CodexTest_0_9_46 { 
  @Test
    public void testIndexOfContains() {
        MockSerializationStreamReader reader = new MockSerializationStreamReader();
        reader.prepareToRead("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
        reader.readString();
        IncompatibleRemoteServiceException_FieldSerializer.instantiate(reader);
        reader.finish();
        assertEquals("Expected no reader calls", 0, reader.getLog().length());
    }
}