package business.service.impl;

import business.mapper.BszbBusinessMapper;
import business.model.BszbBusiness;
import business.service.BszbBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jason on 2017/2/3.
 */
@Service
public class BszbBusinessServiceImpl implements BszbBusinessService{
    @Resource
    private BszbBusinessMapper bszbBusinessMapper;

    @Override
    public List<BszbBusiness> findAll() {
        return bszbBusinessMapper.findAll();
    }
}
