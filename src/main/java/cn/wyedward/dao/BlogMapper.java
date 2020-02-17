package cn.wyedward.dao;

import cn.wyedward.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer blogId);

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
}