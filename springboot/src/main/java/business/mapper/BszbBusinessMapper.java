package business.mapper;

import business.model.BszbBusiness;
import business.util.MyMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by jason on 2017/2/3.
 */
public interface BszbBusinessMapper extends MyMapper<BszbBusiness> {
    @Select("select * from BSZB_BUSINESS")
    @Results({
            @Result(id=true,property = "businessUuid",column = "BUSINESS_UUID"),
            @Result(property = "businessCusname",column = "BUSINESS_CUSNAME"),
            @Result(property = "businessNo",column = "BUSINESS_NO")
    })
    public List<BszbBusiness> findAll();
}
