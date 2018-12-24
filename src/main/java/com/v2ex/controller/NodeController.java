package com.v2ex.controller;

import com.v2ex.bo.NodeBO;
import com.v2ex.entity.Node;
import com.v2ex.service.NodeService;
import com.v2ex.vo.CommonResponseVO;
import com.v2ex.vo.NodeVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: liuhao
 * @Date: 2018/12/21 16:38
 * @Description:
 */
@RestController
@RequestMapping("/node")
public class NodeController {


    @Autowired
    private NodeService nodeService;

    @PostMapping
    public CommonResponseVO save(@RequestBody NodeBO nodeBO) {
        CommonResponseVO vo = new CommonResponseVO();
        Node node = new Node();
        BeanUtils.copyProperties(nodeBO,node);
        int save = nodeService.save(node);
        if (save > 0) {
            vo.setCode(0);
            vo.setMessage("ok");
            return vo;
        }
        vo.setCode(-1);
        vo.setMessage("error");
        return vo;
    }

    @GetMapping
    public CommonResponseVO<List<NodeVO>> findNodeByCategory(@RequestParam("categoryId")Integer categoryId) {
        CommonResponseVO vo = new CommonResponseVO();
        List<Node> list = nodeService.findNodeByCategory(categoryId);
        if (list != null && list.size() > 0) {
            List<NodeVO> nodeVOList = new ArrayList<>();
            for (Node node:list) {
                NodeVO nodeVO = new NodeVO();
                BeanUtils.copyProperties(node,nodeVO);
                nodeVOList.add(nodeVO);
            }
            vo.setCode(0);
            vo.setMessage("ok");
            vo.setData(nodeVOList);
            return vo;
        }
        vo.setCode(0);
        vo.setMessage("ok");
        return vo;
    }
}
