package de.hoelting.sportmanager.product.sportmanager;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.hoelting.sportmanager.product.sportmanager.messages"; //$NON-NLS-1$
	public static String AboutHandler_message;
	public static String AboutHandler_title;
	public static String QuitHandler_confirmation;
	public static String QuitHandler_question;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
