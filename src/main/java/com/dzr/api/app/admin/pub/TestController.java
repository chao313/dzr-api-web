package com.dzr.api.app.admin.pub;

import com.dzr.api.vo.SignIn;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.BeanParam;


@Api(value = "Sign-In-API", produces = "application/json")
@Controller
@RequestMapping(value = "/admin", produces = "application/json")
public class TestController {

    @ApiOperation(value = "登录", notes = "登录")
    @RequestMapping(value = "/token", method = RequestMethod.POST)
    @ResponseBody
    public String createToken(
            @ApiParam(value = "登录信息") @BeanParam SignIn signIn) {

        return "true";
    }

    @ApiOperation(value = "登录", notes = "登录")
    @RequestMapping(value = "/sign", method = RequestMethod.GET)
    @ResponseBody
    public String ttt() {

        return "true";
    }

    @ApiOperation(value = "登出", notes = "登出")
    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    @ResponseBody
    public String signOut() {

        return "登出成功";
    }

}
