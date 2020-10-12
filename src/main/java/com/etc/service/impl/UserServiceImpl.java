package com.etc.service.impl;

import com.etc.dao.UserDao;
import com.etc.enetity.User;
import com.etc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao u;
    @Override
    public User getUserById(Integer uid) {
        Optional<User> optional=u.findById(uid);
        if(optional.isPresent()){
            return  optional.get();
        }
        return null;
    }
}
