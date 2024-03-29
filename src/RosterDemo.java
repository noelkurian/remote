import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

/**
 * courtesy of http://www.adarshr.com/papers/xmpp2
 * 
 * @author joel
 *
 */
public class RosterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create XMPP connection to gmail.com server
		XMPPConnection connection = new XMPPConnection("gmail.com");

		try {
			// Connect
			connection.connect();

			// Login with appropriate credentials
			connection.login("username", "password");

			// Get the user's roster
			Roster roster = connection.getRoster();

			// Print the number of contacts
			System.out.println("Number of contacts: " + roster.getEntryCount());

			// Enumerate all contacts in the user's roster
			for (RosterEntry entry : roster.getEntries()) {
				System.out.println("User: " + entry.getUser());
			}
		} catch (XMPPException e) {
			// Do something better than this!
			e.printStackTrace();
		}

	}

}
