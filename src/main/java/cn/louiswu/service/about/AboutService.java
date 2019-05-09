package cn.louiswu.service.about;


import cn.louiswu.dao.AboutDomainMapper;
import cn.louiswu.model.AboutDomain;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 关于服务层
 */
public interface AboutService {

    /**
     * 获取所有首页关于信息
     */
    PageInfo<AboutDomain> getAboutList(Integer page, Integer limit);

    /**
     * 查询排序值为1的信息
     * @return
     */
    AboutDomain getAbout();

    /**
     * 删除关系信息
     */
    void deleteAbout(Integer id);

    /**
     * 新增关于信息
     */
    void insertAbout(AboutDomain aboutDomain);

    /**
     * 修改关于信息
     */
    void updateAbout(AboutDomain aboutDomain);


}
