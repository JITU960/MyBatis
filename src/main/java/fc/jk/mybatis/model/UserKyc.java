package fc.jk.mybatis.model;

public class UserKyc {
	private int id;
	private String UserId;
	private String KycState;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getKycState() {
		return KycState;
	}
	public void setKycState(String kycState) {
		KycState = kycState;
	}
	@Override
	public String toString() {
		return "UserKyc [id=" + id + ", UserId=" + UserId + ", KycState="
				+ KycState + "]";
	}
	
}
