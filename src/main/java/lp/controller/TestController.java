package lp.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lp.service.TestService;
import lp.utils.EncryptUtils;
import lp.utils.Json;

@Controller
@RequestMapping("/testController")
public class TestController {

	protected static final Logger LOG = Logger.getLogger(TestController.class);

	@Resource(name = "testService")
	TestService testService;

	@RequestMapping(value = "/tese.json", method = RequestMethod.POST)
	@ResponseBody
	public Json showUser(HttpServletRequest request, HttpServletResponse response) {
		response.setHeader("Content-Type", "text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
		LOG.info("/tese.json进入");
		String id = request.getParameter("id");
		System.err.println("fields===" + request.getParameter("fields"));
		Json json = new Json();
		try {
			this.testService.insert(Integer.valueOf(id));
			json.setData(EncryptUtils.aesEncrypt("哈哈"));
			json.setReturnCode(Json.SUCCESS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			json.setMessage(e.getMessage());
			json.setReturnCode(Json.ERROR);
		}
		return json;
	}
}
