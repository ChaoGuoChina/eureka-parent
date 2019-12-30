package com.forezp.eurekaclienttwo.mapper;

import com.forezp.eurekaclienttwo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where phone = #{phone}")
    User findUserByPhone(@Param("phone") String phone);

    @Insert("insert into t_user(phone,password,user_name) values(#{phone},#{password},#{name})")
    int insert(@Param("phone") String phone,@Param("password") String password,@Param("name") String name);

}
