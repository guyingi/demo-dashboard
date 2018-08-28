package gu.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import gu.dao.IptableDao;
import gu.pojo.GirlProperties;
import gu.pojo.Iptable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WeiGuangWu
 * @version V1.0
 * @Package gu.controller
 * @Description: ${todo}
 * @date 2018/8/28 10:56
 */
@RestController
public class IpTableController {

    @Autowired
    IptableDao iptableRepo;

    @Autowired
    GirlProperties girlProperties;

    @RequestMapping(value="girl",method = RequestMethod.GET)
    public GirlProperties getGirl() {
//        return  iptableRepo.findAll();
        System.out.println("hhhhh"+girlProperties.getName());
        return girlProperties;
    }

    @RequestMapping(value="ip",method = RequestMethod.GET)
    public JSONArray getIp() {
        List<Iptable> list = iptableRepo.findAll();
        JSONArray arr = new JSONArray();
        JSONObject obj;
        for(Iptable e : list){
            obj = new JSONObject();
            obj.put("value",e.getUpstreamPort());
            obj.put("name",e.getUpstreamIp());
            arr.add(obj);
        }
        return arr;
    }
}
