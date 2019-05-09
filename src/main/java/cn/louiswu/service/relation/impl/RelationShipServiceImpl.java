package cn.louiswu.service.relation.impl;

import cn.louiswu.dao.RelationShipDao;
import cn.louiswu.service.relation.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
