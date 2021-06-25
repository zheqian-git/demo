package com.example.demo.service;

import com.example.demo.domain.CharitySchool;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.request.DemoReq;

import java.util.List;

/**
 * <p>
 * 公益学堂 服务类
 * </p>
 *
 * @author qianzz
 * @since 2021-06-25
 */
public interface ICharitySchoolService extends IService<CharitySchool> {

    List<CharitySchool> queryCharitySchoolList(DemoReq req);
}
