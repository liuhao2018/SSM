package com.ssm.Mapper;

import com.ssm.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> list();
}
