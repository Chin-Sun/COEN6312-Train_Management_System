package Class;

import java.util.ArrayList;
import java.util.List;

public class Administrator {

	private int Id;

	private boolean isBackingUp = false;
	private boolean isRestoring = false;
	private boolean isAccountsManaged = false;

	public Administrator(int Id) {
		this.Id = Id;
	}

	public int getId() {
		return Id;
	}


	public void setId(int Id) {
		this.Id = Id;
	}


	public synchronized void backupSystem() {
		if (isRestoring) {
			throw new IllegalStateException("Cannot backup while system is being restored.");
		}
		try {
			isBackingUp = true;

		} finally {
			isBackingUp = false;
		}
	}
	public synchronized void restoreSystem() {
		if (isBackingUp) {
			throw new IllegalStateException("Cannot restore while system is being backed up.");
		}
		try {
			isRestoring = true;
			// Code to restore the system...
		} finally {
			isRestoring = false;
		}
	}
		public synchronized void manageAccounts(){
			isAccountsManaged = true;
			System.out.println(Id + " manages accounts.");
		}

	}