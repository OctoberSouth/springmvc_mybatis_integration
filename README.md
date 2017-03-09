# springmvc_mybatis_integration
采用maven的springmvc和mybatis的整合<br>
数据采用aes加密，请求统一走一个入口<br>
统一请求入口为http://localhost/mainController/mainForward?fields=fields，采用post请求<br>
fields为前台传输数据，同样需采用aes加密<br>
统一返回json数据格式<br>
MainController里面还有一些问题，没有做forward找不到的解决<br>
