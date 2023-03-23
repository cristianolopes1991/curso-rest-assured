package br.ce.wcaquino.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class OlaMundo {

    public static void main(String[] args) {
        var response = RestAssured.request(Method.GET, "https://restapi.wcaquino.me/ola");
        System.out.println(response.getBody().asString());
        System.out.println(response.statusCode());

    }
}
