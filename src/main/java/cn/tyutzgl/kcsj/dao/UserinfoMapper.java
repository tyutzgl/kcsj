package cn.tyutzgl.kcsj.dao;

import cn.tyutzgl.kcsj.pojo.Userinfo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}