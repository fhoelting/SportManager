package de.hoelting.sportmanager.ui.athlete;

import static org.junit.Assert.fail;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(SWTBotJunit4ClassRunner.class)
public class AthleteLayoutUnitTest {

	private static SWTBot swtBot;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAthleteInputPart() {
		fail("Not yet implemented");
	}

	@Test
	public void testPostConstruct() {
		Runnable runApp = new Runnable() {
			
			@Override
			public void run() {
				Display display = new Display();
				Shell shell = new Shell();
				AthleteInputPart athleteInputPart = new AthleteInputPart(shell);

				athleteInputPart.postConstruct();
				
				shell.open();
				while(!shell.isDisposed())
					if(display.readAndDispatch())
						display.sleep();
				display.dispose();
				
			}
		};
		
		new Thread(runApp).start();
		
		swtBot = new SWTBot();
		swtBot.text(0).setText("new Content");

	}

	@Test
	public void testOnFocus() {
		fail("Not yet implemented");
	}

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

}
