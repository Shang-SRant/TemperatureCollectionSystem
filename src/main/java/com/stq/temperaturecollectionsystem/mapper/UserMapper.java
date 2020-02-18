package com.stq.temperaturecollectionsystem.mapper;


import com.stq.temperaturecollectionsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();

    User queryUserById(int uid);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int uid);
}
