package cn.wyedward.dao;

import cn.wyedward.domain.Tag;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagMapper {
    /**
     * 根据主键id删除标签
     * @param tagId
     * @return
     */
    int deleteByPrimaryKey(Integer tagId);

    /**
     * 插入标签
     * @param record
     * @return
     */
    int insert(Tag record);

    /**
     * 有选择性的插入标签
     * @param record
     * @return
     */
    int insertSelective(Tag record);

    /**
     * 根据主键查标签
     * @param tagId
     * @return
     */
    Tag selectByPrimaryKey(Integer tagId);

    /**
     * 有选择性的更新标签
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Tag record);

    /**
     * 更新标签
     * @param record
     * @return
     */
    int updateByPrimaryKey(Tag record);
}