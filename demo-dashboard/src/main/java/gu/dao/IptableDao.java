package gu.dao;

import gu.mapper.IptableMapper;
import gu.pojo.Iptable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author WeiGuangWu
 * @version V1.0
 * @Package gu.dao
 * @Description: ${todo}
 * @date 2018/8/28 11:31
 */
public interface IptableDao extends JpaRepository<Iptable,Integer> {

//    static.static SqlSessionFactory sqlSessionFactory;
//    static.static {
//        String resource = "/resources/mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//    }
//
//    public List<Iptable> listAll(){
//        final SqlSession sqlSession = sqlSessionFactory.openSession();
//        final IptableMapper mapper = sqlSession.getMapper(IptableMapper.class);
//        final Test test = mapper.selectTest(9);
//        System.out.println(test.toString());
//        sqlSession.close();
//    }
}
