package com.demo.database.mapper;

import com.demo.database.data.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    public List<User> queryAll() throws Exception;

    @Select("select * from user where username= #{username} and password= #{password}")
    public User queryByLogin(@Param("username") String username,
                             @Param("password") String password) throws Exception;
}
