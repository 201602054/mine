package dao;
/**
 * dao包全部放的是对数据库操作的规范
 * 对userinfo表增删改查的规范
 * @author Tedu
 *
 */
import java.util.List;
public interface UserInfoDao {
	//查询
	List<UserInfoDao> findAll();
	//插入
	int insert(UserInfoDao userInfoDao);
	//修改
	
	//删除
	
}
