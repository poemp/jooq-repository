package org.poem.pagingsort;

import org.poem.data.RepositoryImpl;
import org.poem.data.domain.PageImpl;
import org.poem.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;


/**
 * find and sort
 * @author poem
 */
public class PagingAndSortingRepositoryImpl<T extends TableRecordImpl<T>, ID extends Serializable> extends RepositoryImpl<T, ID> {


    /**
     * 分页查询
     * @param pageable  分页信息
     * @param <S>
     * @return
     */
    <S extends T> PageImpl<S> findAll(Pageable pageable){

    }


    /**
     * 条件分页查询
     * @param conditions 条件
     * @param pageable 分页信息
     * @param sortFields 排序
     * @param <S>
     * @return
     */
    <S extends T> PageImpl<S> findConditionPageSorting(List<Condition> conditions, Pageable pageable){

    }
}
