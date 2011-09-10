 
package de.hoelting.sportmanager.develop.navigation;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import net.miginfocom.swt.MigLayout;

import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class DevelopNavigation {

	@Inject
	private Logger logger;

	private final Composite parent;


	@PostConstruct
	public void buildUI() {
		logger.info(LogMessages.DevelopNavigation_initUI);
		final MigLayout layout = new MigLayout("","0[grow,fill]0", "0[grow,fill]0");

		parent.setLayout(layout);
		TreeViewer tree = new TreeViewer(parent);
		tree.setContentProvider(new DevelopNavigationTreeContentProvider());
		tree.setInput(TreeContent.createTreeContent());
		parent.layout(true, true);
	}

	
	@Inject
	public DevelopNavigation(Composite parent) {
		// the following is standard SWT Stuff
		this.parent = parent;
	}
	
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
}