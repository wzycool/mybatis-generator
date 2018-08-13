package com.qikenet.build;

import java.util.List;

/**
 * @Author: zhengyi.wang
 * @Date: 2018/8/6/006 10:30
 */
public interface BaseDao<T> {
    List<T> selectList(T record);

    int selectListCount(T record);

    <T> T selectByPrimaryKey(T record);

    void deleteByPrimaryKey(Long id);

    void deleteSelective(T record);

    void insert(T record);

    void insertSelective(T record);

    void updateSelectiveByPrimaryKey(T record);

    void selectOne(T record);
}
