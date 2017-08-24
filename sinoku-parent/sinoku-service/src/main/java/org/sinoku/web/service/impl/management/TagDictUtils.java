package org.sinoku.web.service.impl.management;


import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来导出产品要求的数据统计
 * Created by ao.shen on 2017/7/18.
 */
public class TagDictUtils {

    public static Map<String,String> tags = new HashMap<String, String>();

    public static Map<String,Integer> nums = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {

        String str = "";
        try {
            BufferedReader bre = null;

            String file = "/Users/ao.shen/Desktop/asdf.txt";

            bre = new BufferedReader(new FileReader(file));//此时获取到的bre就是整个文件的缓存流
            FileWriter fw = new FileWriter("/Users/ao.shen/Desktop/hehe.txt");
            while ((str = bre.readLine()) != null) // 判断最后一行不存在，为空结束循环
            {
                if("{}".equalsIgnoreCase(str)||StringUtils.isEmpty(str)){
                    continue;
                }
                JSONObject jsonObject = JSONObject.parseObject(str);

                for (Map.Entry<String, Object> entry : jsonObject.entrySet()) {
                    if(tags.containsKey(entry.getKey())){
                        Integer _i = nums.get(entry.getKey());
                        nums.put(entry.getKey(),_i+1);
                    }else{
                        tags.put(entry.getKey(),String.valueOf(entry.getValue()));
                        nums.put(entry.getKey(),1);
                    }

                }

            }

            for (Map.Entry<String, Integer> entry : nums.entrySet()) {
                System.out.println(tags.get(entry.getKey())+":"+String.valueOf(entry.getValue()));
                fw.write(tags.get(entry.getKey())+","+String.valueOf(entry.getValue())+"\n");
            }
            fw.close();
        }catch (Exception e){
            System.out.println(str);
            e.printStackTrace();
        }
    }
}
