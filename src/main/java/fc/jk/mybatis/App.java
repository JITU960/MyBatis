package fc.jk.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import fc.jk.mybatis.DBMapper.UserKycMapper;
import fc.jk.mybatis.model.UserKyc;
import fc.jk.mybatis.utils.DbMan;

public class App 
{
    public static void main( String[] args)
    {
    	SqlSessionFactory ssf = DbMan.getSqlSessionFactory();
    	SqlSession sqlSession = ssf.openSession();
    	UserKycMapper ukm = sqlSession.getMapper(UserKycMapper.class);
    	UserKyc uk = ukm.getData(1);
    	System.out.println(uk);
    }
}
