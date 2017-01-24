package business.service;

import business.model.UserInfo;

import java.util.List;

/**
 * Created by jason on 2017/1/24.
 */
public interface UserInfoService {
    /**
     * 查询所有用户
     * @param userInfo
     * @return
     */
    public List<UserInfo> getAll(UserInfo userInfo);

    /**
     * 按ID查询用户
     * @param id
     * @return
     */
    public UserInfo getById (Integer id);

    /**
     * 按ID删除用户
     * @param id
     */
    public void deleteById (Integer id);

    /**
     * 保存用户
     * @param userInfo
     */
    public void save (UserInfo userInfo);

}
