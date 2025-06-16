/*Java Program showing working of data hiding
Getter is used to access the private data and setter is used to modify the private data only after authentication.
In simple terms, it is hiding internal data from outside users. It is used as security such that no internal data will be accessed without authentication.
An unauthorized end user will not get access to internal data. Programmatically we can implement data hiding by declaring data elements as private.*/
class Bank {
	private long CurBalance = 0;// Private data (data hiding)
	long bank_id;
	String name;
	public long get_balance(long Id)// Getter function to access private data
	{
		if (this.bank_id == Id) {
			return CurBalance;
		}
		return -1;
	}
	public void set_balance(long balance, long Id)// Setter function to modify private data
	{
		if (this.bank_id == Id) {
			CurBalance = CurBalance + balance;
		}
	}
}
public class Data_Hiding {
	public static void main(String[] args) {
		Bank _emp = new Bank();
		_emp.bank_id = 12345;
		_emp.name = "Roshan";
		_emp.set_balance(10000, 12345);
		long emp_balance = _emp.get_balance(12345);
		System.out.println("User Name"+ " " + _emp.name);
		System.out.println("Bank_ID"+ " " + _emp.bank_id);
		System.out.println("Current Balance"+ " " + emp_balance);
	}
}
