package business.service.impl;

import business.mapper.UserInfoMapper;
import business.model.UserInfo;
import business.service.UserInfoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by jason on 2017/1/24.
 */
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAll(UserInfo userInfo) {
        if (userInfo.getPage() != null && userInfo.getRows() != null) {
            PageHelper.startPage(userInfo.getPage(), userInfo.getRows());
        }
        return userInfoMapper.selectAll();
    }

    @Override
    public UserInfo getById(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public void deleteById(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void save(UserInfo userInfo) {
        if (userInfo.getId() != null) {
            userInfoMapper.updateByPrimaryKey(userInfo);
        } else {
            userInfoMapper.insert(userInfo);
        }
    }
}
