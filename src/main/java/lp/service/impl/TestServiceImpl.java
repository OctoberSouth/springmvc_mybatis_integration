package lp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lp.dao.TestMapper;
import lp.exception.BusinessException;
import lp.po.Test;
import lp.service.TestService;

@Service(value = "testService")
public class TestServiceImpl implements TestService {

	@Resource(name = "testMapper")
	TestMapper testMapper;

	@Override
	public int insert(Integer id) throws Exception {
		System.err.println("id=" + id);
		System.err.println(this.testMapper.insert(new Test()));
		if(id == 1){
			throw new BusinessException("服务器错误，请联系管理员");
		}
		return 0;
	}

}
