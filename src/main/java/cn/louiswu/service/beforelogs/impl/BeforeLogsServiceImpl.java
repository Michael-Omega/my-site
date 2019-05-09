package cn.louiswu.service.beforelogs.impl;

import cn.louiswu.dao.BeforeLogsDomainMapper;
import cn.louiswu.model.BeforeLogsDomain;
import cn.louiswu.service.beforelogs.BeforeLogsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BeforeLogsServiceImpl implements BeforeLogsService {

    @Resource
    private BeforeLogsDomainMapper beforeLogsDomainMapper;
    @Override
    public PageInfo<BeforeLogsDomain> getBeforeList(Integer page,Integer size) {
        PageHelper.startPage(page,size);
        List<BeforeLogsDomain> beforeLogsDomains =  beforeLogsDomainMapper.selectBeforeLogsList();
        System.out.println(beforeLogsDomains);
        PageInfo<BeforeLogsDomain> beforeLogsDomainsInfo = new PageInfo<>(beforeLogsDomains);
        System.out.println(beforeLogsDomainsInfo);
        return beforeLogsDomainsInfo;
    }

    @Override
    public void insertBefore(BeforeLogsDomain beforeLogsDomain) {
        beforeLogsDomainMapper.insertSelective(beforeLogsDomain);

    }
}
