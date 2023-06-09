package labcodeinspection;

/**
 * Esta es la clase de email
 */
public class Email {
	

	/**
	 * Esta variable almacena el nomrbe
	 */
	private final String m_firstName; // primer nombre
	/**
	 * Esta variable almacena el apllido
	 */
	private final String m_lastName;
	/**
	 * Esta variable almacena la contraseña.
	 */
	private String password;
	/**
	 * Esta variable almacena deprtamento.
	 */
	private String department;
	/**
	 * Esta variable dice el tamaño de la password.
	 */
	private int defaultpasswordLength = 8;
	/**
	 * Esta variable almacena la dirección de correo electrónico del usuario.
	 */
	private String email;
	/**
	 * cosntructor de clase email
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	/**
	 * metodo par mostrar información.
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * metodo set para elegir departamento Departamento.
	 */

	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "unknown";
			break;
		}
	}


	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return String.valueOf(password);
	}
	/**
	 * metodo vacio para generar email.
	 */

	public void generateEmail() {
	    this.password = this.randomPassword(this.defaultpasswordLength);
	    Locale locale = Locale.getDefault();
	    this.email = this.m_firstName.toLowerCase(locale) + this.m_lastName.toLowerCase(locale) + "@" + this.department
	            + ".espol.edu.ec";
	}

