package com.fkhwl.template.provider;


import com.fkhwl.scf.third.service.AnxinSignService;
import com.fkhwl.starter.test.FkhBaseTest;
import com.fkhwl.starter.test.FkhBootTest;

import org.junit.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
@SpringBootConfiguration
@SpringBootTest
@FkhBootTest
public class AnxinSignAPIServiceTest extends FkhBaseTest {

    @Resource
    private AnxinSignService anxinSignService;



    @Test
    public void test_sign() {
        String companySeal = "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";

        String driverSeal = "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";
        String filePath = "D:/developer/CSDemo/java/file/1569830767381_1065_1846_2_.pdf";
        Map<String, Object> txtFields = new HashMap<>();
        txtFields.put("projectId", 21);
        txtFields.put("userId", 222);

        Map<String, Object> res = anxinSignService.multiSign(filePath, "99306903952C7D41E05311016B0A56D4", companySeal, "111", driverSeal, txtFields);
        for (Object value : res.values()) {
            System.out.println(value);
        }
    }

    public void test_addCompanyAccount() {
//        SigningCompanyDTO signingCompany = new SigningCompanyDTO();
//        signingCompany.setBusinessLicenseNo("915100002018938457");
//        signingCompany.setCompanyName("新希望集团有限公司");
//        signingCompany.setIdCardNo("330781198509070714");
//        signingCompany.setRegisterName("刘永");
//
//        anxinSignService.addCompanyAccount(signingCompany);
    }

    @Test
    public void test_addPersonAccount() {
//       String accountId =  anxinSignService.addPersonAccount("张丹丹", "110102200001071156", "13739484373");
//        System.out.println("accountId:"+accountId);
    }

}
