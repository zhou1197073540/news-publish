//package com.kinghonor.yase.test;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//
//public class TestJson {
//    public static void main(String[] args) {
//        String str="{\"switchInstance\":{\"switchIp\":\"192.168.149.15\",\"switchPublicIp\":\"192.168.149.15\",\"switchId\":\"109\",\"switchName\":\"192.168.149.15\",\"switchPlace\":\"\",\"switchConnectPwd\":\"ClueCon\",\"switchConnectPort\":\"8021\"}}";
//
//
//        JSONObject strJson = JSONObject.parseObject(str);
//        JSONArray array = JSONArray.parseArray(strJson.getString("switchInstance"));
//        for (int i = 0; i < array.size(); i++) {
////            SwitchInstance instance = new SwitchInstance();
//            JSONObject json = JSONObject.parseObject(array.get(i).toString());
//            String ss=json.getString("switchConnectPwd");
//            Integer ss1=json.getInteger("switchConnectPort");
//            String ss2=json.getString("switchName");
//            String ss3=json.getString("switchIp");
//            String ss4=json.getString("switchPlace");
//            Integer ss5=json.getInteger("switchId");
//
//            System.out.println(ss+"==="+ss1+"==="+ss2+"==="+ss3+"==="+ss4+"==="+ss5);
//        }
//    }
//}
