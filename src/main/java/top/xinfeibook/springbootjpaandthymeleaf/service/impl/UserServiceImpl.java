package top.xinfeibook.springbootjpaandthymeleaf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xinfeibook.springbootjpaandthymeleaf.dao.UserRepository;
import top.xinfeibook.springbootjpaandthymeleaf.model.User;
import top.xinfeibook.springbootjpaandthymeleaf.service.UserService;

import java.util.List;
import java.util.Optional;

/**
 * @author ChenFeiyang
 * @email 234150476@qq.com
 * @date 2020/5/12 20:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    /**
     * 获取全部用户数据
     * @return
     */
    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }
    /**
     * 新增用户数据
     * @param user
     */
    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    @Override
    public User getUser(Long id) {
        return userRepository.getOne(id);
    }
    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     */
    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userRepository.saveAndFlush(user);
    }
    /**
     * 删除指定id用户
     * @param id
     */
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
