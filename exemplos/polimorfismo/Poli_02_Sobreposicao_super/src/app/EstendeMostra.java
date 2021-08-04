package app;
public class EstendeMostra extends SuperMostra {

	public String str = "estendeStr";

	@Override
	public void mostra() {
		System.out.println("EstendeMostra :  " + str);
	}

	public void mostra2() {
		super.mostra();
		this.mostra();
	}

	@Override
	public String toString() {
		return str;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		EstendeMostra c = new EstendeMostra();
		c.str = new String(this.str);
		return c;
	}

}
