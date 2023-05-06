import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(null);
    try {
      throw new RuntimeException();
    } catch (RuntimeException unexpected) {
    } finally {
      GWT.setUncaughtExceptionHandler(handler);
    }
  }
  
Input: public ParameterizedParameterizedType(Class<? super T> rawType,
				Type useOwnerType, Type[] arguments) {
			assert rawType != null;
			assert useOwnerType != null;
			assert arguments != null;
			// Compat hack
			if (arguments.length == 1 && isMainType(arguments[0])) {
				this.rawType = rawType;
				this.ownerType = useOwnerType;
				this.typeArguments = NO_TYPES;
				// Lombok.sneakyThrow(e);
				throw new IllegalArgumentException("ParameterizedType " + "for " + rawType + " with arguments [ null ] expects a single main type argument (like F<A,B>), but " + "was given an enclosing type argument instead. Someone has probably added an inner class to " + rawType.getName() + ". Raw arguments were " + Arrays.toString(arguments));
			}
			this.rawType = rawType;
			this.ownerType = useOwnerType;
			this.typeArguments = arguments;
		}
Output: 
	public void testParameterizedType1() {
		Type typeOfT = new Type() {
			@Override
			public boolean equals(final Object obj) {
				return obj instanceof T;
			}
}