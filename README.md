# springmvc_mybatis_integration
采用maven的springmvc和mybatis的整合
数据采用aes加密，请求统一走一个入口
统一请求入口为http://localhost/mainController/mainForward?fields=fields，采用post请求
fields为前台传输数据，同样需采用aes加密
统一返回json数据格式
