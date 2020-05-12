package top.xinfeibook.springbootjpaandthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.xinfeibook.springbootjpaandthymeleaf.model.User;

/**
 * @author ChenFeiyang
 * @email 234150476@qq.com
 * @date 2020/5/12 20:02
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据姓名找User实体
     * @param name
     * @return
     */
    User findByName(String name);

    /**
     * 根据姓名和年龄找对应的User实体
     * @param name
     * @param age
     * @return
     */
    User findByNameAndAge(String name,Integer age);
}
