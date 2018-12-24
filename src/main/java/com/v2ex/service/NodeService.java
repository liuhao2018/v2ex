package com.v2ex.service;

import com.v2ex.entity.Node;
import com.v2ex.mapper.NodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:44
 * @Description:
 */
@Service
public class NodeService {


    @Autowired
    private NodeMapper nodeMapper;

    public int save(Node node) {
        node.setCreateDate(new Date());
        return nodeMapper.insertSelective(node);
    }

    public List<Node> findNodeByCategory(Integer categoryId) {
        return nodeMapper.findNodeByCategory(categoryId);
    }

}
