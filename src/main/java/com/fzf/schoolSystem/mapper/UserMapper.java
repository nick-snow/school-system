package com.fzf.schoolSystem.mapper;

import com.fzf.schoolSystem.domain.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("username") String username);
}
