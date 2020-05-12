package top.xinfeibook.springbootjpaandthymeleaf.service;

import top.xinfeibook.springbootjpaandthymeleaf.model.User;

import java.util.List;

/**
 * @author ChenFeiyang
 * @email 234150476@qq.com
 * @date 2020/5/12 20:05
 */
public interface UserService {
    /**
     * 获取全部用户数据
     * @return
     */
    public List<User> getUserList();

    /**
     * 新增用户数据
     * @param user
     */
    public void createUser(User user);

    /**
     * 获取指定id用户信息
     * @param id
     * @return
     */
    public User getUser(Long id);

    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     */
    public void updateUser(Long id,User user);

    /**
     * 删除指定id用户
     * @param id
     */
    public void deleteUser(Long id);

}
