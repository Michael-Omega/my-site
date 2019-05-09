package cn.louiswu.controller.admin;

import cn.louiswu.controller.BaseController;
import cn.louiswu.model.AboutDomain;
import cn.louiswu.service.about.AboutService;
import cn.louiswu.utils.APIResponse;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


@Controller
@RequestMapping("/about")
public class AboutConntroller extends BaseController {

    @Resource
    private AboutService aboutService;

    /**
     * 列表关于
     */
    @RequestMapping("/getAboutList")
    @ResponseBody
    public APIResponse getAboutList(@RequestParam(name = "page",defaultValue = "1") Integer page, @RequestParam(name = "limit",defaultValue = "2")Integer limit){
        APIResponse apiResponse = new APIResponse();
        PageInfo<AboutDomain> aboutDomains = aboutService.getAboutList(page,limit);
        apiResponse.setCode("1");
        apiResponse.setMsg("success");
        apiResponse.setData(aboutDomains);
        return apiResponse;
    }

    @RequestMapping("/getAbout")
    @ResponseBody
    public APIResponse getAbout(){
        APIResponse apiResponse = new APIResponse();
        AboutDomain aboutDomain = aboutService.getAbout();
        apiResponse.setCode("1");
        apiResponse.setMsg("success");
        apiResponse.setData(aboutDomain);
        return apiResponse;
    }


}
