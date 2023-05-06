import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_15 { 
  @Test
        public String getMessage(String messageKey, String defaultValue) {
        String messagePlaceholderPrefix = config.getProperty(PREFIX_PLACEHOLDER);
        String messageText = bundle.getString(messageKey);
        if (messageText == null) {
            if (defaultValue != null) {
                messageText = defaultValue;
            } else {
                messageText = bundle.getString(messageKey);
                if (messageText == null) {
                    if (!GWT.isClient()) {
                        LOGGER.debug("Could not locate message in bundle [" + bundleName + "]: Message " + messageKey + " does not exist");
                        assertTrue(GWT.isClient());
                    } else {
                        throw new IllegalArgumentException("Could not locate message in bundle [" + bundleName + "]: Message " + messageKey + " does not exist");
                    }
}