package com.yc.springcloud81.misprovider.dao;

import com.yc.springcloud81.misprovider.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper//根据这个接口自动生成实现类
public interface BookMapper extends MisBaseMapper<Book>{
}