package persistence;

public interface MemberDAO {

	boolean join(MemberDTO mdto);
	MemberDTO login(MemberDTO mdto);

}
