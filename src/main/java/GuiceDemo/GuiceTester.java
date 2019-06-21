package GuiceDemo;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class GuiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		  Injector  injector = Guice .createInjector(new TextEditorModule());
	      TextEditor editor = injector.getInstance(TextEditor.class);
	      editor.makeSpellCheck(); 

	}

}

