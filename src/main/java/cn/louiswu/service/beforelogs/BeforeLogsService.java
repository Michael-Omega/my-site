package cn.louiswu.service.beforelogs;

import cn.louiswu.model.BeforeLogsDomain;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;
import java.util.List;

public interface BeforeLogsService {

    PageInfo<BeforeLogsDomain> getBeforeList(Integer page, Integer size);

    void insertBefore(BeforeLogsDomain beforeLogsDomain);


}
