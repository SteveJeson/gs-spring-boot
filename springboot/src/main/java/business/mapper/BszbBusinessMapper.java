package business.mapper;

import business.model.BszbBusiness;
import business.util.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jason on 2017/2/3.
 */
public interface BszbBusinessMapper extends MyMapper<BszbBusiness> {
    @Select("select * from BSZB_BUSINESS")
    public List<BszbBusiness> findAll();
}
