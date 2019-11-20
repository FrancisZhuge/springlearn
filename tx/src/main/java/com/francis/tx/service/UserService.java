package com.francis.tx.service;

import com.francis.tx.entity.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hzzhugequn@corp.netease.com
 */
@Transactional(propagation = Propagation.REQUIRED)
public interface UserService {

    void save(User user) throws Exception;
}
