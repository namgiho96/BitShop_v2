package domain;

public class MemberBean {
	private String id, name, pass, snn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSsn() {
		return snn;
	}

	public void setSsn(String snn) {
		this.snn = snn;
	}

	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", name=" + name + ", pass=" + pass + ", snn=" + snn + "]";
	}
	
	
}
