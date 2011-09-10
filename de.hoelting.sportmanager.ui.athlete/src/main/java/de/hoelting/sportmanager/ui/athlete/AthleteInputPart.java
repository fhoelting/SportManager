package de.hoelting.sportmanager.ui.athlete;
 


import javax.inject.Inject;
import javax.annotation.PostConstruct;

import net.miginfocom.swt.MigLayout;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class AthleteInputPart {

	protected Composite parent;
	protected Label aliasLable;
	private Label firstNameLable;
	private Label lastNameLable;
	private Text aliasText;
	private Text firstNameText;
	private Text lastNameText;
	
	@Inject
	public AthleteInputPart(Composite parent) {
		this.parent = parent;
	}
	
	@PostConstruct
	public void postConstruct() {
		MigLayout layout = new MigLayout("wrap","[right]20[left,grow][min!][min!]50","");
		parent.setLayout(layout);
		
		aliasLable = new Label(parent, SWT.NONE);
		aliasLable.setText("alias:");
		aliasText = new Text(parent, SWT.NONE);
		aliasText.setLayoutData("span 3, growx, wrap");
		
		firstNameLable = new Label(parent, SWT.NONE);
		firstNameLable.setText("first name:");
		firstNameText = new Text(parent, SWT.NONE);
		firstNameText.setLayoutData("span 3, growx, wrap");

		lastNameLable = new Label(parent, SWT.NONE);
		lastNameLable.setText("last name:");
		lastNameText = new Text(parent, SWT.NONE);
		lastNameText.setLayoutData("span 3, growx, wrap");

		
	}
	
	
	
	@Focus
	public void onFocus() {
		//TODO Your code here
	}
	
	
	@Persist
	public void save() {
		//TODO Your code here
	}
	
}