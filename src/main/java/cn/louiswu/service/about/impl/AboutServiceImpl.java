package cn.louiswu.service.about.impl;

import cn.louiswu.dao.AboutDomainMapper;
import cn.louiswu.model.AboutDomain;
import cn.louiswu.service.about.AboutService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 关于服务层实现层
 */
@Service
public class AboutServiceImpl implements AboutService {

    @Resource
    private AboutDomainMapper aboutDomainMapper;

    @Override
    public PageInfo<AboutDomain> getAboutList(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<AboutDomain> aboutDomains = aboutDomainMapper.selectList();
        PageInfo<AboutDomain> pageInfo = new PageInfo<>(aboutDomains);
        return pageInfo;
    }

    @Override
    public AboutDomain getAbout() {
        return aboutDomainMapper.selectByPrimaryKey();
    }

    @Override
    public void deleteAbout(Integer id) {
        aboutDomainMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertAbout(AboutDomain aboutDomain) {
        aboutDomainMapper.insertSelective(aboutDomain);
    }

    @Override
    public void updateAbout(AboutDomain aboutDomain) {
        aboutDomainMapper.updateByPrimaryKeySelective(aboutDomain);
    }
}
