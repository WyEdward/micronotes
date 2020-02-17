package cn.wyedward.dao;

import cn.wyedward.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {
    /**
     * 根据主键id删除博客
     * @param blogId
     * @return
     */
    int deleteByPrimaryKey(Integer blogId);

    /**
     * 插入博客
     * @param record
     * @return
     */
    int insert(Blog record);

    /**
     * 有选择性的插入博客
     * @param record
     * @return
     */
    int insertSelective(Blog record);

    /**
     * 根据主键查找博客
     * @param blogId
     * @return
     */
    Blog selectByPrimaryKey(Integer blogId);

    /**
     * 有选择性的更新博客
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Blog record);

    /**
     * 更新博客通过主键
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(Blog record);

    /**
     *  更新博客
     * @param record
     * @return
     */
    int updateByPrimaryKey(Blog record);
}