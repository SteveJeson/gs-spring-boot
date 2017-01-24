package business.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by jason on 2017/1/24.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
