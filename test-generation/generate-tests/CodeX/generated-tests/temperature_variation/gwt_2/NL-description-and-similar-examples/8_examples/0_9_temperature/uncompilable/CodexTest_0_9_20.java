import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_20 { 
  @Test
  public void testDoNotOverrideDefaultUncaughtExceptionHandler() {
    @SuppressWarnings("deprecation")
    final GWT.UncaughtExceptionHandler originalUeh = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new GWT.UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEveryoneHasSameException(e);
        GWT.setUncaughtExceptionHandler(originalUeh);
      }
    });
    RootPanel.get().add(new Button("Test", new ClickHandler() {
      @Override
      public void onClick(ClickEvent e) {
        throw new RuntimeException("Exception from test code");
      }
    }));
    // Fake a click.
    RootPanel.get().getWidget(0).onBrowserEvent(Document.get().createClickEvent(1, 1, 1, 1, 1, false, false, false, false));
  }
}