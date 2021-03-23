package xyz.zfdu.boot.jdbc.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zfdu
 * @description
 * @data 2021-03-23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    public  static  AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        return  ajaxResponse;
    }
    public  static  AjaxResponse success(Object obj) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(obj);
        return  ajaxResponse;
    }




    public static AjaxResponse failure(String message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(5001);
        ajaxResponse.setMessage(message);
        return ajaxResponse;
    }

}
