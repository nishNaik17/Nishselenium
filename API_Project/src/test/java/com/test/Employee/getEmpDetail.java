package com.test.Employee;

import com.google.gson.Gson;
import com.pojo.response.empDetail;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class getEmpDetail {

    Gson gson = new Gson();
    @Test
    @Parameters({"baseUrl","basePath","errorStatus","errorMsg"})
    public void getEmp(String baseUrl,String basePath,String errorStatus,String errorMsg){
        RestAssured.baseURI = baseUrl;
        RequestSpecification httpRequest = RestAssured.given();
        Response getResp = httpRequest.request(Method.GET,basePath);
        String json = getResp.getBody().toString();
        empDetail emp = gson.fromJson(json,empDetail.class);
        
    }
}
