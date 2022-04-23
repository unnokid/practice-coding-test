package leetcode;

import java.util.HashMap;
import java.util.Map;

public class EncodeandDecodeTinyURL {
    public class Codec {

        String url = "http://tinyurl.com/";
        Map<String, String> map = new HashMap<>();
        //각기 다른 key값을 계속적으로 가져야함 map.size이용
        public String encode(String longUrl) {
            String key = url+(map.size()+1);
            map.put(key, longUrl);
            //return하는 키는 결국 shorturl
            return key;
        }

        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }
    }
}
